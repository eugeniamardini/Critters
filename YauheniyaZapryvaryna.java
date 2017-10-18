/*Yauheniya Zapryvaryna
CS 210
Instructor: William Iverson
Bellevue College
December 6, 2013
Revisions made December 1-6 , 2013*/

/*Class YauheniyaZapryvaryna was written to define the behavior of my own Critter 
 * in a program that runs a simulation of a world with many animals
wandering around in it. Critter YZ was created to test its survival skills.
 */
import java.awt.*;
public class YauheniyaZapryvaryna extends Critter {
	private int moveOfYZ=0;//move counter declaration and initialization
    public YauheniyaZapryvaryna(){//Lion class constructor
    }
    //method getMove() to make my critter move a certain way 
    public Action getMove(CritterInfo info){
        moveOfYZ++;//counting my moves
        if (info.getFront() == Neighbor.OTHER){
            return Action.INFECT;
        }//infect enemy, if it is in front
        else if (info.getRight()==Neighbor.OTHER){
	        return Action.RIGHT;//if enemy is on the right, turn right and infect
        }
        else if (info.getLeft()==Neighbor.OTHER) {
	        return Action.LEFT;//if enemy on the left, turn left and infect
        } 
        else if (info.getFront()==Neighbor.EMPTY){
        	return Action.HOP;
        }
        else if (moveOfYZ>500&&info.getFront()==Neighbor.EMPTY&&info.getDirection()==Direction.NORTH){
    	    return Action.HOP;//after 500 moves and if direction is north - hop
        }
        else if (info.getInfectCount()>9)
	        return Action.RIGHT;//if number of infection is bigger than 9, turn right
        else {
            return Action.LEFT;//otherwise hop
        }
    }
    //using getColor() to set my color
    public Color getColor() {
        return Color.PINK;
    }
    //toString() method to set the way my critter appears in the arena
    public String toString() {
        return "YZ";
	}
}


