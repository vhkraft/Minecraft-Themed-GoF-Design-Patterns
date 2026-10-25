package com.vhkraft.structural.proxy;

/**
 * Represents the Real Vault Chest in Minecraft.
 * Holds rare faction items and allows direct inventory access when reached.
 */
public class RealVaultChest implements Container {
    private String containerTitle;

    /**
     * Constructs the secure real vault chest.
     * 
     * @param containerTitle the title of the vault
     */
    public RealVaultChest(String containerTitle) {
        this.containerTitle = containerTitle;
    }

    @Override
    public void openContainer(String playerName, String playerRank) {
        System.out.println("[Action Bar] *Click!* Vault lock disengaged.");
        System.out.println("[System] Opening " + containerTitle + " for authorized user: " + playerName);
        System.out.println("[System] [Storage GUI] Displaying Netherracks, Beacons, and Diamond Blocks.");
    }

    @Override
    public String getContainerTitle() {
        return containerTitle;
    }
}