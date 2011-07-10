/**
 * Created by IntelliJ IDEA.
 * User: vishnuk
 * Date: 7/10/11
 * Time: 3:14 PM
 * To change this template use File | Settings | File Templates.
 */
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
