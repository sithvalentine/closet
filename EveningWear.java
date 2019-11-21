package outfitSelector;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * This class shows a Evening wear list
 * with multiple interval selection mode
 */

public class EveningWear extends JFrame {
	
	private JPanel eveningWearPanel;			// Holds components
	private JPanel selectedEveningWearPanel;	// Holds components
	private JPanel buttonPanel;					// Holds button
	
	private JList eveningWearList;				// Holds items
	private JList selectedEveningWearList;		// Selected  items
	
	private JScrollPane scrollPane1;			// Scroll pane - first list
	private JScrollPane scrollPane2;			// scroll pane second list
	
	private JButton button;						// A button
	
	// This array holds the values that 
	// will be displayed in the eveningWearList list component.
	private String[] eveningWear = { "heels", "sandals", "gown", "earrings", 
			"midi", "dress", "jumpsuit" };
	
	/**
	 * Constructor
	 */
	
	public EveningWear() {
		
		// Set the title.
		setTitle("Evening Wear Selection");
		
		// Specify an action for close button.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Add a BorderLayout manager.
		setLayout(new BorderLayout());
		
		// Build the panels.
		buildEveningWearPanel();
		buildSelectedEveningWearPanel();
		buildButtonPanel();
		
		// Add panels to the content pane.
		add(eveningWearPanel, BorderLayout.NORTH);
		add(selectedEveningWearPanel, BorderLayout.CENTER);
		add(buttonPanel, BorderLayout.SOUTH);
		
		// Pack and display the window.
		pack();
		setVisible(true);
		
	}
	/**
	 * The buildEveningWearPanel method adds a list containing the 
	 * items in the list panel.
	 */
	
	private void buildEveningWearPanel() {
		
		// Create a panel to hold the list.
		eveningWearPanel = new JPanel();
		
		// Create list.
		eveningWearList = new JList(eveningWear);
		
        // Set the selection mode to multiple
        // interval selection.
		
		eveningWearList.setSelectionMode(
				ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		// Set the number of visible rows to 6.
		selectedEveningWearList.setVisibleRowCount(6);
		
		// Add the list to a scroll pane.
		scrollPane1 = new JScrollPane(eveningWearList);
		
		// Add the scroll pane to the panel.
		eveningWearPanel.add(scrollPane1);
	}
	
	/**
	 * The buildSelectedEveningWearPanel method adds a list
	 *  to a panel. This will hold the selected items.
	 */
	
	private void buildSelectedEveningWearPanel() {
		
		// Create a panel to hold the the list.
		selectedEveningWearPanel = new JPanel();
		
		// Create the list 
		selectedEveningWearList = new JList();
		
		// Set the number of visible rows to 6.
		selectedEveningWearList.setVisibleRowCount(6);
		
		// Add the list to scroll pane.
		scrollPane2 = 
				new JScrollPane(selectedEveningWearList);
		
		// Add the scroll pane to the panel.
		selectedEveningWearPanel.add(scrollPane2);
	}
	
	/**
	 * The buildButtonPanel method adds a button to a panel.
	 */
	
	private void buildButtonPanel() {
		
		// Create a panel to hold the list.
		buttonPanel = new JPanel();
		
		// Create the button.
		button = new JButton("Get Selections");
		
		// Add an action listener to the button.
		button.addActionListener(new ButtonListener());
		
		// Add the button to the panel.
		buttonPanel.add(button);
	}
	
	/**
	 * Private inner class that handles the event when 
	 * the user clicks the button.
	 */
	
	private class ButtonListener implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			
			// Get the selected values.
			Object[] selections = 
					selectedEveningWearList.getSelectedValues();
			
			// Store the selected items in selectedEveningWearList.
			selectedEveningWearList.setListData(selections);
		}
	}
}
