package com.vhkraft.creational.singleton;

import java.io.Serializable;

/**
 * Represents the legendary Ender Dragon boss in single-player Minecraft 
 * using the Bill Pugh Singleton pattern with complete security defenses.
 */
public class EnderDragon implements Serializable, Cloneable {
    private static final long serialVersionUID = 1L;

    private String bossName;
    private int health;

    /**
     * Private constructor prevents external instantiation.
     */
    private EnderDragon() {
        this.bossName = "Ender Dragon";
        this.health = 500;
        System.out.println("[Boss Bar] *Awakening* The mighty Ender Dragon has roared into the End sky!");
    }

    /**
     * Static inner holder class. 
     * Not loaded into memory until getInstance() is called for the first time.
     */
    private static class SingletonHolder {
        private static final EnderDragon INSTANCE = new EnderDragon();
    }

    /**
     * Provides thread-safe global access with zero synchronization overhead.
     * 
     * @return the single shared EnderDragon instance
     */
    public static EnderDragon getInstance() {
        return SingletonHolder.INSTANCE;
    }

    /**
     * Serialization defense: Ensures deserialization returns the existing instance 
     * instead of creating a duplicate object in memory.
     */
    protected Object readResolve() {
        return getInstance();
    }

    /**
     * Cloning defense: Throws an exception to block duplication via object cloning.
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Security Violation: The Ender Dragon cannot be cloned!");
    }

    public void roar() {
        System.out.println("[Action Bar] [" + bossName + "] roars with " + health + " HP remaining!");
    }

    public String getBossName() {
        return bossName;
    }
}