package mars;

public class CurrentDirectionWest extends CurrentDirection{

    public CurrentDirectionWest(MarsRover rover){
        this.rover=rover;
        state='W';
    }

    @Override
    public char turnLeft() {
        rover.SetDirectionTo(new CurrentDirectionSouth(rover));
    return 'S';
    }

    @Override
    public char turnRight() {
        rover.SetDirectionTo(new CurrentDirectionNorth(rover));
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
