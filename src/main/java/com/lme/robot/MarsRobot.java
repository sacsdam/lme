package com.lme.robot;

import com.lme.robot.commands.CommandParser;
import com.lme.robot.commands.ICommand;
import com.lme.robot.planet.Coordinates;
import com.lme.robot.planet.Direction;
import com.lme.robot.planet.Grid;

import java.util.List;

public class MarsRobot {

    private Coordinates currentCoordinates;
    private Direction currentDirection;
    private Grid grid;
    boolean isOffGrid = false;


    public MarsRobot(final Grid grid, final Direction direction, final Coordinates coordinates) {
        this.grid = grid;
        this.currentDirection = direction;
        this.currentCoordinates = coordinates;
    }

    public String currentLocation() {

        return isOffGrid ?currentCoordinates.toString() + " " + currentDirection.toString()+ "LOST" : currentCoordinates.toString() + " " + currentDirection.toString() ;
    }
    public void turnLeft() {
        this.currentDirection = this.currentDirection.left();
    }


    public void turnRight() {
        this.currentDirection = this.currentDirection.right();
    }

    public void move() {
        Coordinates positionAfterMove = currentCoordinates.getNewCoordinatesForStepSize(currentDirection.stepSizeForXAxis(), currentDirection.stepSizeForYAxis());

        if(grid.isWithinBounds(positionAfterMove))
            currentCoordinates = currentCoordinates.getNewCoordinatesFor(currentDirection.stepSizeForXAxis(), currentDirection.stepSizeForYAxis());
        else
            isOffGrid = true;

    }


    public void run(final String commandString) {
        List<ICommand> roverCommands = new CommandParser(commandString).toCommands();
        roverCommands.forEach(command -> command.execute(this));
    }
}
