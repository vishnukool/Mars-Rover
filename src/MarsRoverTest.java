import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.assertTrue;


/**
* Created by IntelliJ IDEA.
* User: vishnuk
* Date: 7/10/11
* Time: 4:05 PM
* To change this template use File | Settings | File Templates.
*/
public class MarsRoverTest {

    @Test
    public void testGetPosition() throws Exception {

        CoordinatePosition coordinatePosition=new CoordinatePosition(2,4);

        MarsRover sampleMarsRover=new MarsRover(2,4,'N');
        assertTrue(sampleMarsRover.getPosition().equals(coordinatePosition));
    }
}
