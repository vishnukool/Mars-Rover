package test.java;

import cuke4duke.annotation.I18n.EN.Then;
import cuke4duke.annotation.I18n.EN.When;
import cuke4duke.annotation.I18n.EN.Given;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import mars.MarsRover;
import mars.Plateau;

public class MarsRRoverFeature {

    Plateau plateau;
    MarsRover marsRover;

    @Given("^the Plateau size is ([0-9]*) ([0-9]*)$")
    public void thePlateauSizeIs(int maximumX, int maximumY) {
        System.out.println(maximumX + " " + maximumY);
        plateau.setPlateau(maximumX,maximumY);
}

    @When("^the Rover position is ([0-9]*) ([0-9]*) ([A-z])$")
         public void theRoverPositionIs12N(int x, int y, String c ) {
         System.out.println(x + " " + y +" " + c );
         marsRover=new MarsRover(x,y,c.charAt(0));

}
    
    @When("^the Rover command is ([A-z]*)$")
        public void theRoverCommandIs(String command) {
        System.out.println(command);
        marsRover.executeCommand(command);
    }

    @Then("^the final position is ([^\"]*)$")
    public void theFinalPositionIs(String output) {
        assertThat(marsRover.toString(),is(output));
}

}
