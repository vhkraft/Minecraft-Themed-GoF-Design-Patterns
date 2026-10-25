package com.vhkraft.behavioral.state;

/**
 * Context class representing the Minecraft Warden entity. 
 * Maintains the current WardenState and delegates behavior execution.
 */
public class Warden {
    private WardenState currentState;

    /**
     * Initializes the Warden in a calm state.
     */
    public Warden() {
        this.currentState = new CalmState();
        System.out.println("[System] Warden spawned in the Deep Dark.");
    }

    /**
     * Sets a new aggression state for the Warden.
     * 
     * @param state the new state to transition into
     */
    public void setState(WardenState state) {
        this.currentState = state;
        System.out.println("[System] Warden state transitioned!");
    }

    /**
     * Performs behavior based on the current active state.
     */
    public void performAction() {
        currentState.handleBehavior(this);
    }
}