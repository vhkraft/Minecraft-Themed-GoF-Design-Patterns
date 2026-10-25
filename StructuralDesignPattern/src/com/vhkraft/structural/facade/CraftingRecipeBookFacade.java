package com.vhkraft.structural.facade;

/**
 * Represents the Crafting Recipe Book Facade.
 * Unifies PlayerInventory, ItemRegistry, and SoundManager into a single call.
 */
public class CraftingRecipeBookFacade {
    private PlayerInventory inventory;
    private ItemRegistry registry;
    private SoundManager soundManager;

    /**
     * Constructs the facade and initializes all underlying subsystem components.
     */
    public CraftingRecipeBookFacade() {
        this.inventory = new PlayerInventory();
        this.registry = new ItemRegistry();
        this.soundManager = new SoundManager();
    }

    /**
     * Executes the complete crafting workflow with a single unified method call.
     * 
     * @param itemToCraft the item name requested by the player
     */
    public void quickCraftItem(String itemToCraft) {
        System.out.println("[Action Bar] Player clicked quick-craft for: " + itemToCraft);
        
        // 1. Validate recipe through registry subsystem
        if (!registry.validateRecipe(itemToCraft)) {
            System.out.println("[System] Crafting failed: Invalid recipe.");
            return;
        }

        // 2. Check and consume resources through inventory subsystem
        if (inventory.hasResources("Diamond", 2) && inventory.hasResources("Obsidian", 4)) {
            inventory.consumeItems("Diamond", 2);
            inventory.consumeItems("Obsidian", 4);
        }

        // 3. Spawn final output item
        registry.spawnCraftedItem(itemToCraft);

        // 4. Play audio and visual effects
        soundManager.playCraftingSound();
        
        System.out.println("[System] Quick-craft sequence completed successfully!");
    }
}
