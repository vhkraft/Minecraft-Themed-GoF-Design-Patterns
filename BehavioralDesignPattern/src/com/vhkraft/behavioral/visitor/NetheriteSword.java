package com.vhkraft.behavioral.visitor;

/**
 * Concrete element representing a Netherite Sword weapon.
 */
public class NetheriteSword implements ToolElement {
    private final String name = "Netherite Sword";
    private final int durabilityRemaining;
    private final int maxDurability = 2031;

    public NetheriteSword(int durabilityRemaining) {
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