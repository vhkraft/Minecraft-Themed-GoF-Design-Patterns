package com.vhkraft.creational.builder;

/**
 * Represents a custom Enchanted Trident product in Minecraft.
 * Contains complex optional attributes such as loyalty level, channeling, 
 * impaling, unbreaking, and riptide. Immutable once built.
 */
public class EnchantedTrident {
    private final String name;
    private final int loyaltyLevel;
    private final boolean hasChanneling;
    private final int impalingLevel;
    private final int unbreakingLevel;
    private final int riptideLevel;

    /**
     * Private constructor invoked exclusively by the nested Builder class.
     * 
     * @param builder the configured builder containing trident parameters
     */
    private EnchantedTrident(Builder builder) {
        this.name = builder.name;
        this.loyaltyLevel = builder.loyaltyLevel;
        this.hasChanneling = builder.hasChanneling;
        this.impalingLevel = builder.impalingLevel;
        this.unbreakingLevel = builder.unbreakingLevel;
        this.riptideLevel = builder.riptideLevel;
    }

    /**
     * Executes trident combat or mobility action based on configured enchantments.
     */
    public void throwTrident() {
        System.out.println("[Combat] Throws " + name + " into the stormy sky!");
        if (loyaltyLevel > 0) {
            System.out.println("[Enchantment] Loyalty " + loyaltyLevel + " triggers! Trident flies back to the player.");
        }
        if (hasChanneling) {
            System.out.println("[Enchantment] Channeling triggers! Lightning strikes the target.");
        }
        if (riptideLevel > 0) {
            System.out.println("[Enchantment] Riptide " + riptideLevel + " launches the player through water/rain!");
        }
    }

    /**
     * Prints current trident specifications and enchantment levels.
     */
    public void inspect() {
        System.out.println("[Trident Specs] " + name + " [Loyalty: " + loyaltyLevel + 
            ", Channeling: " + hasChanneling + ", Impaling: " + impalingLevel + 
            ", Unbreaking: " + unbreakingLevel + ", Riptide: " + riptideLevel + "]");
    }

    /**
     * Static Builder class for constructing EnchantedTrident instances step-by-step 
     * using a fluent method-chaining API.
     */
    public static class Builder {
        private String name = "Standard Trident";
        private int loyaltyLevel = 0;
        private boolean hasChanneling = false;
        private int impalingLevel = 0;
        private int unbreakingLevel = 0;
        private int riptideLevel = 0;

        /**
         * Sets a custom name for the trident.
         * 
         * @param name custom item name
         * @return current builder reference for method chaining
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Configures the Loyalty enchantment level.
         * 
         * @param level loyalty level (1-3)
         * @return current builder reference
         */
        public Builder loyalty(int level) {
            this.loyaltyLevel = level;
            return this;
        }

        /**
         * Enables or disables Channeling.
         * 
         * @param channeling true to enable lightning summoning
         * @return current builder reference
         */
        public Builder channeling(boolean channeling) {
            this.hasChanneling = channeling;
            return this;
        }

        /**
         * Configures the Impaling enchantment level.
         * 
        * @param level impaling level (1-5)
         * @return current builder reference
         */
        public Builder impaling(int level) {
            this.impalingLevel = level;
            return this;
        }

        /**
         * Configures the Unbreaking enchantment level.
         * 
         * @param level unbreaking level (1-3)
         * @return current builder reference
         */
        public Builder unbreaking(int level) {
            this.unbreakingLevel = level;
            return this;
        }

        /**
         * Configures the Riptide enchantment level.
         * 
         * @param level riptide level (1-3)
         * @return current builder reference
         */
        public Builder riptide(int level) {
            this.riptideLevel = level;
            return this;
        }

        /**
         * Validates business rules and constructs the immutable EnchantedTrident instance.
         * 
         * @return fully configured EnchantedTrident object
         * @throws IllegalStateException if conflicting enchantments are detected
         */
        public EnchantedTrident build() {
            if (riptideLevel > 0 && (loyaltyLevel > 0 || hasChanneling)) {
                throw new IllegalStateException("Conflict: Riptide is mutually exclusive with Loyalty and Channeling!");
            }
            return new EnchantedTrident(this);
        }
    }
}