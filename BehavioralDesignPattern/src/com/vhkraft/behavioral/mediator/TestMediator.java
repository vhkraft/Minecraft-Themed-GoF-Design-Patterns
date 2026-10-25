package com.vhkraft.behavioral.mediator;

/**
 * Client test class demonstrating the Mediator pattern using the 
 * Village Raid Bell Alarm to coordinate villagers and iron golems.
 */
public class TestMediator {
    public static void main(String[] args) {
        System.out.println("[System] === Minecraft Village Raid Bell Alarm Test ===");

        // 1. Create Mediator (Village Bell)
        VillageBellMediator villageBell = new VillageBellMediator();

        // 2. Create Colleagues and register them with the Mediator
        Colleague villager1 = new VillagerColleague(villageBell, "Fletcher-Bob");
        Colleague villager2 = new VillagerColleague(villageBell, "Librarian-Alice");
        Colleague golem = new IronGolemColleague(villageBell, "Defender-IronGuardian");

        villageBell.registerColleague(villager1);
        villageBell.registerColleague(villager2);
        villageBell.registerColleague(golem);

        System.out.println("[System] Village populated. Raid party spotted on the horizon!\n");

        // 3. Trigger interaction through colleague sending message to mediator
        System.out.println("[Action] Fletcher-Bob spots raiders and sounds the alarm...");
        villager1.send("RING_ALARM");

        System.out.println("\n[System] === Mediator Test Completed Successfully ===");
    }
}