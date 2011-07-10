package test.unit;

import mars.*;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by IntelliJ IDEA.
 * User: vishnuk
 * Date: 7/11/11
 * Time: 12:18 AM
 * To change this template use File | Settings | File Templates.
 */
public class CurrentDirectionNorthTest {
    @Test
    public void testTurnLeft() throws Exception {
        MarsRover marsRover= mock(MarsRover.class);
        CurrentDirectionNorth currentDirectionNorth=new CurrentDirectionNorth(marsRover);
        assertThat(currentDirectionNorth.turnLeft(), is('W'));
    }

    @Test
    public void testTurnRight() throws Exception {
        MarsRover marsRover= mock(MarsRover.class);
        CurrentDirectionNorth currentDirectionNorth=new CurrentDirectionNorth(marsRover);
        assertThat(currentDirectionNorth.turnRight(), is('E'));

    }

    @Test
    public void testMoveForward() throws Exception {
        MarsRover marsRover= mock(MarsRover.class);
         Plateau plateau=new Plateau(5,5);
        CurrentDirection currentDirection =new CurrentDirectionNorth(marsRover);
        CoordinatePosition coordinatePosition1 = new CoordinatePosition(2,4);
        when(marsRover.getPosition()).thenReturn(coordinatePosition1);

        CoordinatePosition coordinatePosition2 = new CoordinatePosition(2,5);
        assertTrue(currentDirection.moveForward().equals(coordinatePosition2));

    }

    @Test
    public void testToString(){
        MarsRover marsRover= mock(MarsRover.class);
        CurrentDirectionNorth currentDirectionNorth=new CurrentDirectionNorth(marsRover);
        assertThat(currentDirectionNorth.toString(),is("N"));
    }
}
