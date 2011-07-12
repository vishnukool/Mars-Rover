package mars;

public abstract class Plateau {
    static int maximumXOrdinate;
    static int maximumYOrdinate;

    public static void setPlateau(int xOrdinate, int yOrdinate) {
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
