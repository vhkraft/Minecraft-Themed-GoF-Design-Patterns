package com.vhkraft.behavioral.strategy;

/**
 * Concrete strategy implementing close-range melee sword sweeping attacks.
 */
public class SwordAttackStrategy implements CombatStrategy {
    
    @Override
    public void executeAttack() {
        System.out.println("[Combat] Swinging Diamond Sword! Deals close-range sweeping damage to nearby mobs.");
    }
}