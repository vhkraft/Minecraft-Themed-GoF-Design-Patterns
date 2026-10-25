package com.vhkraft.structural.proxy;

/**
 * Represents the common Container subject interface in Minecraft.
 * Both the secure vault and its security proxy implement this contract.
 */
public interface Container {
    /**
     * Opens the container storage for the specified player.
     * 
     * @param playerName the name of the player attempting access
     * @param playerRank the rank of the player in the faction
     */
    void openContainer(String playerName, String playerRank);

    /**
     * Gets the name or title of the container.
     * 
     * @return container title string
     */
    String getContainerTitle();
}