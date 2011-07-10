package mars;
import org.mockito.internal.stubbing.answers.ThrowsException;

import java.awt.*;

import static mars.Plateau.getMaximumXOrdinate;
import static mars.Plateau.getMaximumYOrdinate;

/**
 * Created by IntelliJ IDEA.
 * User: vishnuk
 * Date: 7/10/11
 * Time: 1:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class CoordinatePosition {
    int xOrdinate,yOrdinate;


    public CoordinatePosition(int xOrdinate, int yOrdinate){
        this.xOrdinate=xOrdinate;
        this.yOrdinate=yOrdinate;

    }

    public int getXOrdinate() {
        return xOrdinate;
    }

    public void setXOrdinate(int xOrdinate) {

            try {
                if(xOrdinate>getMaximumXOrdinate())
                throw new OutOfPlateauBoundsException();
            } catch (OutOfPlateauBoundsException e) {
                e.printStackTrace();
                System.out.println("Mars Rover out of bounds on Xordinate");
                return;
            }

        this.xOrdinate = xOrdinate;
    }

    public int getYOrdinate() {
        return yOrdinate;
    }

    public void setYOrdinate(int yOrdinate) {

                try {
                    if(yOrdinate>getMaximumYOrdinate())
                    throw new OutOfPlateauBoundsException();
                } catch (OutOfPlateauBoundsException e) {
                    System.out.println("Mars Rover out of bounds on Yordinate");
                    e.printStackTrace();
                    return;
                }
            
        this.yOrdinate = yOrdinate;
    }

    public CoordinatePosition getCoordinatePosition(){
        return this;
    }

    @Override
    public String toString(){
        return Integer.toString(xOrdinate) + " " + Integer.toString(yOrdinate);
    }

    public boolean equals(CoordinatePosition obj)
    {
        return (getXOrdinate()==obj.getXOrdinate())&&(getYOrdinate()==obj.getYOrdinate());
    }
}
