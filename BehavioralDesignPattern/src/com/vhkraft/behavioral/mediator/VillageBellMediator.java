package com.vhkraft.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * Concrete mediator representing the Village Bell. Manages registered villagers and 
 * iron golems, coordinating their group responses during raids.
 */
public class VillageBellMediator implements Mediator {
    private final List<Colleague> colleagues = new ArrayList<>();

    /**
     * Registers a village entity to the mediator's network.
     * 
     * @.param colleague entity to add
     */
    public void registerColleague(Colleague colleague) {
        colleagues.add(colleague);
    }

    /**
     * Rings the village bell, broadcasting the raid alert to all registered entities.
     */
    public void ringBell() {
        System.out.println("[Village Bell] *CLANG CLANG CLANG!* Central bell rung by player!");
        for (Colleague colleague : colleagues) {
            colleague.receive("RAID_ALERT");
        }
    }

    @Override
    public void notify(Colleague sender, String event) {
        System.out.println("[Mediator Log] Received event '" + event + "' from " + sender.getName());
        if ("RING_ALARM".equals(event)) {
            ringBell();
        }
    }
}