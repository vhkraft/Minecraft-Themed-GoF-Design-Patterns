package com.vhkraft.structural.flyweight;

/**
 * Represents the BlockType flyweight interface in Minecraft.
 * Receives extrinsic world coordinates to render shared block types.
 */
public interface BlockType {
    /**
     * Renders the block at the specified world coordinates.
     * 
     * @param x coordinate X in the game world
     * @param y coordinate Y in the game world
     * @param z coordinate Z in the game world
     */
    void render(int x, int y, int z);
}