package outfitSelector;

import javax.swing.*;
/**
 * The 
 * @author JamesBurns
 *
 */
public class OutfitCloset extends JPanel {
	private JLabel closet; // To display 
	
	/**
	 * Constructor
	 */
	
	public OutfitCloset() {
		// Create label.
		closet = new JLabel("Outfit Selector");
		
		// Add the label to panel.
		add(closet);
	}

}
