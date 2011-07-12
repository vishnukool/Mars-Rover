package mars;

public class CurrentDirectionSouth extends CurrentDirection{

    public CurrentDirectionSouth(MarsRover rover){
        this.rover=rover;
        state='S';
    }
    @Override
    public char turnLeft() {
         rover.SetDirectionTo(new CurrentDirectionEast(rover));
        return 'E';
    }

    @Override
    public char turnRight() {
         rover.SetDirectionTo(new CurrentDirectionWest(rover));
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
