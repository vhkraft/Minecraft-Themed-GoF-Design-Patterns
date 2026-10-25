package com.vhkraft.behavioral.strategy;

/**
 * Strategy interface defining the contract for all Minecraft combat attack behaviors.
 * Allows interchangeable algorithms to be executed polymorphically.
 */
public interface CombatStrategy {
    
    /**
     * Executes the specific combat attack action.
     */
    void executeAttack();
}