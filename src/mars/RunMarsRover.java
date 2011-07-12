package mars;

public class RunMarsRover {

    public static void main(String[] args){

        Plateau plateau=new Plateau(5,5);
        
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
