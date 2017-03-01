package com.isep.algo.tp2.maze.game;

import com.isep.algo.tp2.maze.Direction;
import com.isep.algo.tp2.maze.Maze;
import com.isep.algo.tp2.maze.door.Door;
import com.isep.algo.tp2.maze.room.Room;
import com.isep.algo.tp2.maze.wall.Wall;

/**
 * Created by Guillaume on 01/03/2017.
 */
public class MazeGame {
    public Maze makeMaze() {
        return new Maze();
    }

    public Room makeRoom(int n) {
        return new Room(n);
    }

    public Wall makeWall() {
        return new Wall();
    }

    public Door makeDoor(Room r1, Room r2) {
        return new Door(r1, r2);
    }

    public Maze CreateMaze() {
        Maze aMaze = makeMaze();
        Room r1 = makeRoom(1);
        Room r2 = makeRoom(2);
        Door theDoor = makeDoor(r1, r2);
        aMaze.addRoom(r1);
        aMaze.addRoom(r2);
        r1.setSide(Direction.NORTH, makeWall());
        r1.setSide(Direction.EAST, theDoor);
        r1.setSide(Direction.SOUTH, makeWall());
        r1.setSide(Direction.WEST, makeWall());

        r2.setSide(Direction.NORTH, makeWall());
        r2.setSide(Direction.EAST, makeWall());
        r2.setSide(Direction.SOUTH, makeWall());
        r2.setSide(Direction.WEST, theDoor);
        return aMaze;
    }
}
