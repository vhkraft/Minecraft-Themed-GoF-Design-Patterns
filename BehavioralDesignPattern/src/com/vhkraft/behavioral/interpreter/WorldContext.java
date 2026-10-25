package com.vhkraft.behavioral.interpreter;

/**
 * Context class representing the Minecraft world state 
 * manipulated by interpreted command expressions.
 */
public class WorldContext {
    private String timeOfDay = "Night";
    private String weatherState = "Thunderstorm";

    public void setTimeOfDay(String timeOfDay) {
        this.timeOfDay = timeOfDay;
        System.out.println("[World State Updated] Time set to: " + timeOfDay);
    }

    public void setWeatherState(String weatherState) {
        this.weatherState = weatherState;
        System.out.println("[World State Updated] Weather set to: " + weatherState);
    }

    public void displayStatus() {
        System.out.println("-> Current World Status [Time: " + timeOfDay + " | Weather: " + weatherState + "]");
    }
}