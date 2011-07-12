package mars;

public abstract class CurrentMovingDirection {

    MarsRover rover;
    char state;

    public boolean equals(CurrentMovingDirection obj)
    {
        return (state==obj.getState());
    }

    public String toString(){
        return Character.toString(state);
    }

    public char getState(){
        return state;
    }

    public abstract char turnLeft();

    public abstract char turnRight();

    public abstract CoordinatePosition moveForward();

}
