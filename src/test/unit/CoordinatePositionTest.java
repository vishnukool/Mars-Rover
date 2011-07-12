package test.unit;

import junit.framework.TestCase;
import mars.CoordinatePosition;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CoordinatePositionTest extends TestCase {
    public void testGetXOrdinate() throws Exception {
        CoordinatePosition coordinatePosition = new CoordinatePosition(2, 4);
        assertThat(coordinatePosition.getXOrdinate(),is(2));

    }

    public void testGetYOrdinate() throws Exception {

        CoordinatePosition coordinatePosition = new CoordinatePosition(2, 4);
        assertThat(coordinatePosition.getYOrdinate(), is(4));

    }

    @Test
    public void testToString(){
        CoordinatePosition coordinatePosition=new CoordinatePosition(2,4);
        assertThat(coordinatePosition.toString(),is("2 4"));
    }

}
