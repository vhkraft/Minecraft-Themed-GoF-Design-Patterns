package com.vhkraft.behavioral.interpreter;

/**
 * Abstract expression interface defining the interpretation contract.
 */
public interface CommandExpression {
    /**
     * Interprets the expression within the given world context.
     * 
     * @param context the active world context
     */
    void interpret(WorldContext context);
}