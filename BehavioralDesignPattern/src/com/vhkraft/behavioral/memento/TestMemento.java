package com.vhkraft.behavioral.memento;

/**
 * Client test class demonstrating the Memento pattern: sleeping in an overworld bed,
 * traveling to the Nether, dying in lava, and respawning safely back at the bed.
 */
public class TestMemento {
    public static void main(String[] args) {
        System.out.println("[System] === Minecraft Bed Checkpoint & Nether Respawn Test ===");

        // 1. Initialize Player at Overworld Base and Caretaker (Bed)
        PlayerCharacter player = new PlayerCharacter("Overworld Base (X: 100, Z: 200)", 20, "[Iron Sword, Diamond Pickaxe, Torches]");
        BedCheckpointCaretaker bedAnchor = new BedCheckpointCaretaker();
        player.displayStatus();

        System.out.println();

        // 2. Sleep in bed to create checkpoint memento
        bedAnchor.setMemento(player.saveStateToCheckpoint());

        System.out.println();

        // 3. Travel to Nether and explore dangerous terrain
        System.out.println("[Player Action] Entering Nether portal to mine Netherite...");
        player.updateState("Nether Wastelands (X: -400, Z: 850)", 14, "[Iron Sword, Diamond Pickaxe, Ancient Debris x3]");

        System.out.println();

        // 4. Disaster strikes: Fall into lava and die!
        System.out.println("[Tragedy] Fell into a lava pool! Player has died in the Nether!");
        player.updateState("Nether Death Screen", 0, "[Empty - All items burned in lava!]");
        player.displayStatus();

        System.out.println();

        // 5. Respawn using the Caretaker's saved memento back at the bed
        System.out.println("[Respawn Event] Clicking 'Respawn' button...");
        player.restoreStateFromCheckpoint(bedAnchor.getMemento());
        player.displayStatus();

        System.out.println("\n[System] === Memento Test Completed Successfully ===");
    }
}