package com.vhkraft.behavioral.visitor;

/**
 * Concrete element representing a Diamond Pickaxe tool.
 */
public class DiamondPickaxe implements ToolElement {
    private final String name = "Diamond Pickaxe";
    private final int durabilityRemaining;
    private final int maxDurability = 1561;

    public DiamondPickaxe(int durabilityRemaining) {
        this.durabilityRemaining = durabilityRemaining;
    }

    public String getName() {
        return name;
    }

    public int getDurabilityRemaining() {
        return durabilityRemaining;
    }

    public int getMaxDurability() {
        return maxDurability;
    }

    @Override
    public void accept(ToolVisitor visitor) {
        visitor.visit(this);
    }
}