package mars;

/**
 * Created by IntelliJ IDEA.
 * User: vishnuk
 * Date: 7/11/11
 * Time: 1:48 AM
 * To change this template use File | Settings | File Templates.
 */
public class RunMarsRover {

    public static void main(String[] args){


        MarsRover marsRoverOne=new MarsRover(1,2,'N');
        MarsRover marsRoverTwo=new MarsRover(3,3,'E');
        String commandOne="LMLMLMLMM";
        String commandTwo="MMRMMRMRRM";

        marsRoverOne.executeCommand(commandOne);
        marsRoverTwo.executeCommand(commandTwo);
        System.out.println(marsRoverOne);
        System.out.println(marsRoverTwo);
    }

}
