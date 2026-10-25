package com.vhkraft.behavioral.interpreter;

/**
 * Terminal expression handling time-related chat commands.
 */
public class TimeCommandExpression implements CommandExpression {
    private final String timeValue;

    public TimeCommandExpression(String timeValue) {
        this.timeValue = timeValue;
    }

    @Override
    public void interpret(WorldContext context) {
        System.out.println("[Interpreter] Executing time command -> /time set " + timeValue);
        context.setTimeOfDay(timeValue);
    }
}