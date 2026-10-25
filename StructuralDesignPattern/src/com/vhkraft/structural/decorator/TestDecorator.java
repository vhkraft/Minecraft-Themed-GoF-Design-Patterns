package com.vhkraft.structural.decorator;

/**
 * Client class simulating a Minecraft player enchanting a diamond sword
 * dynamically using the Decorator pattern.
 */
public class TestDecorator {
    public static void main(String[] args) {
        System.out.println("[System] === Minecraft Weapon Enchantment Test ===");

        // 1. Create a basic un-enchanted Diamond Sword (Concrete Component)
        Weapon mySword = new DiamondSword();
        System.out.println("[System] Crafted: " + mySword.getDescription());
        System.out.println("[System] Base Damage: " + mySword.getDamage());
        mySword.attack();

        System.out.println("\n[System] Applying Sharpness IV at the Anvil...");
        // 2. Wrap sword with Sharpness decorator
        Weapon sharpSword = new SharpnessEnchantment(mySword);

        System.out.println("[System] Applying Fire Aspect II at the Anvil...");
        // 3. Wrap further with Fire Aspect decorator (Stacking decorators)
        Weapon fullyEnchantedSword = new FireAspectEnchantment(sharpSword);

        // 4. Test fully enchanted weapon behavior
        System.out.println("\n[System] Final Weapon: " + fullyEnchantedSword.getDescription());
        System.out.println("[System] Total Attack Damage: " + fullyEnchantedSword.getDamage());
        fullyEnchantedSword.attack();

        System.out.println("[System] === Test Completed Successfully ===");
    }
}