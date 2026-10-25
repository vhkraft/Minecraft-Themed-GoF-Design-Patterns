package com.vhkraft.behavioral.visitor;

import java.util.Arrays;
import java.util.List;

/**
 * Client test class demonstrating the Visitor pattern by running 
 * durability reports and repair cost calculations on equipment.
 */
public class TestVisitor {
    public static void main(String[] args) {
        System.out.println("[System] === Minecraft Tool Durability & Repair Inspector Test ===");

        // 1. Gather player tools with varying wear levels
        List<ToolElement> tools = Arrays.asList(
            new DiamondPickaxe(250),   // Heavily worn down
            new NetheriteSword(1800),  // Lightly used
            new Elytra(35)             // Extremely close to breaking!
        );

        System.out.println("[System] Running Durability Report Visitor...\n");
        ToolVisitor reportVisitor = new DurabilityReportVisitor();
        for (ToolElement tool : tools) {
            tool.accept(reportVisitor);
        }

        System.out.println("\n[System] Running Repair Cost Visitor (Anvil Station)...\n");
        ToolVisitor repairVisitor = new RepairCostVisitor();
        for (ToolElement tool : tools) {
            tool.accept(repairVisitor);
        }

        System.out.println("\n[System] === Visitor Test Completed Successfully ===");
    }
}