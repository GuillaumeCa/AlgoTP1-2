package com.isep.algo.tp2.maze.game;

import com.isep.algo.tp2.maze.door.Door;
import com.isep.algo.tp2.maze.door.IronDoor;
import com.isep.algo.tp2.maze.room.Room;
import com.isep.algo.tp2.maze.room.RoomWithABomb;
import com.isep.algo.tp2.maze.wall.BombedWall;
import com.isep.algo.tp2.maze.wall.Wall;

/**
 * Created by Guillaume on 01/03/2017.
 */
public class BombedMazeGame extends MazeGame {

    @Override
    public Room makeRoom(int n) {
        return new RoomWithABomb(n);
    }

    @Override
    public Wall makeWall() {
        return new BombedWall();
    }

    @Override
    public Door makeDoor(Room r1, Room r2) {
        return new IronDoor(r1, r2);
    }
}
