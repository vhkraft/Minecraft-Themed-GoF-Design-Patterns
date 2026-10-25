package com.vhkraft.behavioral.state;

/**
 * Concrete state representing a Calm Warden wandering the Deep Dark.
 */
public class CalmState implements WardenState {
    
    @Override
    public void handleBehavior(Warden warden) {
        System.out.println("[Warden - Calm] Wandering slowly through the skulk. Sniffing gently for minor vibrations.");
    }
}