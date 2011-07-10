/**
 * Created by IntelliJ IDEA.
 * User: vishnuk
 * Date: 7/10/11
 * Time: 2:26 PM
 * To change this template use File | Settings | File Templates.
 */
package mars;
public abstract class CurrentDirection {

    MarsRover rover;
    char state;

    public boolean equals(CurrentDirection obj)
    {
        return (state==obj.getState());
    }

    public char getState(){
        return state;
    }

    public abstract char turnLeft();

    public abstract char turnRight();

    public abstract void moveForward();

}
