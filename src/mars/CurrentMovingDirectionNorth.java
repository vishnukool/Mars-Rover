package mars;

public class CurrentMovingDirectionNorth extends CurrentMovingDirection {

    public CurrentMovingDirectionNorth(MarsRover rover){
        this.rover=rover;
        state='N';
    }

    @Override
    public char turnLeft() {
        rover.SetDirectionTo(new CurrentMovingDirectionWest(rover));
        return 'W';
    }

    @Override
    public char turnRight() {
        rover.SetDirectionTo(new CurrentMovingDirectionEast(rover));
        return 'E';
    }

    @Override
    public CoordinatePosition moveForward() {
         CoordinatePosition position = rover.getPosition();
        position.setYOrdinate(position.getYOrdinate() + 1);
        rover.setPosition(position);
        return position;
    }
}
