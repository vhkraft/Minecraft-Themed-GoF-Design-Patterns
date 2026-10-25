package com.vhkraft.behavioral.state;

/**
 * State interface defining behaviors for the Minecraft Warden across different aggression levels.
 */
public interface WardenState {
    
    /**
     * Executes behavior corresponding to the current aggression state.
     * 
     * @param warden the context warden instance
     */
    void handleBehavior(Warden warden);
}