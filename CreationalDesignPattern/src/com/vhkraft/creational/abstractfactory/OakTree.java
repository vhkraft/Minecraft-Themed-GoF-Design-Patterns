package com.vhkraft.creational.abstractfactory;

/**
 * Represents an Oak Tree flora object specific to the Overworld biome family.
 * Implements the Tree abstract product interface.
 */
public class OakTree implements Tree {
    private String name;

    /**
     * Initializes the Oak Tree with standard Overworld properties.
     */
    public OakTree() {
        this.name = "Oak Tree";
    }

    @Override
    public void grow() {
        System.out.println("[Flora] " + name + " branches out, rustling green leaves in the breeze.");
    }

    @Override
    public String getTreeName() {
        return name;
    }
}