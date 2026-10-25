package com.vhkraft.behavioral.state;

/**
 * Concrete state representing an Agitated Warden whose heart is beating faster 
 * due to repeated vibrations.
 */
public class AgitatedState implements WardenState {
    
    @Override
    public void handleBehavior(Warden warden) {
        System.out.println("[Warden - Agitated] Heartbeat pounding! *Thump-thump* Tracking vibration source closely.");
    }
}