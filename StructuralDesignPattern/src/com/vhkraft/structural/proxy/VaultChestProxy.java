package com.vhkraft.structural.proxy;

/**
 * Represents the Vault Chest Protection Proxy.
 * Verifies player rank permissions before allowing access to the RealVaultChest.
 */
public class VaultChestProxy implements Container {
    private String containerTitle;
    private RealVaultChest realVault; // Reference to the RealSubject

    /**
     * Constructs the protection proxy wrapping the faction vault.
     * 
     * @param containerTitle the title of the vault
     */
    public VaultChestProxy(String containerTitle) {
        this.containerTitle = containerTitle;
        // Real vault is safely encapsulated behind the proxy
        this.realVault = new RealVaultChest(containerTitle);
    }

    @Override
    public void openContainer(String playerName, String playerRank) {
        System.out.println("[System] Security check for player [" + playerName + "] with rank [" + playerRank + "]...");

        // Protection Proxy logic: verify if the player has sufficient rank (Officer or Leader)
        if ("Officer".equalsIgnoreCase(playerRank) || "Leader".equalsIgnoreCase(playerRank)) {
            System.out.println("[System] Access granted! Forwarding request to secure vault.");
            realVault.openContainer(playerName, playerRank);
        } else {
            System.out.println("[Action Bar] *Buzz!* Access denied.");
            System.out.println("[System] Warning: Player " + playerName + " lacks the required Faction Officer rank!");
        }
    }

    @Override
    public String getContainerTitle() {
        return containerTitle;
    }
}