package com.vhkraft.behavioral.visitor;

/**
 * Concrete element representing rare Elytra wings.
 */
public class Elytra implements ToolElement {
    private final String name = "Elytra";
    private final int durabilityRemaining;
    private final int maxDurability = 432;

    public Elytra(int durabilityRemaining) {
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