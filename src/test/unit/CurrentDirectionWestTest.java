package test.unit;

import mars.*;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CurrentDirectionWestTest {
    @Test
    public void testTurnLeft() throws Exception {
        MarsRover marsRover= mock(MarsRover.class);
        CurrentDirectionWest currentDirectionWest=new CurrentDirectionWest(marsRover);
        assertThat(currentDirectionWest.turnLeft(), is('S'));
    }

    @Test
    public void testTurnRight() throws Exception {
        MarsRover marsRover= mock(MarsRover.class);
        CurrentDirectionWest currentDirectionWest=new CurrentDirectionWest(marsRover);
        assertThat(currentDirectionWest.turnRight(), is('N'));
    }

    @Test
    public void testMoveForward() throws Exception {
        MarsRover marsRover= mock(MarsRover.class);
         Plateau plateau=new Plateau(5,5);
        CurrentDirection currentDirection =new CurrentDirectionWest(marsRover);
        CoordinatePosition coordinatePosition1 = new CoordinatePosition(2,4);
        when(marsRover.getPosition()).thenReturn(coordinatePosition1);

        CoordinatePosition coordinatePosition2 = new CoordinatePosition(1,4);
        assertTrue(currentDirection.moveForward().equals(coordinatePosition2));

    }

     @Test
    public void testToString(){
        MarsRover marsRover= mock(MarsRover.class);
        CurrentDirectionWest currentDirectionWest=new CurrentDirectionWest(marsRover);
        assertThat(currentDirectionWest.toString(),is("W"));
    }
}
