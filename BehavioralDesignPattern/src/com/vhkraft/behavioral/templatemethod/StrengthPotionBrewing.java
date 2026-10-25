package com.vhkraft.behavioral.templatemethod;

/**
 * Concrete subclass implementing the specific recipe steps for a Potion of Strength.
 */
public class StrengthPotionBrewing extends BrewingStandWorkflow {

    @Override
    protected void addMainIngredient() {
        System.out.println("[Recipe] Adding Blaze Powder ingredient -> Transformed into Potion of Strength I (+3 Attack Damage).");
    }
}