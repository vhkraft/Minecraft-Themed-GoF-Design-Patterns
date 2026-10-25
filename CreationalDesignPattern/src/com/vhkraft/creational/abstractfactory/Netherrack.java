package com.vhkraft.creational.abstractfactory;

/**
 * Represents a Netherrack block specific to the Nether biome family.
 * Implements the Soil abstract product interface.
 */
public class Netherrack implements Soil {
    private String name;

    /**
     * Initializes the Netherrack block with fiery Nether properties.
     */
    public Netherrack() {
        this.name = "Netherrack";
    }

    @Override
    public void placeBlock() {
        System.out.println("[Block] Placed burning red " + name + " that can sustain eternal fire.");
    }

    @Override
    public String getSoilName() {
        return name;
    }
}