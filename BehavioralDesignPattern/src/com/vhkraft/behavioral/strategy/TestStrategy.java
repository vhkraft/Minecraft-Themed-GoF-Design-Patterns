package com.vhkraft.behavioral.strategy;

/**
 * Client test class demonstrating the Strategy pattern by dynamically 
 * switching player weapons and combat behaviors during gameplay.
 */
public class TestStrategy {
    public static void main(String[] args) {
        System.out.println("[System] === Minecraft Combat Attack Strategy Test ===");

        // 1. Initialize player combat context
        CombatContext player = new CombatContext();

        // 2. Equip Sword and attack
        player.setStrategy(new SwordAttackStrategy());
        player.performAttack();

        System.out.println();

        // 3. Switch to Bow and attack
        player.setStrategy(new BowAttackStrategy());
        player.performAttack();

        System.out.println();

        // 4. Switch to Trident and attack
        player.setStrategy(new TridentAttackStrategy());
        player.performAttack();

        System.out.println("[System] === Strategy Test Completed Successfully ===");
    }
}