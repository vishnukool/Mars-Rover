package mars;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;

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

    }
}
