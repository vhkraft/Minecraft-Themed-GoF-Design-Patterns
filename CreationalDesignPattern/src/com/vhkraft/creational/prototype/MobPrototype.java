package com.vhkraft.creational.prototype;

/**
 * Prototype interface declaring the cloning contract for Minecraft mob entities.
 * Allows concrete mob classes to implement safe instance duplication.
 */
public interface MobPrototype extends Cloneable {
    
    /**
     * Clones the current mob instance, duplicating its internal state.
     * 
     * @return a cloned instance of the mob prototype
     */
    MobPrototype cloneMob();
}