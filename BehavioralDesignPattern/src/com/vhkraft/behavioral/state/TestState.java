package com.vhkraft.behavioral.state;

/**
 * Client test class demonstrating the State pattern by simulating 
 * the Warden transitioning from calm exploration to enraged combat.
 */
public class TestState {
    public static void main(String[] args) {
        System.out.println("[System] === Minecraft Warden Aggression State Machine Test ===");

        // 1. Spawn Warden (Starts Calm)
        Warden warden = new Warden();
        warden.performAction();

        System.out.println();

        // 2. Player breaks blocks, triggering Agitated state
        System.out.println("[Player action] Mining ore nearby, generating vibrations...");
        warden.setState(new AgitatedState());
        warden.performAction();

        System.out.println();

        // 3. Player gets too close, triggering Enraged state
        System.out.println("[Player action] Direct line of sight established!");
        warden.setState(new EnragedState());
        warden.performAction();

        System.out.println("[System] === State Test Completed Successfully ===");
    }
}