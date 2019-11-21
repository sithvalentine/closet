package outfitSelector;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ActiveWear extends JFrame {
	
	/**
	 * This class shows a List Component
	 *  with multiple interval selection
	 *  mode for Active Wear
	 */
		
		private JPanel activeWearPanel;				// Hold components
		private JPanel selectedActiveWearPanel;		// Hold Components
		private JPanel buttonPanel;					// Hold button
		
		private JList activeWearList;				// Hold items
		private JList selectedActiveWearList;		// Selected items
		
		private JScrollPane scrollPane1;			// Scroll pane 
		private JScrollPane scrollPane2;			// Scroll pane
		
		private JButton button;						// A button
		
		// This array holds the values that
		// are displayed in the activeWeatList list component.
		private String[] activeWear = { "yoga pants", "tanktop", "sports bra", 
				"baseball cap", "jogging pants", "shorts", "hiking shoes",
				"climbing shoes", "bikini", "tennis skirt" };
		
		public ActiveWear() {
			
			// Set the title.
			setTitle("Active Wear Items");
			
			// Specify an action for the close button.
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			// Add a BorderLayout manager.
			setLayout(new BorderLayout());
			
			//Build the panels.
			buildActiveWearPanel();
			buildSelectedActiveWearPanel();
			buildButtonPanel();
			
			// Add the panels to the content pane.
			add(activeWearPanel, BorderLayout.NORTH);
			add(selectedActiveWearPanel, BorderLayout.CENTER);
			add(buttonPanel, BorderLayout.SOUTH);
			
			// Pack and display window.
			pack();
			setVisible(true);
		}
		
		/**
		 * The buildActiveWearPanel method adds a list containing 
		 * the names of the items to a panel.
		 */
		private void buildActiveWearPanel() {
			// Create a panel to hold list.
			activeWearPanel = new JPanel();
			
			// Create list.
			activeWearList = new JList(activeWear);
			
			// Set the selection mode to multiple
			// interval selection.
			activeWearList.setSelectionMode(
					ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
			
			// Set the number of visible rows to 6.
			activeWearList.setVisibleRowCount(6);
			
			// Add the list to a scroll pane.
			scrollPane1 = new JScrollPane(activeWearList);
			
			// Add the scroll pane to the panel.
			activeWearPanel.add(scrollPane1);
		}
		private void buildSelectedActiveWearPanel() {
			
			// Create a panel to hold the list.
			selectedActiveWearPanel = new JPanel();
			
			// Create the list.
			selectedActiveWearList = new JList();
			
			// Set the number of the visible rows to 6.
			selectedActiveWearList.setVisibleRowCount(6);
			
			// Add the list to a scroll pane.
			scrollPane2 = 
					new JScrollPane(selectedActiveWearList);
			
			// Add the scroll pane to the panel.
			selectedActiveWearPanel.add(scrollPane2);
		}
		
		/**
		 * The buildButtonPanel method adds a 
		 * button to a panel.
		 */
		
		private void buildButtonPanel() {
			
			// Create a panel to hold the list.
			buttonPanel = new JPanel();
			
			// Create the button.
			button = new JButton("Make a Selection");
			
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
						activeWearList.getSelectedValues();
				
				// Store the selected items in selectedActiveWearList.
				selectedActiveWearList.setListData(selections);
			}
		}
		
		/**
		 * The main method creates an instance of the 
		 * ActiveWearList class which causes it
		 * to display its window
		 */
		
	}

