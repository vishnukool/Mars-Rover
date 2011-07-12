package mars;

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
