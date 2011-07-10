package mars;

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
 * Time: 12:29 AM
 * To change this template use File | Settings | File Templates.
 */
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
        CurrentDirection currentDirection =new CurrentDirectionSouth(marsRover);
        CoordinatePosition coordinatePosition1 = new CoordinatePosition(2,4);
        when(marsRover.getPosition()).thenReturn(coordinatePosition1);

        CoordinatePosition coordinatePosition2 = new CoordinatePosition(2,3);
        assertTrue(currentDirection.moveForward().equals(coordinatePosition2));

    }
}
