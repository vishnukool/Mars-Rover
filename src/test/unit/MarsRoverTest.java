package test.unit;

import mars.*;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class MarsRoverTest {

    @Test
    public void testGetPosition() throws Exception {

        CoordinatePosition coordinatePosition=new CoordinatePosition(2,4);
        MarsRover sampleMarsRover=new MarsRover(2,4,'N');
        assertTrue(sampleMarsRover.getPosition().equals(coordinatePosition));
    }

    @Test
    public void testGetCurrentDirection(){
        MarsRover testingMarsRover = new MarsRover(1,1,'N');
        CurrentDirectionNorth currentDirectionNorth = new CurrentDirectionNorth(testingMarsRover);
        assertTrue(testingMarsRover.getCurrentDirection().equals(currentDirectionNorth));
    }

    @Test
    public void testToString(){
        MarsRover marsRover=new MarsRover(2,4,'N');
        assertThat(marsRover.toString(),is("2 4 N"));
    }
}
