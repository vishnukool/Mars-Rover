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
    Position roverPosition;
    CurrentDirection roverDirection;

    public void SetDirectionTo(CurrentDirection newDirection)
       {
         roverDirection = newDirection;
       }
}
