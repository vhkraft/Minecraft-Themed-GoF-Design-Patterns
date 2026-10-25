package com.vhkraft.creational.abstractfactory;

/**
 * Client class demonstrating the Abstract Factory pattern.
 * Generates entire consistent families of assets for different Minecraft dimensions.
 */
public class TestAbstractFactory {
    public static void main(String[] args) {
        System.out.println("[System] === Minecraft Biome Asset Factory Test ===");

        // 1. Generate Overworld Asset Family
        System.out.println("[World Gen] Generating Overworld Biome Assets...");
        BiomeAssetFactory overworldFactory = new OverworldAssetFactory();
        Tree overworldTree = overworldFactory.createTree();
        Soil overworldSoil = overworldFactory.createSoil();
        
        overworldSoil.placeBlock();
        overworldTree.grow();

        System.out.println();

        // 2. Generate Nether Asset Family
        System.out.println("[World Gen] Generating Nether Biome Assets...");
        BiomeAssetFactory netherFactory = new NetherAssetFactory();
        Tree netherTree = netherFactory.createTree();
        Soil netherSoil = netherFactory.createSoil();

        netherSoil.placeBlock();
        netherTree.grow();

        System.out.println("[System] === Abstract Factory Test Completed Successfully ===");
    }
}