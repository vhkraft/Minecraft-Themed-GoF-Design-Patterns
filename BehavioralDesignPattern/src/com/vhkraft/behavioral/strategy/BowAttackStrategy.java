package com.vhkraft.behavioral.strategy;

/**
 * Concrete strategy implementing ranged bow and arrow projectile attacks.
 */
public class BowAttackStrategy implements CombatStrategy {
    
    @Override
    public void executeAttack() {
        System.out.println("[Combat] Drawing Bow and firing an Arrow! Pierces targets from a distance.");
    }
}