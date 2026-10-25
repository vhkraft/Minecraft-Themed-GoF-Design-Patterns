package com.vhkraft.behavioral.interpreter;

import java.util.ArrayList;
import java.util.List;

/**
 * Non-terminal composite expression executing a sequence of command expressions in order.
 */
public class CommandSequenceExpression implements CommandExpression {
    private final List<CommandExpression> expressions = new ArrayList<>();

    public void addExpression(CommandExpression expression) {
        expressions.add(expression);
    }

    @Override
    public void interpret(WorldContext context) {
        System.out.println("[Interpreter] Executing command sequence (" + expressions.size() + " commands)...");
        for (CommandExpression expr : expressions) {
            expr.interpret(context);
        }
    }
}