package com.vhkraft.behavioral.mediator;

/**
 * Concrete colleague representing an Iron Golem who marches to defend the village center.
 */
public class IronGolemColleague extends Colleague {

    /**
     * Constructs an iron golem colleague.
     * 
     * @param mediator central bell mediator
     * @param name golem designation
     */
    public IronGolemColleague(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void receive(String event) {
        if ("RAID_ALERT".equals(event)) {
            System.out.println("[Iron Golem - " + name + "] Bell heard! Marching to village center to scan for hostile raiders.");
        }
    }
}