package mars;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import org.mockito.Mock;


import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;


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

    }

    @Test
    public void testMoveForward() throws Exception {

    }
}
