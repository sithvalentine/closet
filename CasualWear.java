package outfitSelector;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * This class shows a Casual Wear List Component
 * with multiple interval selection mode
 */

public class CasualWear extends JFrame {
	
		
		private JPanel casualWearPanel;			// Holds components
		private JPanel selectedCasualWearPanel;	// Holds components
		private JPanel buttonPanel;				// Holds button
		
		private JList casualWearList;			// Holds items
		private JList selectedCasualWearList;	// Selected items
		
		private JScrollPane scrollPane1;		// Scroll pane - first list
		private JScrollPane scrollPane2;		// Scroll pane - second list
		
		private JButton button;					// Button
		
		// The following array holds the values that 
		// will be displayed in the casualWearList list component.
		private String [] casualWear = { "short","pants", "blouse", "tank top", "sneakers", 
				"sandals", "sweater", "skirt", "jackets", "heels", "boots" };
		
		/**
		 * Constructor
		 */
		
		public CasualWear() {
			
			// Set the title.
			setTitle("Casual Wear Items");
			
			// Specify an action for the close button.
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			// Add a BorderLayout manager.
			setLayout(new BorderLayout());
			
			// Build panels.
			buildCasualWearPanel();
			buildSelectedCasualWearPanel();
			buildButtonPanel();
			
			// Add the panels to the content pane.
			add(casualWearPanel, BorderLayout.NORTH);
			add(selectedCasualWearPanel, BorderLayout.CENTER);
			add(buttonPanel, BorderLayout.SOUTH);
			
			// Pack and display window.
			pack();
			setVisible(true);
		}
		
		/**
		 * The buildCasualWearPanel method adds a list containing
		 * casual wear to a panel
		 */
		
		private void buildCasualWearPanel() {
			
			// Create a panel to hold list.
			casualWearPanel = new JPanel();
			
			// Create the list.
			casualWearList = new JList(casualWear);
			
			// Set the selection mode to multiple
			// interval selection.
			
			casualWearList.setSelectionMode(
					ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
			
			// Set the number of visible rows to 6.
			casualWearList.setVisibleRowCount(6);
			
			// Add the list to a scroll pane.
			scrollPane1 = new JScrollPane(casualWearList);
			
			// Add the scroll pane to the panel.
			casualWearPanel.add(scrollPane1);
		}
		
		/**
		 * The buildSelectedCasualPanel method adds a list 
		 * to a panel. This will hold the selected items.
		 */
		
		private void buildSelectedCasualWearPanel() {
			
			// Create a panel to hold list.
			selectedCasualWearPanel = new JPanel();
			
			// Set the number of visible rows to 6
			selectedCasualWearList.setVisibleRowCount(6);
//			
			// Add the list to a scroll
			selectedCasualWearPanel.add(scrollPane2);
		}
		
		/**
		 * The buildButtonPanel method adds a
		 *  button to a panel.
		 */
		
		private void buildButtonPanel() {
			
			// Create a panel to hold the list
			buttonPanel = new JPanel();
			
			// Create the button.
			button = new JButton("Make a selection");
			
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
						casualWearList.getSelectedValues();
				
				// Store the selected items in selectedCasualWearList.
				selectedCasualWearList.setListData(selections);
			}
			
		}
	}

