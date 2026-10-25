package com.vhkraft.behavioral.command;

/**
 * Concrete command for rotating the arm of an armor stand.
 */
public class RotateArmCommand implements Command {
    private final ArmorStand armorStand;
    private final String newAngle;
    private final String previousAngle;

    /**
     * Constructs a rotate arm command.
     * 
     * @param armorStand the target armor stand receiver
     * @param newAngle the target arm angle to apply
     */
    public RotateArmCommand(ArmorStand armorStand, String newAngle) {
        this.armorStand = armorStand;
        this.newAngle = newAngle;
        this.previousAngle = armorStand.getArmAngle();
    }

    @Override
    public void execute() {
        armorStand.setArmAngle(newAngle);
    }

    @Override
    public void undo() {
        System.out.println("[Undo] Reverting arm angle...");
        armorStand.setArmAngle(previousAngle);
    }
}