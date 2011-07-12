package test.unit;

import mars.*;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CurrentDirectionSouthTest {
    @Test
    public void testTurnLeft() throws Exception {
        MarsRover marsRover= mock(MarsRover.class);
        CurrentMovingDirectionSouth currentDirectionSouth=new CurrentMovingDirectionSouth(marsRover);
        assertThat(currentDirectionSouth.turnLeft(), is('E'));
    }

    @Test
    public void testTurnRight() throws Exception {
        MarsRover marsRover= mock(MarsRover.class);
        CurrentMovingDirectionSouth currentDirectionSouth=new CurrentMovingDirectionSouth(marsRover);
        assertThat(currentDirectionSouth.turnRight(), is('W'));
    }

    @Test
    public void testMoveForward() throws Exception {
         MarsRover marsRover= mock(MarsRover.class);
         Plateau.setPlateau(5, 5);
        CurrentMovingDirection currentMovingDirection =new CurrentMovingDirectionSouth(marsRover);
        CoordinatePosition coordinatePosition1 = new CoordinatePosition(2,4);
        when(marsRover.getPosition()).thenReturn(coordinatePosition1);

        CoordinatePosition coordinatePosition2 = new CoordinatePosition(2,3);
        assertTrue(currentMovingDirection.moveForward().equals(coordinatePosition2));

    }

     @Test
    public void testToString(){
        MarsRover marsRover= mock(MarsRover.class);
        CurrentMovingDirectionSouth currentDirectionSouth=new CurrentMovingDirectionSouth(marsRover);
        assertThat(currentDirectionSouth.toString(),is("S"));
    }

}
