package test.unit;

import mars.Plateau;
import org.junit.Assert;
import org.junit.Test;

public class PlateauTest {

    @Test
    public void testGetMaximumXOrdinate() throws Exception {
        Plateau.setPlateau(2,3);
        Assert.assertTrue (Plateau.getMaximumXOrdinate()==2);
    }

    @Test
    public void testGetMaximumYOrdinate() throws Exception {
        Plateau.setPlateau(2,3);
        Assert.assertTrue (Plateau.getMaximumYOrdinate()==3);

    }
}
