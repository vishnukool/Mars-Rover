package mars;

public class CurrentMovingDirectionSouth extends CurrentMovingDirection {

    public CurrentMovingDirectionSouth(MarsRover rover){
        this.rover=rover;
        state='S';
    }
    @Override
    public char turnLeft() {
         rover.SetDirectionTo(new CurrentMovingDirectionEast(rover));
        return 'E';
    }

    @Override
    public char turnRight() {
         rover.SetDirectionTo(new CurrentMovingDirectionWest(rover));
        return 'W';
    }

    @Override
    public CoordinatePosition moveForward() {
        CoordinatePosition position = rover.getPosition();
        position.setYOrdinate(position.getYOrdinate() - 1);
        rover.setPosition(position);
        return position;
    }
}
