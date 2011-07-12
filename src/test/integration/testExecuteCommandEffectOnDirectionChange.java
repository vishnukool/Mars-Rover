package test.integration;

import mars.CurrentDirectionEast;
import mars.MarsRover;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class testExecuteCommandEffectOnDirectionChange {
    @Test
    public void testExecuteCommand() {
        MarsRover testingMarsRover=new MarsRover(2,4,'N');
        testingMarsRover.executeCommand("R");

        CurrentDirectionEast currentDirectionEast=new CurrentDirectionEast(testingMarsRover);
        assertTrue(testingMarsRover.getCurrentDirection().equals(currentDirectionEast));


    }

}
