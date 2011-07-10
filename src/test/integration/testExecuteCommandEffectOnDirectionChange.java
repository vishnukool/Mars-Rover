package test.integration;

import mars.CurrentDirectionEast;
import mars.MarsRover;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 * Created by IntelliJ IDEA.
 * User: vishnuk
 * Date: 7/11/11
 * Time: 4:56 AM
 * To change this template use File | Settings | File Templates.
 */
public class testExecuteCommandEffectOnDirectionChange {
    @Test
    public void testExecuteCommand() {
        MarsRover testingMarsRover=new MarsRover(2,4,'N');
        testingMarsRover.executeCommand("R");

        CurrentDirectionEast currentDirectionEast=new CurrentDirectionEast(testingMarsRover);
        assertTrue(testingMarsRover.getCurrentDirection().equals(currentDirectionEast));


    }

}
