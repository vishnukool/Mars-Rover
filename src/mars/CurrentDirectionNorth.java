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
        return 'a';
    }

    @Override
    public char turnRight() {
    return 'a';
    }

    @Override
    public void moveForward() {

    }
}
