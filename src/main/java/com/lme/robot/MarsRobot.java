package com.lme.robot;

import com.lme.robot.planet.Coordinates;
import com.lme.robot.planet.Direction;
import com.lme.robot.planet.Grid;

public class MarsRobot {

    private Coordinates currentCoordinates;
    private Direction currentDirection;
    private Grid grid;


    public MarsRobot(final Grid grid, final Direction direction, final Coordinates coordinates) {
        this.grid = grid;
        this.currentDirection = direction;
        this.currentCoordinates = coordinates;
    }

    public String currentLocation() {
        return currentCoordinates.toString() + " " + currentDirection.toString();
    }
    public void turnLeft() {
        this.currentDirection = this.currentDirection.left();
    }


    public void turnRight() {
        this.currentDirection = this.currentDirection.right();
    }
}
