import org.omg.PortableServer.Current;

import javax.swing.text.Position;

/**
 * Created by IntelliJ IDEA.
 * User: vishnuk
 * Date: 7/10/11
 * Time: 2:22 PM
 * To change this template use File | Settings | File Templates.
 */
public class MarsRover {
    CoordinatePosition roverPosition;
    CurrentDirection roverDirection;

//    public void SetDirectionTo(CurrentDirection newDirection) {
//         roverDirection = newDirection;
//       }

    public MarsRover(int x, int y, char direction){
        initStates(direction);
        roverPosition = new CoordinatePosition(x,y);
}

    private void initStates(char direction) {

               switch (direction){
        case 'N':
            roverDirection=new CurrentDirectionNorth();
            break;
        case 'S':
            roverDirection=new CurrentDirectionSouth();
            break;

        case 'E':roverDirection=new CurrentDirectionEast();
            break;

        case 'W':roverDirection=new CurrentDirectionWest();
            break;
       }

    }

//    public void setPosition(Position position) {
//        this.roverPosition = position;
//}
    public CoordinatePosition getPosition() {
       return roverPosition;
}

}
