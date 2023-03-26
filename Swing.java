import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
*   Exam 1 CSIS-225 
*
*   @author Ira Goldstein (Solutions)
*	@version Spring 2023  
*/

public class Swing implements Runnable, ActionListener  {

	private JButton oneButton;
	private JButton fiveButton;
	private JButton tenButton;
	private JButton clearButton;
	private JLabel tallyLabel;
	private int tally=0;	// default value for the tally


	@Override
	public void run() {
		// create the frame
		JFrame frame = new JFrame("Add It!");
		frame.setPreferredSize(new Dimension(300, 200));

		// Make sure the pressing the "x" will termintate the program
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// create JPanel with border layout and add to frame
		JPanel panel = new JPanel(new BorderLayout());
		frame.add(panel);

        // create a sub panel with 2 rows 1 col grid layout at the 
        // center of the main panel and add to center of main panel
        JPanel tallyPanel = new JPanel(new FlowLayout());
		panel.add(tallyPanel, BorderLayout.CENTER);
		// initialize num votes
		tally = 0;
		tallyLabel = new JLabel("Tally: " + tally);
		tallyPanel.add(tallyLabel);

		// set the font
		Font currFont = tallyLabel.getFont();
		Font newFont = new Font(currFont.getFontName(), currFont.getStyle(), 24);
		tallyLabel.setFont(newFont);
		
		// add the buttons to the bottom
        JPanel buttonPanel = new JPanel(new FlowLayout());
		panel.add(buttonPanel, BorderLayout.SOUTH);
		
		//  add the buttons for 1, 5, 10 and clear
		oneButton = new JButton("One");
		buttonPanel.add(oneButton);
		fiveButton = new JButton("Five");
		buttonPanel.add(fiveButton);
		tenButton = new JButton("Ten");
		buttonPanel.add(tenButton);
		clearButton = new JButton("Clear");
		buttonPanel.add(clearButton);		

		// add action listeners to buttons
		oneButton.addActionListener(this);
		fiveButton.addActionListener(this);
		tenButton.addActionListener(this);
		clearButton.addActionListener(this);

		// display the window we've created
		frame.pack();
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent action) {
		// if the One button is pressed, add one to the tally
		if (action.getSource().equals(oneButton)) {
			tally++;
			tallyLabel.setText("Tally: " + tally);
		}
		// if the Five button is pressed, add 5 to the tally
		else if (action.getSource().equals(fiveButton)) {
			tally+=5;
			tallyLabel.setText("Tally: " + tally);
		}
		// if the Ten button is pressed, add 10 to the tally
		else if (action.getSource().equals(tenButton)) {
			tally+=10;
			tallyLabel.setText("Tally: " + tally);
		}
		// if the Clear button is pressed, reset the tally to zero
		else if (action.getSource().equals(clearButton)) {
			tally = 0;
			tallyLabel.setText("Tally: " + tally);
		}		
	}

	public static void main(String args[]) {

		// The main method is responsible for creating a thread
		// that will construct and show the graphical user interface.
		javax.swing.SwingUtilities.invokeLater(new Swing());

	}
}
