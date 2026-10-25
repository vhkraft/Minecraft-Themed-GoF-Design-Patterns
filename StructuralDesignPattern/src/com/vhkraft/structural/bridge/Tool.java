package com.vhkraft.structural.bridge;

/**
 * Represents the abstract Tool class in Minecraft.
 * Bridges tool behavior to the underlying ToolMaterial implementor.
 */
public abstract class Tool {
    protected ToolMaterial material; // Bridge/composition link to Implementor

    /**
     * Constructs a tool with a specific material tier.
     * 
     * @param material the tool material implementor
     */
    public Tool(ToolMaterial material) {
        this.material = material;
    }

    /**
     * Abstract method defining how the tool performs its primary function.
     * 
     * @param blockName the target block being interacted with
     */
    public abstract void useTool(String blockName);
}