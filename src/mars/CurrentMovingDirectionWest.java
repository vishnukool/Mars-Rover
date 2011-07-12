package mars;

public class CurrentMovingDirectionWest extends CurrentMovingDirection {

    public CurrentMovingDirectionWest(MarsRover rover){
        this.rover=rover;
        state='W';
    }

    @Override
    public char turnLeft() {
        rover.SetDirectionTo(new CurrentMovingDirectionSouth(rover));
    return 'S';
    }

    @Override
    public char turnRight() {
        rover.SetDirectionTo(new CurrentMovingDirectionNorth(rover));
    return 'N';
    }

    @Override
    public CoordinatePosition moveForward() {
        CoordinatePosition position = rover.getPosition();
        position.setXOrdinate(position.getXOrdinate() - 1);
        rover.setPosition(position);
        return position;
    }
}
