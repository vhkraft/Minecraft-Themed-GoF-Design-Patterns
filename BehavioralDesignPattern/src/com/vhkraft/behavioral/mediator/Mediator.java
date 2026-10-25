package com.vhkraft.behavioral.mediator;

/**
 * Mediator interface defining the contract for broadcasting events 
 * between registered village entities.
 */
public interface Mediator {
    
    /**
     * Notifies the mediator that a specific event has occurred from a sender.
     * 
     * @param sender the colleague triggering the event
     * @param event description of the event (e.g., "RAID_ALERT")
     */
    void notify(Colleague sender, String event);
}