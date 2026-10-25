package com.vhkraft.behavioral.mediator;

/**
 * Concrete colleague representing a Villager who seeks shelter when the bell rings.
 */
public class VillagerColleague extends Colleague {

    /**
     * Constructs a villager colleague.
     * 
     * @param mediator central bell mediator
     * @param name villager designation
     */
    public VillagerColleague(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void receive(String event) {
        if ("RAID_ALERT".equals(event)) {
            System.out.println("[Villager - " + name + "] Bell heard! Panic! Running indoors to close doors and hide.");
        }
    }
}