package com.vhkraft.creational.factory;

/**
 * Concrete Creator for spawning Zombie entities.
 */
public class ZombieSpawner extends MobSpawner {
    @Override
    public Mob createMob() {
        return new Zombie();
    }
}