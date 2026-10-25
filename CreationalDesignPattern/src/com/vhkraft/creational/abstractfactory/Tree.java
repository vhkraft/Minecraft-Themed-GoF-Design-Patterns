package com.vhkraft.creational.abstractfactory;

/**
 * Represents an abstract tree flora entity in Minecraft.
 * Defines common behaviors for all concrete tree variations.
 */
public interface Tree {
    void grow();
    String getTreeName();
}