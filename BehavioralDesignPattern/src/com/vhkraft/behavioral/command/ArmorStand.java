package com.vhkraft.behavioral.command;

/**
 * Receiver class representing the Armor Stand entity in the game world 
 * whose physical pose can be modified.
 */
public class ArmorStand {
    private String armAngle = "Default Down";
    private String headTilt = "Straight";

    /**
     * Sets the arm angle of the armor stand.
     * 
     * @param armAngle the new arm angle description
     */
    public void setArmAngle(String armAngle) {
        this.armAngle = armAngle;
        System.out.println("[Armor Stand] Arm angle updated to: " + this.armAngle);
    }

    /**
     * Gets the current arm angle.
     * 
     * @return current arm angle
     */
    public String getArmAngle() {
        return armAngle;
    }

    /**
     * Sets the head tilt of the armor stand.
     * 
     * @param headTilt the new head tilt description
     */
    public void setHeadTilt(String headTilt) {
        this.headTilt = headTilt;
        System.out.println("[Armor Stand] Head tilt updated to: " + this.headTilt);
    }

    /**
     * Gets the current head tilt.
     * 
     * @return current head tilt
     */
    public String getHeadTilt() {
        return headTilt;
    }
}