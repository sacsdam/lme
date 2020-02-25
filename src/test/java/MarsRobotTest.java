import com.lme.robot.MarsRobot;
import com.lme.robot.planet.Coordinates;
import com.lme.robot.planet.Direction;
import com.lme.robot.planet.Grid;
import org.junit.Assert;
import org.junit.Test;

public class MarsRobotTest {


    @Test
    public void canProvideCurrentLocationAsString() {
        //Given
        Grid grid = new Grid(5,3);
        Coordinates startingPosition = new Coordinates(1,1);

        //When
        MarsRobot marsRobot = new MarsRobot(grid, Direction.E, startingPosition);

        //then
        Assert.assertEquals("1 1 E", marsRobot.currentLocation());
    }

    @Test
    public void canRotateLeft() {
        //Given
        Grid grid = new Grid(5,3);
        Coordinates startingPosition = new Coordinates(1,1);
        MarsRobot marsRobot = new MarsRobot(grid, Direction.N, startingPosition);

        //When
        marsRobot.turnLeft();

        //then
        Assert.assertEquals("1 1 W", marsRobot.currentLocation());
    }

    @Test
    public void canRotateRight() {
        //Given
        Grid grid = new Grid(5,3);
        Coordinates startingPosition = new Coordinates(1,1);
        MarsRobot marsRobot = new MarsRobot(grid, Direction.N, startingPosition);

        //When
        marsRobot.turnRight();

        //then
        Assert.assertEquals("1 1 E", marsRobot.currentLocation());
    }

    @Test
    public void canMoveForward() {
        //Given
        Grid grid = new Grid(5,3);
        Coordinates startingPosition = new Coordinates(1,1);
        MarsRobot marsRobot = new MarsRobot(grid, Direction.N, startingPosition);

        //When
        marsRobot.move();

        //then
        Assert.assertEquals("1 2 N", marsRobot.currentLocation());
    }


}
