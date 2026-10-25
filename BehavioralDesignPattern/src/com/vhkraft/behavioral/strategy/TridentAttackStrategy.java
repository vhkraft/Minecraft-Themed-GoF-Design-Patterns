package com.vhkraft.behavioral.strategy;

/**
 * Concrete strategy implementing mobile Riptide trident dash attacks in water or rain.
 */
public class TridentAttackStrategy implements CombatStrategy {
    
    @Override
    public void executeAttack() {
        System.out.println("[Combat] Unleashing Riptide Trident dash! Propels player forward like a missile.");
    }
}