package test.unit;

import static org.hamcrest.core.Is.is;

import mars.*;
import org.junit.Test;
import org.mockito.Mock;


import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


/**
 * Created by IntelliJ IDEA.
 * User: vishnuk
 * Date: 7/10/11
 * Time: 10:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class CurrentDirectionEastTest {
    @Test
    public void testTurnLeft() throws Exception {
        MarsRover marsRover= mock(MarsRover.class);
        CurrentDirectionEast currentDirectionEast=new CurrentDirectionEast(marsRover);
        assertThat(currentDirectionEast.turnLeft(), is('N'));

    }

    @Test
    public void testTurnRight() throws Exception {
        MarsRover marsRover= mock(MarsRover.class);
        CurrentDirectionEast currentDirectionEast=new CurrentDirectionEast(marsRover);
        assertThat(currentDirectionEast.turnRight(), is('S'));

    }

    @Test
    public void testMoveForward() throws Exception {
        MarsRover marsRover= mock(MarsRover.class);
         Plateau plateau=new Plateau(5,5);
        CurrentDirection currentDirection =new CurrentDirectionEast(marsRover);
        CoordinatePosition coordinatePosition1 = new CoordinatePosition(2,4);
        when(marsRover.getPosition()).thenReturn(coordinatePosition1);

        CoordinatePosition coordinatePosition2 = new CoordinatePosition(3,4);
        assertTrue(currentDirection.moveForward().equals(coordinatePosition2));

    }

    @Test
    public void testToString(){
        MarsRover marsRover= mock(MarsRover.class);
        CurrentDirectionEast currentDirectionEast=new CurrentDirectionEast(marsRover);
        assertThat(currentDirectionEast.toString(),is("E"));
    }
}
