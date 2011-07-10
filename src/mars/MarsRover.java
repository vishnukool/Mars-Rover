package mars;

import org.omg.PortableServer.Current;

/**
 * Created by IntelliJ IDEA.
 * User: vishnuk
 * Date: 7/10/11
 * Time: 2:22 PM
 * To change this template use File | Settings | File Templates.
 */
public class MarsRover {

   public CoordinatePosition roverPosition;
   public CurrentDirection roverDirection;

    public MarsRover(){}
    public MarsRover(int x, int y, char direction) {
        initStates(direction);
        roverPosition = new CoordinatePosition(x, y);
    }

    private void initStates(char direction) {

        switch (direction) {
            case 'N':
                roverDirection = new CurrentDirectionNorth();
                break;
            case 'S':
                roverDirection = new CurrentDirectionSouth();
                break;

            case 'E':
                roverDirection = new CurrentDirectionEast();
                break;

            case 'W':
                roverDirection = new CurrentDirectionWest();
                break;
        }

    }

    public void setPosition(CoordinatePosition coordinatePosition) {
        this.roverPosition = coordinatePosition;
    }

    public void SetDirectionTo(CurrentDirection newDirection) {
         roverDirection = newDirection;
       }

    public void executeCommand(String command) {
        char[] commandToCharacter = command.toCharArray();
        for (char tempChar : commandToCharacter) {
            switch (tempChar) {
                case 'R':
                    roverDirection.turnRight();
                case 'L':
                    roverDirection.turnLeft();

                case 'M':
                     roverDirection.moveForward();

            }

        }
    }

    public CoordinatePosition getPosition() {
        return roverPosition;
    }

    public CurrentDirection getCurrentDirection(){
        return roverDirection;
    }

    

}
