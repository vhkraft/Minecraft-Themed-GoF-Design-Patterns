package com.vhkraft.creational.factory;

/**
 * Concrete Product representing a Skeleton mob.
 */
public class Skeleton implements Mob {
    private String name;

    public Skeleton() {
        this.name = "Skeleton";
    }

    @Override
    public void attack() {
        System.out.println("[Combat] " + name + " rattles its bones and shoots a bow!");
    }

    @Override
    public String getName() {
        return name;
    }
}