package com.vhkraft.behavioral.visitor;

/**
 * Concrete visitor calculating anvil repair costs (XP levels and raw materials) 
 * for damaged equipment.
 */
public class RepairCostVisitor implements ToolVisitor {

    @Override
    public void visit(DiamondPickaxe pickaxe) {
        int missing = pickaxe.getMaxDurability() - pickaxe.getDurabilityRemaining();
        int diamondCost = Math.max(1, missing / 400);
        System.out.println("[Repair Cost] " + pickaxe.getName() + " -> Missing " + missing + " durability. Requires " + diamondCost + " Diamond(s) + 5 XP Levels.");
    }

    @Override
    public void visit(NetheriteSword sword) {
        int missing = sword.getMaxDurability() - sword.getDurabilityRemaining();
        int ingotCost = Math.max(1, missing / 500);
        System.out.println("[Repair Cost] " + sword.getName() + " -> Missing " + missing + " durability. Requires " + ingotCost + " Netherite Ingot + 8 XP Levels.");
    }

    @Override
    public void visit(Elytra elytra) {
        int missing = elytra.getMaxDurability() - elytra.getDurabilityRemaining();
        int membraneCost = Math.max(1, missing / 100);
        System.out.println("[Repair Cost] " + elytra.getName() + " -> Missing " + missing + " durability. Requires " + membraneCost + " Phantom Membrane + 12 XP Levels.");
    }
}