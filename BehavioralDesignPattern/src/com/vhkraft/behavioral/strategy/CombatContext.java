package com.vhkraft.behavioral.strategy;

/**
 * Context class representing the player's combat system. 
 * Maintains a reference to a current CombatStrategy and delegates attacks to it.
 */
public class CombatContext {
    private CombatStrategy strategy;

    /**
     * Sets or switches the active combat strategy at runtime.
     * 
     * @param strategy the new combat strategy to adopt
     */
    public void setStrategy(CombatStrategy strategy) {
        this.strategy = strategy;
        System.out.println("[System] Weapon switched! Combat strategy updated.");
    }

    /**
     * Executes the currently active combat strategy.
     */
    public void performAttack() {
        if (strategy == null) {
            System.out.println("[Combat] No weapon equipped! Punching with bare hands.");
            return;
        }
        strategy.executeAttack();
    }
}