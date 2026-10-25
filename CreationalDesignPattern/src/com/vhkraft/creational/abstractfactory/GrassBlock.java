package com.vhkraft.creational.abstractfactory;

/**
 * Represents a Grass Block specific to the Overworld biome family.
 * Implements the Soil abstract product interface.
 */
public class GrassBlock implements Soil {
    private String name;

    /**
     * Initializes the Grass Block with standard Overworld properties.
     */
    public GrassBlock() {
        this.name = "Grass Block";
    }

    @Override
    public void placeBlock() {
        System.out.println("[Block] Placed green " + name + " with soft turf on top.");
    }

    @Override
    public String getSoilName() {
        return name;
    }
}