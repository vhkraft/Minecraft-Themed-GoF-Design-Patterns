package com.vhkraft.behavioral.visitor;

/**
 * Concrete visitor checking wear-and-tear and issuing warnings 
 * for equipment near breakage.
 */
public class DurabilityReportVisitor implements ToolVisitor {

    @Override
    public void visit(DiamondPickaxe pickaxe) {
        double percentage = ((double) pickaxe.getDurabilityRemaining() / pickaxe.getMaxDurability()) * 100;
        String status = percentage < 15.0 ? "WARNING: CRITICAL WEAR! Risk of breaking!" : "Good Condition";
        System.out.println("[Durability Report] " + pickaxe.getName() + ": " + String.format("%.1f", percentage) + "% remaining (" + status + ")");
    }

    @Override
    public void visit(NetheriteSword sword) {
        double percentage = ((double) sword.getDurabilityRemaining() / sword.getMaxDurability()) * 100;
        String status = percentage < 15.0 ? "WARNING: CRITICAL WEAR! Risk of breaking!" : "Good Condition";
        System.out.println("[Durability Report] " + sword.getName() + ": " + String.format("%.1f", percentage) + "% remaining (" + status + ")");
    }

    @Override
    public void visit(Elytra elytra) {
        double percentage = ((double) elytra.getDurabilityRemaining() / elytra.getMaxDurability()) * 100;
        String status = percentage < 15.0 ? "WARNING: CRITICAL WEAR! Risk of breaking!" : "Good Condition";
        System.out.println("[Durability Report] " + elytra.getName() + ": " + String.format("%.1f", percentage) + "% remaining (" + status + ")");
    }
}