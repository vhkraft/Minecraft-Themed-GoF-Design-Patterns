package com.vhkraft.creational.factory;

/**
 * Abstract Creator declaring the Factory Method.
 */
public abstract class MobSpawner {
    /**
     * Factory Method to be implemented by concrete spawner subclasses.
     * 
     * @return concrete Mob instance
     */
    public abstract Mob createMob();

    /**
     * Common core business logic that uses the factory method.
     */
    public Mob spawnMob() {
        Mob mob = createMob();
        System.out.println("[Spawner] *Spinning Flame Effect* Spawns a " + mob.getName() + " into the dungeon!");
        return mob;
    }
}