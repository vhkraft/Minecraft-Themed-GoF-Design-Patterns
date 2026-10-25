package com.vhkraft.structural.decorator;

/**
 * Represents the base Weapon component interface in Minecraft.
 * Both base weapons and enchantment decorators implement this interface.
 */
public interface Weapon {
    /**
     * Executes an attack action with the weapon.
     */
    void attack();

    /**
     * Retrieves the total attack damage value including enchantments.
     * 
     * @return the attack damage value
     */
    int getDamage();

    /**
     * Retrieves the display description or name of the weapon.
     * 
     * @return the weapon description
     */
    String getDescription();
}