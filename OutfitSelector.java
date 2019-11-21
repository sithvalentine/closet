/*Program: Outfit Selection
  Author: James Burns
  Start Date: 22 Aug 2019
  Description: Program asks user for an event such as (work out, casual, night out, tea time) 
  The program then selects the outfit for the event.
  The program itemizes each part of the outfit. 
  The program tells the price of each item. The program asks if the outfit is acceptable. 
  If no, then it asks the user if you would like to change the outfit.
  If user wants a change, select YES to change.*/


package outfitSelector;

import java.awt.*; 		 // Color class import
import javax.swing.*; 	 // Swing class import
import java.awt.event.*; // Event listener interface

/**
 * The OutfitSelector class creates the 
 * @author JamesBurns
 *
 */
public class OutfitSelector extends JFrame {
	 /**
	  * OutfitType enumerated data type
	  */
	                          

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		new OutfitEvent();
		new ActiveWear();
		new CasualWear();
		new EveningWear();
	}
}
