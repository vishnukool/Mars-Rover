package test.java;

import cuke4duke.annotation.I18n.EN.Then;
import cuke4duke.annotation.I18n.EN.When;
import cuke4duke.annotation.I18n.EN.Given;
//import mars.MarsRover;
//import mars.Plateau;

/**
 * Created by IntelliJ IDEA.
 * User: vishnuk
 * Date: 7/11/11
 * Time: 5:16 AM
 * To change this template use File | Settings | File Templates.
 */
public class MarsRRoverFeature {

//    Plateau plateau;

    @Given("^the Plateau size is ([0-9]*) ([0-9]*)$")
    public void thePlateauSizeIs(int maximumX, int maximumY) {
        System.out.println(maximumX + " " + maximumY);
//        plateau=new Plateau(maximumX,maximumY);
}

    @When("^the Rover position is ([0-9]*) ([0-9]*) ([A-z])$")
    public void theRoverPositionIs12N(int x, int y, String c ) {
         System.out.println(x + " " + y +" " + c );
         c.charAt(0);
//        MarsRover marsRover=new MarsRover(x,y,c.charAt(1));

}
    
    @When("^the Rover command is ([A-z]*)$")
    public void theRoverCommandIs(String command) {
    System.out.println(command);

    }

    @Then("^the final position is ([0-9]*) ([0-9]*) ([A-z])$")
    public void theFinalPositionIs51E(int x, int y, String c) {
    System.out.println(x + " " + y +" " + c);

}

}
