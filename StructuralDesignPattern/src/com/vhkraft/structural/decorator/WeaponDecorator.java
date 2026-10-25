package com.vhkraft.structural.decorator;

/**
 * Abstract decorator class holding a reference to a wrapped Weapon object.
 * Delegates calls to the underlying weapon while allowing subclass extensions.
 */
public abstract class WeaponDecorator implements Weapon {
    protected Weapon decoratedWeapon; // Composition link to wrapped weapon

    /**
     * Constructs the decorator wrapping the specified weapon.
     * 
     * @param decoratedWeapon the weapon being enchanted
     */
    public WeaponDecorator(Weapon decoratedWeapon) {
        this.decoratedWeapon = decoratedWeapon;
    }

    @Override
    public void attack() {
        decoratedWeapon.attack();
    }

    @Override
    public int getDamage() {
        return decoratedWeapon.getDamage();
    }

    @Override
    public String getDescription() {
        return decoratedWeapon.getDescription();
    }
}