package com.uom.worldofzuul;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/**
 * Class Room - a room in an adventure game.
 * <p>
 * This class is part of the "World of Zuul" application.
 * "World of Zuul" is a very simple, text based adventure game.
 * <p>
 * A "Room" represents one location in the scenery of the game.  It is
 * connected to other rooms via exits.  The exits are labelled north,
 * east, south, west.  For each direction, the room stores a reference
 * to the neighboring room, or null if there is no exit in that direction.
 *
 * @author Michael Kolling and David J. Barnes
 * @version 2006.03.30
 */
public class Room {
    private final String description;
    private HashMap<String, Room> exits;

    /**
     * Create a room described "description". Initially, it has
     * no exits. "description" is something like "a kitchen" or
     * "an open court yard".
     *
     * @param description The room's description.
     */
    public Room(String description) {
        this.description = description;
        exits = new HashMap<>();
    }

    /**
     * Define one exit for this room.  Every direction leads
     * to another room.
     *
     * @param direction The direction of the Exit.
     * @param room  The room that the exit connects to.
     */
    public void setExit(String direction, Room room) {
        exits.put(direction, room);
    }

    public Room getExit(String direction) {
        return exits.get(direction);
    }

    public Set<String> getAllExits(){
        return exits.keySet();
    }

    /**
     * @return The description of the room.
     */
    public String getDescription() {
        return description;
    }

}
