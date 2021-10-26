/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.tenantmanagercontrolplane;

import com.oracle.bmc.tenantmanagercontrolplane.requests.*;
import com.oracle.bmc.tenantmanagercontrolplane.responses.*;

/**
 * The Organizations API allows you to consolidate multiple OCI tenancies into an organization, and centrally manage your tenancies and its resources.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200801")
public interface Subscription extends AutoCloseable {

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     * @param endpoint The endpoint of the service.
     */
    void setEndpoint(String endpoint);

    /**
     * Gets the set endpoint for REST call (ex, https://www.example.com)
     */
    String getEndpoint();

    /**
     * Sets the region to call (ex, Region.US_PHOENIX_1).
     * <p>
     * Note, this will call {@link #setEndpoint(String) setEndpoint} after resolving the endpoint.  If the service is not available in this Region, however, an IllegalArgumentException will be raised.
     * @param region The region of the service.
     */
    void setRegion(com.oracle.bmc.Region region);

    /**
     * Sets the region to call (ex, 'us-phoenix-1').
     * <p>
     * Note, this will first try to map the region ID to a known Region and call
     * {@link #setRegion(Region) setRegion}.
     * <p>
     * If no known Region could be determined, it will create an endpoint based on the
     * default endpoint format ({@link com.oracle.bmc.Region#formatDefaultRegionEndpoint(Service, String)}
     * and then call {@link #setEndpoint(String) setEndpoint}.
     * @param regionId The public region ID.
     */
    void setRegion(String regionId);

    /**
     * Assign the tenancy record identified by the compartment ID to the given subscription ID.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/tenantmanagercontrolplane/CreateSubscriptionMappingExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateSubscriptionMapping API.
     */
    CreateSubscriptionMappingResponse createSubscriptionMapping(
            CreateSubscriptionMappingRequest request);

    /**
     * Delete the subscription mapping details by subscription mapping ID.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/tenantmanagercontrolplane/DeleteSubscriptionMappingExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteSubscriptionMapping API.
     */
    DeleteSubscriptionMappingResponse deleteSubscriptionMapping(
            DeleteSubscriptionMappingRequest request);

    /**
     * Get the assigned subscription details by assigned subscription ID.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/tenantmanagercontrolplane/GetAssignedSubscriptionExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetAssignedSubscription API.
     */
    GetAssignedSubscriptionResponse getAssignedSubscription(GetAssignedSubscriptionRequest request);

    /**
     * Gets the subscription details by subscriptionId.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/tenantmanagercontrolplane/GetSubscriptionExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetSubscription API.
     */
    GetSubscriptionResponse getSubscription(GetSubscriptionRequest request);

    /**
     * Get the subscription mapping details by subscription mapping ID.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/tenantmanagercontrolplane/GetSubscriptionMappingExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetSubscriptionMapping API.
     */
    GetSubscriptionMappingResponse getSubscriptionMapping(GetSubscriptionMappingRequest request);

    /**
     * Lists subscriptions that are consumed by the compartment. Only the root compartment is allowed.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/tenantmanagercontrolplane/ListAssignedSubscriptionsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListAssignedSubscriptions API.
     */
    ListAssignedSubscriptionsResponse listAssignedSubscriptions(
            ListAssignedSubscriptionsRequest request);

    /**
     * List the available regions based on subscription ID.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/tenantmanagercontrolplane/ListAvailableRegionsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListAvailableRegions API.
     */
    ListAvailableRegionsResponse listAvailableRegions(ListAvailableRegionsRequest request);

    /**
     * Lists the subscription mappings for all the subscriptions owned by a given compartmentId. Only the root compartment is allowed.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/tenantmanagercontrolplane/ListSubscriptionMappingsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListSubscriptionMappings API.
     */
    ListSubscriptionMappingsResponse listSubscriptionMappings(
            ListSubscriptionMappingsRequest request);

    /**
     * List the subscriptions that a compartment owns. Only the root compartment is allowed.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/tenantmanagercontrolplane/ListSubscriptionsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListSubscriptions API.
     */
    ListSubscriptionsResponse listSubscriptions(ListSubscriptionsRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    SubscriptionWaiters getWaiters();

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    SubscriptionPaginators getPaginators();
}
