package com.vhkraft.behavioral.memento;

/**
 * Caretaker class representing the Bed Checkpoint anchor. 
 * Stores and manages the player state memento without modifying its contents.
 */
public class BedCheckpointCaretaker {
    private PlayerStateMemento memento;

    /**
     * Saves the player state memento at the bed anchor.
     * 
     * @param memento the state snapshot to store
     */
    public void setMemento(PlayerStateMemento memento) {
        this.memento = memento;
        System.out.println("[Bed Checkpoint] Respawn anchor bound successfully!");
    }

    /**
     * Retrieves the stored memento for respawn restoration.
     * 
     * @return the saved PlayerStateMemento
     */
    public PlayerStateMemento getMemento() {
        return memento;
    }
}