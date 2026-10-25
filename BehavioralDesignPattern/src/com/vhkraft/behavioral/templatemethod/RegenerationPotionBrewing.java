package com.vhkraft.behavioral.templatemethod;

/**
 * Concrete subclass implementing the specific recipe steps for an Extended Potion of Regeneration.
 * Overrides the enhancement hook to add Redstone Dust.
 */
public class RegenerationPotionBrewing extends BrewingStandWorkflow {

    @Override
    protected void addMainIngredient() {
        System.out.println("[Recipe] Adding Ghast Tear ingredient -> Transformed into Potion of Regeneration I.");
    }

    @Override
    protected boolean shouldEnhance() {
        // Override hook to trigger optional enhancement step
        return true;
    }

    @Override
    protected void applyEnhancement() {
        System.out.println("[Enhancement Hook] Adding Redstone Dust -> Extended duration to 1:30 minutes!");
    }
}