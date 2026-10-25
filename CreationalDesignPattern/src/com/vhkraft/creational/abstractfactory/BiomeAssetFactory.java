package com.vhkraft.creational.abstractfactory;

/**
 * Represents the Abstract Factory interface for generating families of biome assets.
 * Declares factory methods for creating related products (Trees and Soils) together.
 */
public interface BiomeAssetFactory {
    Tree createTree();
    Soil createSoil();
}