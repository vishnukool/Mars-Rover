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

   // public MarsRover(){}
    public MarsRover(int x, int y, char direction) {
        initStates(direction);
        roverPosition = new CoordinatePosition(x, y);
    }

    private void initStates(char direction) {

        switch (direction) {
            case 'N':
                roverDirection = new CurrentDirectionNorth(this);
                break;
            case 'S':
                roverDirection = new CurrentDirectionSouth(this);
                break;

            case 'E':
                roverDirection = new CurrentDirectionEast(this);
                break;

            case 'W':
                roverDirection = new CurrentDirectionWest(this);
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
                    break;
                case 'L':
                    roverDirection.turnLeft();
                    break;

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

    public String toString(){
        return roverPosition.toString() + " " + roverDirection.toString();
    }


}
