package com.vhkraft.behavioral.command;

/**
 * Client test class demonstrating the Command pattern using the 
 * Armor Stand Pose Adjuster Stick with execute and undo operations.
 */
public class TestCommand {
    public static void main(String[] args) {
        System.out.println("[System] === Minecraft Armor Stand Pose Adjuster Test ===");

        // 1. Create Receiver (Armor Stand) and Invoker (Pose Controller Stick)
        ArmorStand stand = new ArmorStand();
        PoseController stick = new PoseController();

        // 2. Execute command: Rotate Arm
        System.out.println("[Player action] Using stick to raise arm...");
        Command raiseArm = new RotateArmCommand(stand, "Raised 90 Degrees");
        stick.executeCommand(raiseArm);

        System.out.println();

        // 3. Execute command: Tilt Head
        System.out.println("[Player action] Using stick to tilt head upward...");
        Command tiltHead = new TiltHeadCommand(stand, "Tilted Up 45 Degrees");
        stick.executeCommand(tiltHead);

        System.out.println();

        // 4. Undo last command (Head tilt)
        System.out.println("[Player action] Crouching and right-clicking to undo last adjustment...");
        stick.undoLastCommand();

        System.out.println();

        // 5. Undo previous command (Arm rotation)
        System.out.println("[Player action] Crouching and right-clicking again to undo arm rotation...");
        stick.undoLastCommand();

        System.out.println("[System] === Command Test Completed Successfully ===");
    }
}