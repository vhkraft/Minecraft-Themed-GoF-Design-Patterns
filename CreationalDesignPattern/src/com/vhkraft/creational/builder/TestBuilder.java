package com.vhkraft.creational.builder;

/**
 * Client test class demonstrating the Builder pattern with rule validation 
 * and fluent method chaining for the Enchanted Trident.
 */
public class TestBuilder {
    public static void main(String[] args) {
        System.out.println("[System] === Minecraft Custom Enchanted Trident Builder Test ===");

        // 1. Build a combat-focused Loyalty/Channeling Trident
        System.out.println("[System] Building Stormbringer Combat Trident...");
        EnchantedTrident combatTrident = new EnchantedTrident.Builder()
                .name("Stormbringer")
                .loyalty(3)
                .channeling(true)
                .impaling(5)
                .unbreaking(3)
                .build();

        combatTrident.inspect();
        combatTrident.throwTrident();

        System.out.println();

        // 2. Build a mobility-focused Riptide Trident
        System.out.println("[System] Building Tidal Surge Mobility Trident...");
        EnchantedTrident riptideTrident = new EnchantedTrident.Builder()
                .name("Tidal Surge")
                .riptide(3)
                .unbreaking(3)
                .build();

        riptideTrident.inspect();
        riptideTrident.throwTrident();

        System.out.println();

        // 3. Test Mutually Exclusive Constraint Validation
        System.out.println("[System] Testing Incompatible Enchantment Validation (Riptide + Loyalty)...");
        try {
            EnchantedTrident invalidTrident = new EnchantedTrident.Builder()
                    .name("Broken Trident")
                    .riptide(2)
                    .loyalty(1) // Should trigger validation exception
                    .build();
        } catch (IllegalStateException e) {
            System.out.println("[System] VALIDATION SUCCESS: Builder caught conflict! Exception: " + e.getMessage());
        }

        System.out.println("[System] === Builder Test Completed Successfully ===");
    }
}