package com.vhkraft.behavioral.command;

/**
 * Command interface defining the contract for armor stand pose adjustments 
 * with support for execution and undo operations.
 */
public interface Command {
    
    /**
     * Executes the pose adjustment action.
     */
    void execute();

    /**
     * Reverts the pose adjustment action to its previous state.
     */
    void undo();
}