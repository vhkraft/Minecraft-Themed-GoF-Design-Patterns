package com.vhkraft.structural.bridge;

/**
 * Represents a Pickaxe tool, extending the Tool abstraction.
 * Specialized for mining stone and ores using material stats.
 */
public class Pickaxe extends Tool {

    /**
     * Constructs a Pickaxe with the given material tier.
     * 
     * @param material the material tier implementor
     */
    public Pickaxe(ToolMaterial material) {
        super(material);
    }

    @Override
    public void useTool(String blockName) {
        System.out.println("[Action Bar] *Clang!* Mining " + blockName + " with " 
                + material.getMaterialName() + " Pickaxe.");
        System.out.println("[System] Material Stats -> Speed: " + material.getMiningSpeed() 
                + ", Durability Left: " + material.getDurability());
    }
}
