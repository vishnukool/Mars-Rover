package test.unit;

import static org.hamcrest.core.Is.is;

import mars.*;
import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class CurrentDirectionEastTest {
    @Test
    public void testTurnLeft() throws Exception {
        MarsRover marsRover= mock(MarsRover.class);
        CurrentMovingDirectionEast currentDirectionEast=new CurrentMovingDirectionEast(marsRover);
        assertThat(currentDirectionEast.turnLeft(), is('N'));

    }

    @Test
    public void testTurnRight() throws Exception {
        MarsRover marsRover= mock(MarsRover.class);
        CurrentMovingDirectionEast currentDirectionEast=new CurrentMovingDirectionEast(marsRover);
        assertThat(currentDirectionEast.turnRight(), is('S'));

    }

    @Test
    public void testMoveForward() throws Exception {
        MarsRover marsRover= mock(MarsRover.class);
         Plateau.setPlateau(5, 5);
        CurrentMovingDirection currentMovingDirection =new CurrentMovingDirectionEast(marsRover);
        CoordinatePosition coordinatePosition1 = new CoordinatePosition(2,4);
        when(marsRover.getPosition()).thenReturn(coordinatePosition1);

        CoordinatePosition coordinatePosition2 = new CoordinatePosition(3,4);
        assertTrue(currentMovingDirection.moveForward().equals(coordinatePosition2));

    }

    @Test
    public void testToString(){
        MarsRover marsRover= mock(MarsRover.class);
        CurrentMovingDirectionEast currentDirectionEast=new CurrentMovingDirectionEast(marsRover);
        assertThat(currentDirectionEast.toString(),is("E"));
    }
}
