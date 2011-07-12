package mars;

public class CurrentMovingDirectionEast extends CurrentMovingDirection {

    public CurrentMovingDirectionEast(MarsRover rover){
        this.rover=rover;
        state='E';
    }

    MarsRover rover;
      @Override
    public char turnLeft() {
        rover.SetDirectionTo(new CurrentMovingDirectionNorth(rover));
          return 'N';
    }

    @Override
    public char turnRight() {
      rover.SetDirectionTo(new CurrentMovingDirectionSouth(rover));
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
