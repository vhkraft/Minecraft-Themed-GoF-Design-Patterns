package com.vhkraft.behavioral.mediator;

/**
 * Abstract colleague base class representing an entity in the village 
 * that communicates through the mediator.
 */
public abstract class Colleague {
    protected Mediator mediator;
    protected String name;

    /**
     * Constructs a colleague linked to a mediator.
     * 
     * @param mediator the central mediator
     * @param name identifier for the colleague
     */
    public Colleague(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    /**
     * Sends a signal to the mediator.
     * 
     * @param event the event string
     */
    public void send(String event) {
        mediator.notify(this, event);
    }

    /**
     * Receives a reaction command from the mediator.
     * 
     * @param event the command event to react to
     */
    public abstract void receive(String event);

    public String getName() {
        return name;
    }
}