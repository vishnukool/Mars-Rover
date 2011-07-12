package mars;

import java.util.Iterator;

public class Main {

    public static void main(String[] args){
            ParseRoverInputs parseRoverInputs =new ParseRoverInputs();

            parseRoverInputs.parseRoverInputAndGetValues();
            Plateau.setPlateau(parseRoverInputs.plateauLimitX,parseRoverInputs.plateauLimitY);

            Iterator<String> itrCommand = parseRoverInputs.command.iterator();
            Iterator<Integer> itrX = parseRoverInputs.roverStartCoordinatesX.iterator();
            Iterator<Integer> itrY = parseRoverInputs.roverStartCoordinatesY.iterator();
            Iterator<Character> itrD = parseRoverInputs.roverStartDirection.iterator();

            while(itrCommand.hasNext()){
            MarsRover marsRover=new MarsRover(itrX.next().intValue(),itrY.next().intValue(),itrD.next().charValue());
            marsRover.executeCommand(itrCommand.next());
            System.out.println(marsRover);
            }

    }
}
