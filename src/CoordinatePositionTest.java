import junit.framework.TestCase;

/**
 * Created by IntelliJ IDEA.
 * User: vishnuk
 * Date: 7/10/11
 * Time: 1:56 PM
 * To change this template use File | Settings | File Templates.
 */
public class CoordinatePositionTest extends TestCase {
    public void testGetxOrdinate() throws Exception {
        CoordinatePosition coordinatePosition=new CoordinatePosition(2,4);
        assertEquals(2,coordinatePosition.getxOrdinate());

    }

    public void testSetxOrdinate() throws Exception {

        CoordinatePosition coordinatePosition=new CoordinatePosition(2,4);
               assertEquals(4,coordinatePosition.getyOrdinate());

    }

}
