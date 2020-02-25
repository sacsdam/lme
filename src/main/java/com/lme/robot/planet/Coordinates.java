package com.lme.robot.planet;

public class Coordinates {

    private int xCoordinate;
    private int yCoordinate;

    public Coordinates(final int xCoordinate, final int yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public Coordinates getNewCoordinatesFor(final int xCoordinateStepValue, final int yCoordinateStepValue) {
        return new Coordinates(this.xCoordinate + xCoordinateStepValue, this.yCoordinate + yCoordinateStepValue);
    }

    public Coordinates getNewCoordinatesForStepSize(final int xCoordinateStepValue, final int yCoordinateStepValue) {
        return new Coordinates(xCoordinate+xCoordinateStepValue, yCoordinate+yCoordinateStepValue);
    }
    public boolean isWithinBounds(final Coordinates coordinates) {
        return isXCoordinateWithinBounds(coordinates.xCoordinate) && isYCoordinateWithinBounds(coordinates.yCoordinate);
    }
    public boolean isOutsideBounds(final Coordinates coordinates) {
        return isXCoordinateInOutsideBounds(coordinates.xCoordinate) && isYCoordinateInOutsideBounds(coordinates.yCoordinate);
    }

    private boolean isYCoordinateWithinBounds(final int yCoordinate) {
        return yCoordinate <= this.yCoordinate;
    }

    private boolean isXCoordinateWithinBounds(final int xCoordinate) {
        return xCoordinate <= this.xCoordinate;
    }

    private boolean isXCoordinateInOutsideBounds(final int xCoordinate) {
        return xCoordinate >= this.xCoordinate;
    }

    private boolean isYCoordinateInOutsideBounds(final int yCoordinate) {
        return yCoordinate >= this.yCoordinate;
    }

    @Override
    public String toString() {
        StringBuilder coordinateOutput = new StringBuilder();
        coordinateOutput.append(xCoordinate);
        coordinateOutput.append(" ");
        coordinateOutput.append(yCoordinate);
        return coordinateOutput.toString();
    }
}
