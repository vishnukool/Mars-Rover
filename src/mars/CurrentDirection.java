package mars;

public abstract class CurrentDirection {

    MarsRover rover;
    char state;

    public boolean equals(CurrentDirection obj)
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
