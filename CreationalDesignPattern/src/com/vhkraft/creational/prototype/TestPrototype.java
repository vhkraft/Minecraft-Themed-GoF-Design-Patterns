package com.vhkraft.creational.prototype;

/**
 * Client test class demonstrating the Prototype pattern by cloning 
 * a master Combat Fox to secure multiple base outposts.
 */
public class TestPrototype {
    public static void main(String[] args) {
        System.out.println("[System] === Minecraft Custom Combat Fox Prototype Test ===");

        // 1. Create the master prototype Combat Fox
        CombatFox masterFox = new CombatFox("Master Swiftpaw", 20, "Sharpness V Diamond Sword", false);
        System.out.println("[System] Master Combat Fox initialized.");
        masterFox.patrol();

        System.out.println();

        // 2. Clone the prototype for Base Outpost Alpha
        CombatFox outpostAlphaFox = (CombatFox) masterFox.cloneMob();
        outpostAlphaFox.setName("Alpha Guard Fox");
        outpostAlphaFox.patrol();

        System.out.println();

        // 3. Clone the prototype for Base Outpost Beta
        CombatFox outpostBetaFox = (CombatFox) masterFox.cloneMob();
        outpostBetaFox.setName("Beta Guard Fox");
        outpostBetaFox.setSitting(true); // Modify state independently
        outpostBetaFox.patrol();

        System.out.println("[System] === Prototype Test Completed Successfully ===");
    }
}