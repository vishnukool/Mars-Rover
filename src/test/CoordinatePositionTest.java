package test;

import junit.framework.TestCase;
import mars.CoordinatePosition;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by IntelliJ IDEA.
 * User: vishnuk
 * Date: 7/10/11
 * Time: 1:56 PM
 * To change this template use File | Settings | File Templates.
 */
public class CoordinatePositionTest extends TestCase {
    public void testGetXOrdinate() throws Exception {
        CoordinatePosition coordinatePosition = new CoordinatePosition(2, 4);
        assertThat(coordinatePosition.getxOrdinate(),is(2));

    }

    public void testGetYOrdinate() throws Exception {

        CoordinatePosition coordinatePosition = new CoordinatePosition(2, 4);
        assertThat(coordinatePosition.getyOrdinate(), is(4));

    }


}
