/*Yauheniya Zapryvaryna
CS 210
Instructor: William Iverson
Bellevue College
December 6, 2013
Revisions made December 1-6 , 2013*/

/*Class Bear was written to define the behavior of a Bear Critter 
 * in a program that runs a simulation of a world with many animals
wandering around in it.
 */
import java.awt.*;
public class Bear extends Critter {
	private int bearMove;//move counter declaration
	private boolean polar;
	public Bear (boolean polar) {//constructor that takes a boolean parameter, 
		this.polar = polar;      //specifying whether it is a black bear or a polar bear, 
		bearMove=0;                  //which will change how its color is displayed.
	}
	//method getMove() to make sure Bear moves in a simulator the certain way
	public Action getMove(CritterInfo info) {
	    bearMove++;//counting each move of a bear
	    if (info.getFront() == Neighbor.OTHER) {//always infect if an enemy is in front
	        return Action.INFECT;
	    }
	    else if (info.getFront()==Neighbor.EMPTY){//otherwise hop if possible
	        return Action.HOP;
	    }
	    else {
	        return Action.LEFT;//otherwise turn left.
	    }
    }
	//getColor() method to set the color to white or black, depending on simulator's 'boolean' polar value
	public Color getColor() {
		if(polar==true){
			return Color.WHITE;
		}
	    else 
		    return Color.BLACK;
	    }
	//method toString() to change the appearance of a Bear every move (using '%2==0) it takes (from '/' to '\')
	public String toString() {
	    if( bearMove % 2 == 0) {
	    	return "/";
	    } else {
	    	return "\\";
	    }
	} 
}
	

