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

    public int getxOrdinate() {
        return xOrdinate;
    }

    public void setxOrdinate(int xOrdinate) {
        this.xOrdinate = xOrdinate;
    }

    public int getyOrdinate() {
        return yOrdinate;
    }

    public void setyOrdinate(int yOrdinate) {
        this.yOrdinate = yOrdinate;
    }

    public CoordinatePosition getCoordinatePosition(){
        return this;
    }
    public boolean equals(CoordinatePosition obj)
    {
        return (getxOrdinate()==obj.getxOrdinate())&&(getyOrdinate()==obj.getyOrdinate());
    }
}
