package com.vhkraft.creational.abstractfactory;

/**
 * Concrete Factory for producing Nether-themed asset families.
 * Guarantees that only Nether-compatible flora and ground blocks are instantiated together.
 */
public class NetherAssetFactory implements BiomeAssetFactory {
    @Override
    public Tree createTree() {
        return new NetherFungus();
    }

    @Override
    public Soil createSoil() {
        return new Netherrack();
    }
}