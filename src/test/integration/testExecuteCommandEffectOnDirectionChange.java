package test.integration;

import mars.CurrentMovingDirectionEast;
import mars.MarsRover;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class testExecuteCommandEffectOnDirectionChange {
    @Test
    public void testExecuteCommand() {
        MarsRover testingMarsRover=new MarsRover(2,4,'N');
        testingMarsRover.executeCommand("R");

        CurrentMovingDirectionEast currentDirectionEast=new CurrentMovingDirectionEast(testingMarsRover);
        assertTrue(testingMarsRover.getCurrentDirection().equals(currentDirectionEast));


    }

}
