package com.vhkraft.creational.factory;

/**
 * Concrete Product representing a Zombie mob.
 */
public class Zombie implements Mob {
    private String name;

    public Zombie() {
        this.name = "Zombie";
    }

    @Override
    public void attack() {
        System.out.println("[Combat] " + name + " groans and performs a melee strike!");
    }

    @Override
    public String getName() {
        return name;
    }
}