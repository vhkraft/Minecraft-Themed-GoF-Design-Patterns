package com.vhkraft.behavioral.command;

/**
 * Concrete command for tilting the head of an armor stand.
 */
public class TiltHeadCommand implements Command {
    private final ArmorStand armorStand;
    private final String newTilt;
    private final String previousTilt;

    /**
     * Constructs a tilt head command.
     * 
     * @param armorStand the target armor stand receiver
     * @param newTilt the target head tilt to apply
     */
    public TiltHeadCommand(ArmorStand armorStand, String newTilt) {
        this.armorStand = armorStand;
        this.newTilt = newTilt;
        this.previousTilt = armorStand.getHeadTilt();
    }

    @Override
    public void execute() {
        armorStand.setHeadTilt(newTilt);
    }

    @Override
    public void undo() {
        System.out.println("[Undo] Reverting head tilt...");
        armorStand.setHeadTilt(previousTilt);
    }
}