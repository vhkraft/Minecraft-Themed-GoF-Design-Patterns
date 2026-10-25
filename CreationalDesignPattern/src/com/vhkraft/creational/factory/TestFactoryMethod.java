package com.vhkraft.creational.factory;

/**
 * Client class demonstrating the Factory Method pattern.
 */
public class TestFactoryMethod {
    public static void main(String[] args) {
        System.out.println("[System] === Minecraft Dungeon Mob Spawner Test ===");

        // 1. Instantiate a Zombie Spawner
        MobSpawner zombieSpawner = new ZombieSpawner();
        Mob zombie = zombieSpawner.spawnMob();
        zombie.attack();

        System.out.println();

        // 2. Instantiate a Skeleton Spawner
        MobSpawner skeletonSpawner = new SkeletonSpawner();
        Mob skeleton = skeletonSpawner.spawnMob();
        skeleton.attack();

        System.out.println("[System] === Mob Spawner Test Completed Successfully ===");
    }
}