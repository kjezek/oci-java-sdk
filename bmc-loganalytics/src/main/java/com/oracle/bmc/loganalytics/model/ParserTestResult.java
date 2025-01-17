/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * ParserTestResult
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ParserTestResult.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ParserTestResult {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("additionalInfo")
        private java.util.Map<String, String> additionalInfo;

        public Builder additionalInfo(java.util.Map<String, String> additionalInfo) {
            this.additionalInfo = additionalInfo;
            this.__explicitlySet__.add("additionalInfo");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("entries")
        private java.util.List<AbstractParserTestResultLogEntry> entries;

        public Builder entries(java.util.List<AbstractParserTestResultLogEntry> entries) {
            this.entries = entries;
            this.__explicitlySet__.add("entries");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("exampleContent")
        private String exampleContent;

        public Builder exampleContent(String exampleContent) {
            this.exampleContent = exampleContent;
            this.__explicitlySet__.add("exampleContent");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lines")
        private java.util.List<AbstractParserTestResultLogLine> lines;

        public Builder lines(java.util.List<AbstractParserTestResultLogLine> lines) {
            this.lines = lines;
            this.__explicitlySet__.add("lines");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("namedCaptureGroups")
        private java.util.List<String> namedCaptureGroups;

        public Builder namedCaptureGroups(java.util.List<String> namedCaptureGroups) {
            this.namedCaptureGroups = namedCaptureGroups;
            this.__explicitlySet__.add("namedCaptureGroups");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ParserTestResult build() {
            ParserTestResult __instance__ =
                    new ParserTestResult(
                            additionalInfo, entries, exampleContent, lines, namedCaptureGroups);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ParserTestResult o) {
            Builder copiedBuilder =
                    additionalInfo(o.getAdditionalInfo())
                            .entries(o.getEntries())
                            .exampleContent(o.getExampleContent())
                            .lines(o.getLines())
                            .namedCaptureGroups(o.getNamedCaptureGroups());

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

    /**
     * Additional information for the test result.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("additionalInfo")
    java.util.Map<String, String> additionalInfo;

    /**
     * The test result log entries.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entries")
    java.util.List<AbstractParserTestResultLogEntry> entries;

    /**
     * The example content.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("exampleContent")
    String exampleContent;

    /**
     * The test result log lines.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lines")
    java.util.List<AbstractParserTestResultLogLine> lines;

    /**
     * The named capture groups.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("namedCaptureGroups")
    java.util.List<String> namedCaptureGroups;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
