package com.vhkraft.creational.prototype;

/**
 * Represents a custom Combat Fox in Minecraft equipped with a weapon and health stats.
 * Implements MobPrototype to support runtime cloning and state duplication.
 */
public class CombatFox implements MobPrototype {
    private String name;
    private int health;
    private String heldWeapon;
    private boolean isSitting;

    /**
     * Constructs a new Combat Fox with specified attributes.
     * 
     * @param name custom name of the fox
     * @param health current health points
     * @param heldWeapon weapon held in its mouth (e.g., Diamond Sword)
     * @param isSitting initial sitting posture
     */
    public CombatFox(String name, int health, String heldWeapon, boolean isSitting) {
        this.name = name;
        this.health = health;
        this.heldWeapon = heldWeapon;
        this.isSitting = isSitting;
    }

    /**
     * Clones the Combat Fox, performing a deep copy of its state attributes.
     * 
     * @return a new CombatFox instance with identical configuration
     */
    @Override
    public MobPrototype cloneMob() {
        System.out.println("[Prototype] Cloning master Combat Fox: " + name + "...");
        // In a true deep copy, mutable objects like Strings are immutable in Java, 
        // but custom gear objects would be freshly instantiated here.
        return new CombatFox(this.name + " (Clone)", this.health, this.heldWeapon, this.isSitting);
    }

    /**
     * Executes fox patrol or combat defense behavior.
     */
    public void patrol() {
        System.out.println("[Combat] Fox " + name + " patrols the base holding " + heldWeapon + 
            " [Health: " + health + ", Sitting: " + isSitting + "]");
    }

    /**
     * Updates the name of the cloned fox.
     * 
     * @param name new custom name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the sitting posture state.
     * 
     * @param sitting true to sit, false to stand
     */
    public void setSitting(boolean sitting) {
        this.isSitting = sitting;
    }
}