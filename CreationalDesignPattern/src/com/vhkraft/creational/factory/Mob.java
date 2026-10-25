package com.vhkraft.creational.factory;

/**
 * Product interface for all entities spawned in Minecraft.
 */
public interface Mob {
    void attack();
    String getName();
}