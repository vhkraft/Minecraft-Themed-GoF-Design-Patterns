package com.vhkraft.behavioral.interpreter;

/**
 * Client test class demonstrating the Interpreter pattern by building 
 * and executing a syntax tree of Minecraft chat commands.
 */
public class TestInterpreter {
    public static void main(String[] args) {
        System.out.println("[System] === Minecraft Chat Command Interpreter Test ===");

        // 1. Initialize world context
        WorldContext world = new WorldContext();
        world.displayStatus();

        System.out.println();

        // 2. Build a composite expression tree representing a morning macro:
        // "/time set day" AND "/weather clear"
        CommandSequenceExpression morningMacro = new CommandSequenceExpression();
        morningMacro.addExpression(new TimeCommandExpression("Day"));
        morningMacro.addExpression(new WeatherCommandExpression("Clear"));

        // 3. Interpret and execute the expression tree against the world context
        System.out.println("[Player Action] Running morning macro command...");
        morningMacro.interpret(world);

        System.out.println();
        world.displayStatus();

        System.out.println("\n[System] === Interpreter Test Completed Successfully ===");
    }
}