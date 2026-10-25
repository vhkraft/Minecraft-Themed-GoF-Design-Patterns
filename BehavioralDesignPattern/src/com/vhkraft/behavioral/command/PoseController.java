package com.vhkraft.behavioral.command;

import java.util.Stack;

/**
 * Invoker class representing the Pose Adjuster Stick tool. 
 * Manages command execution and history stacking for undo functionality.
 */
public class PoseController {
    private final Stack<Command> history = new Stack<>();

    /**
     * Executes a command and pushes it onto the history stack.
     * 
     * @param command the command to execute
     */
    public void executeCommand(Command command) {
        command.execute();
        history.push(command);
    }

    /**
     * Undoes the last executed command from the history stack.
     */
    public void undoLastCommand() {
        if (!history.isEmpty()) {
            Command command = history.pop();
            command.undo();
        } else {
            System.out.println("[Pose Controller] No adjustments to undo!");
        }
    }
}