package com.vhkraft.behavioral.state;

/**
 * Concrete state representing an Enraged Warden firing a deadly Sonic Boom attack.
 */
public class EnragedState implements WardenState {
    
    @Override
    public void handleBehavior(Warden warden) {
        System.out.println("[Warden - Enraged] TARGET ACQUIRED! Roaring and unleashing a devastating Sonic Boom!");
    }
}