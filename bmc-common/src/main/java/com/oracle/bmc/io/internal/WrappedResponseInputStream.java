/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.io.internal;

import com.oracle.bmc.http.internal.ResponseHelper;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;

import javax.ws.rs.ProcessingException;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.io.InputStream;

/**
 * A wrapper over an {@link java.io.InputStream} that ensures that the delegate {@link javax.ws.rs.core.Response} is
 * closed when the delegate input stream is closed.
 */
@Slf4j
public class WrappedResponseInputStream extends InputStream {
    protected final InputStream delegate;
    protected final Response delegateResponse;

    public WrappedResponseInputStream(
            @NonNull InputStream delegate, @NonNull Response delegateResponse) {
        this.delegate = delegate;
        this.delegateResponse = delegateResponse;
    }

    @Override
    public int read() throws IOException {
        return delegate.read();
    }

    @Override
    public int read(final byte b[]) throws IOException {
        return delegate.read(b);
    }

    @Override
    public int read(final byte b[], final int off, final int len) throws IOException {
        return delegate.read(b, off, len);
    }

    @Override
    public long skip(final long n) throws IOException {
        return delegate.skip(n);
    }

    @Override
    public synchronized void mark(int readlimit) {
        delegate.mark(readlimit);
    }

    @Override
    public synchronized void reset() throws IOException {
        delegate.reset();
    }

    @Override
    public int available() throws IOException {
        return delegate.available();
    }

    @Override
    public boolean markSupported() {
        return delegate.markSupported();
    }

    @Override
    public void close() throws IOException {
        try {
            delegate.close();
        } catch (ProcessingException e) {
            LOG.debug("Exception caused while trying to close the stream", e);
        } finally {
            // When the input stream has been consumed, try also closing the wrapped response entity to free up
            // resources for the Jersey Client (e.g., a connection via a connection pool).
            ResponseHelper.closeResponseSilently(delegateResponse);
        }
    }
}
