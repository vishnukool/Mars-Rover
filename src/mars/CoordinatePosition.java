package mars;
import java.awt.*;

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
        Point thePoint =new Point(2,3);

    }

    public int getXOrdinate() {
        return xOrdinate;
    }

    public void setXOrdinate(int xOrdinate) {
        this.xOrdinate = xOrdinate;
    }

    public int getYOrdinate() {
        return yOrdinate;
    }

    public void setYOrdinate(int yOrdinate) {
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
