package com.isep.algo.tp2.maze.game;

import com.isep.algo.tp2.maze.door.Door;
import com.isep.algo.tp2.maze.door.DoorWithSpell;
import com.isep.algo.tp2.maze.room.EnchantedRoom;
import com.isep.algo.tp2.maze.room.Room;
import com.isep.algo.tp2.maze.wall.SecretPassageWall;
import com.isep.algo.tp2.maze.wall.Wall;

/**
 * Created by Guillaume on 01/03/2017.
 */
public class EnchantedMazeGame extends MazeGame {

    @Override
    public Door makeDoor(Room r1, Room r2) {
        return new DoorWithSpell(r1, r2);
    }

    @Override
    public Room makeRoom(int n) {
        return new EnchantedRoom(n);
    }

    @Override
    public Wall makeWall() {
        return new SecretPassageWall();
    }

}
