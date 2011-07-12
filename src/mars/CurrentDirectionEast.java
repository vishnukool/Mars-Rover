package mars;

public class CurrentDirectionEast extends CurrentDirection{

    public CurrentDirectionEast(MarsRover rover){
        this.rover=rover;
        state='E';
    }

    MarsRover rover;
      @Override
    public char turnLeft() {
        rover.SetDirectionTo(new CurrentDirectionNorth(rover));
          return 'N';
    }

    @Override
    public char turnRight() {
      rover.SetDirectionTo(new CurrentDirectionSouth(rover));
      return 'S';
    }

    @Override
    public CoordinatePosition moveForward() {
        CoordinatePosition position = rover.getPosition();
        position.setXOrdinate(position.getXOrdinate() + 1);
        rover.setPosition(position);
        return position;
    }
}
