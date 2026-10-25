package com.vhkraft.structural.flyweight;

/**
 * Represents a World Block context object.
 * Stores extrinsic state (X, Y, Z coordinates) and points to a shared BlockType flyweight.
 */
public class WorldBlock {
    private int x;
    private int y;
    private int z;
    private BlockType blockType; // Reference to shared Flyweight

    /**
     * Constructs a world block with specific coordinates and a shared block type.
     * 
     * @param x coordinate X
     * @param y coordinate Y
     * @param z coordinate Z
     * @param blockType the shared flyweight block type
     */
    public WorldBlock(int x, int y, int z, BlockType blockType) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.blockType = blockType;
    }

    /**
     * Triggers the rendering of this block by passing extrinsic state to the flyweight.
     */
    public void render() {
        blockType.render(x, y, z);
    }
}