package com.vhkraft.structural.flyweight;

/**
 * Represents the Concrete Oak Leaf Block Flyweight.
 * Stores shared intrinsic state (texture and model data) used across millions of blocks.
 */
public class OakLeafBlockType implements BlockType {
    // Intrinsic state (shared and immutable)
    private String textureName;
    private boolean isFlammable;
    private int opacity;

    /**
     * Constructs the oak leaf flyweight with shared intrinsic properties.
     * 
     * @param textureName the name of the texture file
     * @param isFlammable whether fire can spread to this block
     * @param opacity the light opacity level
     */
    public OakLeafBlockType(String textureName, boolean isFlammable, int opacity) {
        this.textureName = textureName;
        this.isFlammable = isFlammable;
        this.opacity = opacity;
        System.out.println("[System] *Allocating Memory* Loaded heavy intrinsic texture: " + textureName);
    }

    @Override
    public void render(int x, int y, int z) {
        // Uses shared intrinsic data combined with passed extrinsic coordinates (x, y, z)
        System.out.println("[Action Bar] Rendering [" + textureName + "] at position X:" 
                + x + " Y:" + y + " Z:" + z);
    }
}