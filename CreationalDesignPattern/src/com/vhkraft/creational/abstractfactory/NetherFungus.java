package com.vhkraft.creational.abstractfactory;

/**
 * Represents a Nether Fungus flora object specific to the Nether biome family.
 * Implements the Tree abstract product interface.
 */
public class NetherFungus implements Tree {
    private String name;

    /**
     * Initializes the Nether Fungus with crimson Nether properties.
     */
    public NetherFungus() {
        this.name = "Nether Fungus";
    }

    @Override
    public void grow() {
        System.out.println("[Flora] " + name + " pulses with eerie crimson spores in the dimension.");
    }

    @Override
    public String getTreeName() {
        return name;
    }
}