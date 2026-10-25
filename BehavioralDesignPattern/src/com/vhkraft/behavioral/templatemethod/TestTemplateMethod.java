package com.vhkraft.behavioral.templatemethod;

/**
 * Client test class demonstrating the Template Method pattern by running 
 * standard potion brewing workflows for different potion types.
 */
public class TestTemplateMethod {
    public static void main(String[] args) {
        System.out.println("[System] === Minecraft Potion Brewing Workflow Test ===\n");

        // 1. Brew a standard Potion of Strength
        System.out.println("--- Brewing Potion of Strength ---");
        BrewingStandWorkflow strengthBrew = new StrengthPotionBrewing();
        strengthBrew.brewPotion();

        // 2. Brew an Enhanced (Extended) Potion of Regeneration
        System.out.println("--- Brewing Extended Potion of Regeneration ---");
        BrewingStandWorkflow regenBrew = new RegenerationPotionBrewing();
        regenBrew.brewPotion();

        System.out.println("[System] === Template Method Test Completed Successfully ===");
    }
}