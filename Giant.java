/*Yauheniya Zapryvaryna
CS 210
Instructor: William Iverson
Bellevue College
December 6, 2013
Revisions made December 1-6 , 2013*/

/*Class Giant was written to define the behavior of a Giant Critter 
 * in a program that runs a simulation of a world with many animals
wandering around in it.
 */
import java.awt.*;
public class Giant extends Critter {
	private int giantMove=0;//move counter declaration and initialization
	private String lionAppearances[] = new String[] {"fee", "fie", "foe", "fum"}; // String[] to hold possible appearances of a Lion
    public Giant(){//Lion class constructor
    }
  //method getMove() to make sure Giants move in a certain way
    public Action getMove(CritterInfo info) {
    	giantMove++;
        if (info.getFront() == Neighbor.OTHER)
            return Action.INFECT;//enemy in front - infect
        else if (info.getFront() == Neighbor.EMPTY)
            return Action.HOP;//otherwise hop
        else
            return Action.RIGHT;//turn right in other cases
    }
    //method getColor() to set the Lion's color to gray
    public Color getColor() {
        return Color.GRAY;
    }
    //method toString() is to make sure Lion changes apperance every 6 moves
    public String toString() {
        if(giantMove==24){//we have 4 appearances and Lions changes it every 6 moves (6x4=24 - cycle)
    	    giantMove=0;//cycle is over, set moves to 0, so we can repeat it all over again
        }
        return lionAppearances[giantMove/6];//dividing 24 by 6 will return the correct index in the String array
    }
}