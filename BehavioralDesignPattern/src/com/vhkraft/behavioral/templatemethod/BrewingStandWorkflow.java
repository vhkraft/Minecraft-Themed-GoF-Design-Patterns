package com.vhkraft.behavioral.templatemethod;

/**
 * Abstract class defining the invariant template method for brewing potions in Minecraft.
 * Controls the fixed execution order of the brewing process.
 */
public abstract class BrewingStandWorkflow {

    /**
     * The Template Method defining the fixed brewing algorithm sequence.
     * Declared as final to prevent subclasses from overriding the workflow structure.
     */
    public final void brewPotion() {
        heatBrewingStand();
        fillWaterBottles();
        brewAwkwardBase();
        addMainIngredient();
        if (shouldEnhance()) {
            applyEnhancement();
        }
        System.out.println("[Brewing Stand] Potion brewing complete! Bottled and ready.\n");
    }

    // Common concrete step 1
    private void heatBrewingStand() {
        System.out.println("[Brewing Stand] Consuming Blaze Powder to heat the stand...");
    }

    // Common concrete step 2
    private void fillWaterBottles() {
        System.out.println("[Brewing Stand] Placing 3 Glass Water Bottles in brewing slots...");
    }

    // Common concrete step 3
    private void brewAwkwardBase() {
        System.out.println("[Brewing Stand] Brewing Nether Wart -> Base converted to Awkward Potion.");
    }

    /**
     * Primitive operation to be implemented by concrete potion recipes.
     */
    protected abstract void addMainIngredient();

    /**
     * Hook method: optional step for modifying potion intensity or duration.
     * Can be overridden by subclasses. Default implementation returns false.
     * 
     * @return true if enhancement should be applied
     */
    protected boolean shouldEnhance() {
        return false;
    }

    /**
     * Primitive operation for applying optional enhancements (Redstone / Glowstone).
     * Called only if shouldEnhance() returns true.
     */
    protected void applyEnhancement() {
        // Default no-op
    }
}