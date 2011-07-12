package mars;

public class MarsRover {

    private CoordinatePosition roverPosition;
    private CurrentMovingDirection roverMovingDirection;

    public MarsRover(int x, int y, char direction) {
        initStates(direction);
        roverPosition = new CoordinatePosition(x, y);
    }

    private void initStates(char direction) {

        switch (direction) {
            case 'N':
                roverMovingDirection = new CurrentMovingDirectionNorth(this);
                break;
            case 'S':
                roverMovingDirection = new CurrentMovingDirectionSouth(this);
                break;

            case 'E':
                roverMovingDirection = new CurrentMovingDirectionEast(this);
                break;

            case 'W':
                roverMovingDirection = new CurrentMovingDirectionWest(this);
                break;
        }

    }

    public void setPosition(CoordinatePosition coordinatePosition) {
        this.roverPosition = coordinatePosition;
    }

    public void SetDirectionTo(CurrentMovingDirection newMovingDirection) {
        roverMovingDirection = newMovingDirection;
    }

    public void executeCommand(String command) {
        char[] commandToCharacter = command.toCharArray();
        for (char tempChar : commandToCharacter) {
            switch (tempChar) {
                case 'R':
                    roverMovingDirection.turnRight();
                    break;
                case 'L':
                    roverMovingDirection.turnLeft();
                    break;

                case 'M':
                    roverMovingDirection.moveForward();

            }

        }
    }

    public CoordinatePosition getPosition() {
        return roverPosition;
    }

    public CurrentMovingDirection getCurrentDirection() {
        return roverMovingDirection;
    }

    public String toString() {
        return roverPosition.toString() + " " + roverMovingDirection.toString();
    }


}
