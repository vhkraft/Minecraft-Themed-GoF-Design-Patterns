package com.vhkraft.structural.decorator;

/**
 * Represents the Fire Aspect enchantment decorator.
 * Adds fire damage and ignition effects to the wrapped weapon.
 */
public class FireAspectEnchantment extends WeaponDecorator {

    /**
     * Wraps a weapon with Fire Aspect enchantment.
     * 
     * @param weapon the weapon to enchant
     */
    public FireAspectEnchantment(Weapon weapon) {
        super(weapon);
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println("[System] *Crackle!* Target catches fire from flame particles!");
    }

    @Override
    public int getDamage() {
        return super.getDamage() + 2; // Fire aspect contributes additional burn damage equivalent
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " & Fire Aspect II";
    }
}
