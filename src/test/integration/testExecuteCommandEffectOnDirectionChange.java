package test.integration;

import mars.CurrentMovingDirectionEast;
import mars.MarsRover;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

public class testExecuteCommandEffectOnDirectionChange {
    @Test
    public void testExecuteCommand() {
        MarsRover testingMarsRover=new MarsRover(2,4,'N');
        testingMarsRover.executeCommand("R");
        MarsRover mockedMarsRover=mock(MarsRover.class);

        CurrentMovingDirectionEast currentDirectionEast=new CurrentMovingDirectionEast(mockedMarsRover);
        assertTrue(testingMarsRover.getCurrentDirection().equals(currentDirectionEast));

    }

}
