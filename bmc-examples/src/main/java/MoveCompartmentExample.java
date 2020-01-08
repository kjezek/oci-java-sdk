/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.identity.Identity;
import com.oracle.bmc.identity.IdentityClient;
import com.oracle.bmc.identity.model.Compartment;
import com.oracle.bmc.identity.model.MoveCompartmentDetails;
import com.oracle.bmc.identity.requests.MoveCompartmentRequest;

import shared.ExampleCompartmentHelper;

public class MoveCompartmentExample {
    private static String CP_SOURCE = "cp_source_JAVASDK";
    private static String CP_TARGET = "cp_target_JAVASDK";

    public static void main(String[] args) throws Exception {
        /*
         * Set up compartment tree
         *
         * Tenancy --- CP_source
         *         |
         *         |
         *         --- CP_target
         *
         * Move CP_source under CP_target, result compartment tree:
         *
         * Tenancy --- CP_target --- CP_source
         *
         */
        String configurationFilePath = "~/.oci/config";
        String profile = "DEFAULT";

        AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configurationFilePath, profile);

        final String tenantId = provider.getTenantId();
        System.out.println("Tenant Id: " + tenantId);
        final Identity identityClient = new IdentityClient(provider);

        final Compartment cpSource =
                ExampleCompartmentHelper.createCompartment(identityClient, tenantId, CP_SOURCE);
        final Compartment cpTarget =
                ExampleCompartmentHelper.createCompartment(identityClient, tenantId, CP_TARGET);

        Compartment cpSourceBeforeMove =
                ExampleCompartmentHelper.getCompartment(identityClient, tenantId, CP_SOURCE);
        Compartment cpTargetBeforeMove =
                ExampleCompartmentHelper.getCompartment(identityClient, tenantId, CP_TARGET);

        System.out.println(
                "Created compartment "
                        + cpSourceBeforeMove.getName()
                        + " "
                        + cpSourceBeforeMove.getId()
                        + " under parent "
                        + cpSourceBeforeMove.getCompartmentId());
        System.out.println(
                "Created compartment "
                        + cpTargetBeforeMove.getName()
                        + " "
                        + cpTargetBeforeMove.getId()
                        + " under parent "
                        + cpTargetBeforeMove.getCompartmentId());

        // move cp_source under cp_target
        MoveCompartmentDetails moveCompartmentDetails =
                MoveCompartmentDetails.builder()
                        .targetCompartmentId(cpTargetBeforeMove.getId())
                        .build();
        MoveCompartmentRequest moveCompartmentRequest =
                MoveCompartmentRequest.builder()
                        .compartmentId(cpSourceBeforeMove.getId())
                        .moveCompartmentDetails(moveCompartmentDetails)
                        .build();

        System.out.println(
                "Moving compartment "
                        + cpSourceBeforeMove.getName()
                        + " "
                        + cpSourceBeforeMove.getId()
                        + " under compartment "
                        + cpTargetBeforeMove.getId());
        identityClient.moveCompartment(moveCompartmentRequest);

        Compartment cpTargetAfterMove =
                ExampleCompartmentHelper.getCompartment(identityClient, tenantId, CP_TARGET);
        Compartment cpSourceAfterMove =
                ExampleCompartmentHelper.getCompartment(
                        identityClient, cpTargetAfterMove.getId(), CP_SOURCE);

        System.out.println(
                "After move, compartment "
                        + cpSourceAfterMove.getName()
                        + " "
                        + cpSourceAfterMove.getId()
                        + " is under parent "
                        + cpSourceAfterMove.getCompartmentId());
        System.out.println(
                "After move, compartment "
                        + cpTargetAfterMove.getName()
                        + " "
                        + cpTargetAfterMove.getId()
                        + " is under parent "
                        + cpTargetAfterMove.getCompartmentId());
    }
}