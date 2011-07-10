package mars;
/**
 * Created by IntelliJ IDEA.
 * User: vishnuk
 * Date: 7/10/11
 * Time: 3:12 PM
 * To change this template use File | Settings | File Templates.
 */

public class CurrentDirectionWest extends CurrentDirection{

    public CurrentDirectionWest(MarsRover rover){
        this.rover=rover;
        state='W';
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
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
