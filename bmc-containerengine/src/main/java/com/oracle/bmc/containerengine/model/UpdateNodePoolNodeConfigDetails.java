/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerengine.model;

/**
 * The size and placement configuration of nodes in the node pool.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180222")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateNodePoolNodeConfigDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class UpdateNodePoolNodeConfigDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("size")
        private Integer size;

        public Builder size(Integer size) {
            this.size = size;
            this.__explicitlySet__.add("size");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
        private java.util.List<String> nsgIds;

        public Builder nsgIds(java.util.List<String> nsgIds) {
            this.nsgIds = nsgIds;
            this.__explicitlySet__.add("nsgIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("placementConfigs")
        private java.util.List<NodePoolPlacementConfigDetails> placementConfigs;

        public Builder placementConfigs(
                java.util.List<NodePoolPlacementConfigDetails> placementConfigs) {
            this.placementConfigs = placementConfigs;
            this.__explicitlySet__.add("placementConfigs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateNodePoolNodeConfigDetails build() {
            UpdateNodePoolNodeConfigDetails __instance__ =
                    new UpdateNodePoolNodeConfigDetails(size, nsgIds, placementConfigs);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateNodePoolNodeConfigDetails o) {
            Builder copiedBuilder =
                    size(o.getSize())
                            .nsgIds(o.getNsgIds())
                            .placementConfigs(o.getPlacementConfigs());

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
     * The number of nodes in the node pool.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("size")
    Integer size;

    /**
     * The OCIDs of the Network Security Group(s) to associate nodes for this node pool with. For more information about NSGs, see {@link NetworkSecurityGroup}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
    java.util.List<String> nsgIds;

    /**
     * The placement configurations for the node pool. Provide one placement
     * configuration for each availability domain in which you intend to launch a node.
     * <p>
     * To use the node pool with a regional subnet, provide a placement configuration for
     * each availability domain, and include the regional subnet in each placement
     * configuration.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("placementConfigs")
    java.util.List<NodePoolPlacementConfigDetails> placementConfigs;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
