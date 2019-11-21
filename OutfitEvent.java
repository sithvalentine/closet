package outfitSelector;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * The OutfitEvent class allows the user to select 
 * what event they are wearing their outfit to
 * @author JamesBurns
 *
 */
public class OutfitEvent extends JFrame {
	
	private JPanel outfitPanel; 		// Holds components
	private JPanel selectedOutfitPanel; // Holds components
	private JComboBox  eventBox;  		// Holds events
	private JLabel label;				// Displays a message
	private JTextField selectedEvent;	// Selected event				
	
//	This array holds the values that will 
//	be displayed in the eventBox combo box.
	private String[] event = { "Active Wear", "Casual", "Evening Wear", "Sleepwear" };
	
	
	/**
	 * Constructor
	 */
	
	public OutfitEvent() {
		
		// Set title.
		setTitle("Outfit Event");
		
		// Specify an action for the close button
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Create a BorderLayout manager.
		setLayout(new BorderLayout());
		
		// Build panels.
		buildOutfitPanel();
		buildSelectedOutfitPanel();
		
		// Add the panels to the content pane.
		add(outfitPanel, BorderLayout.CENTER);
		add(selectedOutfitPanel, BorderLayout.SOUTH);
		
		// Pack and display the window
		pack();
		setVisible(true);
	}
	/**
	 * The buildOutfitPanel method adds a combo box 
	 * with the types of outfits to a panel.
	 */
	
	private void buildOutfitPanel() {
		// Create a panel to hold the combo box.
		outfitPanel = new JPanel();
		
		// Create combo box.
		eventBox = new JComboBox(event);
//		eventBox.setEditable(false);
		
		// Register and action listener.
		eventBox.addActionListener(new ComboBoxListener());
		
		// Add the combo box to the panel.
		outfitPanel.add(eventBox);
	}
	/**
	 * The buildSelectedOutfitPanel method adds a read-only text field to a panel.
	 */
	private void buildSelectedOutfitPanel() {
		
		// Create a panel to hold the components.
		selectedOutfitPanel = new JPanel();
		
		// Create the label.
		label = new JLabel("You selected: ");
		
		// Create the editable text field.
		selectedEvent = new JTextField(10);
		selectedEvent.setEditable(false);
		
		// Add the label and text field to panel.
		selectedOutfitPanel.add(label);
		selectedOutfitPanel.add(selectedEvent);
	}
	
	/**
	 * Private inner class that handles the event when 
	 * the user selects an item from the combo box.
	 */
	
	private class ComboBoxListener
						implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			// Get the selected outfit.
			String selection = 
					(String) eventBox.getSelectedItem();
			
			// Display the selected outfit in the text field.
			selectedEvent.setText(selection);
		}
	}
	
	/**
	 * The main
	 */
}


