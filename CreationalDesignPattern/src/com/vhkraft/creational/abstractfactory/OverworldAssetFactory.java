package com.vhkraft.creational.abstractfactory;

/**
 * Concrete Factory for producing Overworld-themed asset families.
 * Guarantees that only Overworld-compatible trees and soils are instantiated together.
 */
public class OverworldAssetFactory implements BiomeAssetFactory {
    @Override
    public Tree createTree() {
        return new OakTree();
    }

    @Override
    public Soil createSoil() {
        return new GrassBlock();
    }
}