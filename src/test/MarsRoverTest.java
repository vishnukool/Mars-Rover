package test;

import mars.*;
import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.isNotNull;
import static org.mockito.Mockito.verify;


/**
* Created by IntelliJ IDEA.
* User: vishnuk
* Date: 7/10/11
* Time: 4:05 PM
* To change this template use File | Settings | File Templates.
*/
public class MarsRoverTest {

    @Test
    public void testGetPosition() throws Exception {

        CoordinatePosition coordinatePosition=new CoordinatePosition(2,4);

        MarsRover sampleMarsRover=new MarsRover(2,4,'N');
        assertTrue(sampleMarsRover.getPosition().equals(coordinatePosition));
    }

    @Test
    public void testExecuteCommand() {
        MarsRover testingMarsRover = new MarsRover(1,1,'N');
        testingMarsRover.executeCommand("R");
        verify(testingMarsRover.roverDirection).turnRight();
        testingMarsRover.executeCommand("L");
        verify(testingMarsRover.roverDirection).turnLeft();
        testingMarsRover.executeCommand("M");
        verify(testingMarsRover.roverDirection).moveForward();

    }

    @Test
    public void testGetCurrentDirection(){
        MarsRover testingMarsRover = new MarsRover(1,1,'N');
        CurrentDirectionNorth currentDirectionNorth = new CurrentDirectionNorth();
        assertTrue(testingMarsRover.getCurrentDirection().equals(currentDirectionNorth));
    }
}
