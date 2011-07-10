/**
 * Created by IntelliJ IDEA.
 * User: vishnuk
 * Date: 7/10/11
 * Time: 2:43 PM
 * To change this template use File | Settings | File Templates.
 */
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
    public void moveForward() {
    }
}
