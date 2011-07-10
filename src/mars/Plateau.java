package mars;

/**
 * Created by IntelliJ IDEA.
 * User: vishnuk
 * Date: 7/11/11
 * Time: 3:29 AM
 * To change this template use File | Settings | File Templates.
 */
public class Plateau {
    static int maximumXOrdinate;
    static int maximumYOrdinate;

    public Plateau(int xOrdinate, int yOrdinate) {
        maximumXOrdinate=xOrdinate;
        maximumYOrdinate=yOrdinate;
    }

    public static int getMaximumXOrdinate(){
        return maximumXOrdinate;
    }

    public static int getMaximumYOrdinate(){
        return maximumYOrdinate
;    }
}
