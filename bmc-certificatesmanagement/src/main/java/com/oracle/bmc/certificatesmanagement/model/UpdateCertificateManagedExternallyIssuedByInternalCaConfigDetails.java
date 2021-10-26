/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.certificatesmanagement.model;

/**
 * The details for updating an externally managed certificate which is issued by a private certificate authority (CA).
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210224")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateCertificateManagedExternallyIssuedByInternalCaConfigDetails.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "configType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class UpdateCertificateManagedExternallyIssuedByInternalCaConfigDetails
        extends UpdateCertificateConfigDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("versionName")
        private String versionName;

        public Builder versionName(String versionName) {
            this.versionName = versionName;
            this.__explicitlySet__.add("versionName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("stage")
        private Stage stage;

        public Builder stage(Stage stage) {
            this.stage = stage;
            this.__explicitlySet__.add("stage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("csrPem")
        private String csrPem;

        public Builder csrPem(String csrPem) {
            this.csrPem = csrPem;
            this.__explicitlySet__.add("csrPem");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("validity")
        private Validity validity;

        public Builder validity(Validity validity) {
            this.validity = validity;
            this.__explicitlySet__.add("validity");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateCertificateManagedExternallyIssuedByInternalCaConfigDetails build() {
            UpdateCertificateManagedExternallyIssuedByInternalCaConfigDetails __instance__ =
                    new UpdateCertificateManagedExternallyIssuedByInternalCaConfigDetails(
                            versionName, stage, csrPem, validity);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateCertificateManagedExternallyIssuedByInternalCaConfigDetails o) {
            Builder copiedBuilder =
                    versionName(o.getVersionName())
                            .stage(o.getStage())
                            .csrPem(o.getCsrPem())
                            .validity(o.getValidity());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    @Deprecated
    public UpdateCertificateManagedExternallyIssuedByInternalCaConfigDetails(
            String versionName, Stage stage, String csrPem, Validity validity) {
        super(versionName, stage);
        this.csrPem = csrPem;
        this.validity = validity;
    }

    /**
     * The certificate signing request (in PEM format).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("csrPem")
    String csrPem;

    @com.fasterxml.jackson.annotation.JsonProperty("validity")
    Validity validity;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
