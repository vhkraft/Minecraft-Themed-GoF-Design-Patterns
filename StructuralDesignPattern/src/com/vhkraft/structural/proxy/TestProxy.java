package com.vhkraft.structural.proxy;

/**
 * Client class simulating Minecraft players attempting to access a faction vault
 * protected by the Proxy pattern.
 */
public class TestProxy {
    public static void main(String[] args) {
        System.out.println("[System] === Minecraft Faction Vault Protection Test ===");

        // Create the protected proxy container (Clients interact with the proxy interface)
        Container factionVault = new VaultChestProxy("Alpha Faction Treasure Vault");

        System.out.println("\n[System] --- Scenario 1: Unauthorized Recruiter attempts to access ---");
        factionVault.openContainer("Notch_Fan_99", "Recruiter");

        System.out.println("\n[System] --- Scenario 2: Authorized Faction Officer attempts to access ---");
        factionVault.openContainer("Steve_Builder", "Officer");

        System.out.println("\n[System] === Test Completed Successfully ===");
    }
}