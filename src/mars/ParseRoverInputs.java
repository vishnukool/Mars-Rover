package mars;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ParseRoverInputs {

    ArrayList<Integer> roverStartCoordinatesX=new ArrayList<Integer>();
    ArrayList<Integer> roverStartCoordinatesY=new ArrayList<Integer>();
    ArrayList<Character> roverStartDirection=new ArrayList<Character>();
    ArrayList<String> command=new ArrayList<String>();
    int plateauLimitX;
    int plateauLimitY;

    public ArrayList<Integer> getRoverStartCoordinatesX() {
        return roverStartCoordinatesX;
    }

    public ArrayList<Integer> getRoverStartCoordinatesY() {
        return roverStartCoordinatesY;
    }

    public ArrayList<String> getCommand() {
        return command;
    }

    public int getPlateauLimitX() {
        return plateauLimitX;
    }

    public int getPlateauLimitY() {
        return plateauLimitY;
    }

    public ArrayList<Character> getRoverStartDirection() {
        return roverStartDirection;
    }

    public void parseRoverInputAndGetValues() {
        try{
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        String line = null;
        line=reader.readLine();

        String[] plateauLimits=line.split(" ");
        plateauLimitX=Integer.parseInt(plateauLimits[0]);
        plateauLimitY=Integer.parseInt(plateauLimits[1]);

        setInitialRoverStatesAndCommand(reader);
    }
    catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void setInitialRoverStatesAndCommand(BufferedReader reader) {
        try{
        String line;
         for(int i=0; (line=reader.readLine()) != null;i++) {
            String[] roverStartState=line.split(" ");
            roverStartCoordinatesX.add(Integer.parseInt(roverStartState[0]));
            roverStartCoordinatesY.add(Integer.parseInt(roverStartState[1]));
            roverStartDirection.add(roverStartState[2].charAt(0));

            line=reader.readLine();
            command.add(line);
        }
    }catch (IOException e) {
            e.printStackTrace();
        }

    }


}
