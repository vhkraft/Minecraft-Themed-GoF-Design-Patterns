package com.vhkraft.structural.decorator;

/**
 * Represents the Sharpness enchantment decorator.
 * Adds bonus attack damage to the wrapped weapon.
 */
public class SharpnessEnchantment extends WeaponDecorator {

    /**
     * Wraps a weapon with Sharpness enchantment.
     * 
     * @param weapon the weapon to enchant
     */
    public SharpnessEnchantment(Weapon weapon) {
        super(weapon);
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println("[System] Sharpness IV aura glows brightly!");
    }

    @Override
    public int getDamage() {
        return super.getDamage() + 4; // Sharpness IV adds +4 attack damage
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with Sharpness IV";
    }
}
