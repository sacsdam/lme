package com.lme.robot.planet;

public class Grid {

    private Coordinates topRightCoordinates = new Coordinates(0, 0);
    private Coordinates bottomLeftCoordinates = new Coordinates(0, 0);

    public Grid(final int topRightXCoordinate, final int topRightYCoordinate) {
        this.topRightCoordinates = this.topRightCoordinates.getNewCoordinatesFor(topRightXCoordinate, topRightYCoordinate);
    }

    public boolean isWithinBounds(final Coordinates coordinates) {
        return this.bottomLeftCoordinates.isOutsideBounds(coordinates) && this.topRightCoordinates.isWithinBounds(coordinates);
    }




}
