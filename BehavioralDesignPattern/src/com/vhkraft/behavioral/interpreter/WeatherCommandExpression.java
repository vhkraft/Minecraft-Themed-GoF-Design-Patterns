package com.vhkraft.behavioral.interpreter;

/**
 * Terminal expression handling weather-related chat commands.
 */
public class WeatherCommandExpression implements CommandExpression {
    private final String weatherValue;

    public WeatherCommandExpression(String weatherValue) {
        this.weatherValue = weatherValue;
    }

    @Override
    public void interpret(WorldContext context) {
        System.out.println("[Interpreter] Executing weather command -> /weather " + weatherValue);
        context.setWeatherState(weatherValue);
    }
}