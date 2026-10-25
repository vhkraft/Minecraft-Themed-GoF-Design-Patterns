package com.vhkraft.creational.factory;

/**
 * Concrete Creator for spawning Skeleton entities.
 */
public class SkeletonSpawner extends MobSpawner {
    @Override
    public Mob createMob() {
        return new Skeleton();
    }
}