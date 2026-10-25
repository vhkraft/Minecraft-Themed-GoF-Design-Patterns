package com.vhkraft.structural.facade;

/**
 * Client class simulating a Minecraft player using the Crafting Recipe Book Facade.
 */
public class TestFacade {
    public static void main(String[] args) {
        System.out.println("[System] === Minecraft Crafting Recipe Book Test ===");

        // 1. Create the Facade object (hiding all subsystem complexity)
        CraftingRecipeBookFacade recipeBook = new CraftingRecipeBookFacade();

        // 2. Client performs a complex action with a single simple method call
        recipeBook.quickCraftItem("Enchantment Table");

        System.out.println("[System] === Test Completed Successfully ===");
    }
}
