package com.vhkraft.creational.abstractfactory;

/**
 * Represents an abstract ground soil block in Minecraft.
 * Defines common behaviors for all concrete soil variations.
 */
public interface Soil {
    void placeBlock();
    String getSoilName();
}