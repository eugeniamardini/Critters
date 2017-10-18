/*Yauheniya Zapryvaryna
CS 210
Instructor: William Iverson
Bellevue College
December 6, 2013
Revisions made December 1-6 , 2013*/

/*Class Lion was written to define the behavior of a Lion Critter 
 * in a program that runs a simulation of a world with many animals
wandering around in it.
 */
import java.awt.*;
import java.util.*;
public class Lion extends Critter {
    private int lionMove=0;//move counter declaration and initialization
    private Random rand= new Random();//constructing a Random oblect 
    private int clr;//int variable to hold a random number created by Random in getColor()
    private Color[] colors = {Color.RED, Color.GREEN, Color.BLUE};//array for possible colors of a Lion
    public Lion(){//empty Lion class constructor
	}
  //method getMove() to make sure Lions move in a simulator the certain way
    public Action getMove(CritterInfo info){
        lionMove++;//counting each Lion's moves
        if(info.getFront() == Neighbor.OTHER){
            return Action.INFECT;//infect enemy in front;
        } 
        else if (info.getFront() == Neighbor.WALL||info.getRight() == Neighbor.WALL){
            return Action.LEFT;//if a wall is in front or to the right, then turn left
        }
        else if (info.getFront()==Neighbor.SAME){
            return Action.RIGHT;//if a fellow Lion is in front, then turn right
        }
        else {
            return Action.HOP;//hop otherwise
        }
    }
    //getColor() method to set the color to one of three colors (red, blue or green) and 
    // to use that color for three moves
    public Color getColor() {
        if (lionMove%3==0){
		    clr = rand.nextInt(3);
	        return colors[clr];
	    }
        return colors[clr];
    }
    //method toString() to set Lion's appearance to letter 'L'
    public String toString() {
        return "L";
    }
}

