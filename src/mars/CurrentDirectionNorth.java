package mars;

public class CurrentDirectionNorth extends CurrentDirection{

    public CurrentDirectionNorth(MarsRover rover){
        this.rover=rover;
        state='N';
    }

    @Override
    public char turnLeft() {
        rover.SetDirectionTo(new CurrentDirectionWest(rover));
        return 'W';
    }

    @Override
    public char turnRight() {
        rover.SetDirectionTo(new CurrentDirectionEast(rover));
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
