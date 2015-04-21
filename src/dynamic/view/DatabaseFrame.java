package dynamic.view;

import javax.swing.JFrame;

import dynamic.controller.DatabaseController;

/**
 * This is the frame that holds the JPanel in place
 * @author Vladster1256
 * @version 1.0
 */
public class DatabaseFrame extends JFrame
{
	private DynamicDataPanel mainPanel;
	
	/**
	 * Constructor for this class
	 * @param mainController is the parameter for the DatabaseController so that way the controller can communicate with this class
	 */
	public DatabaseFrame(DatabaseController mainController)
	{
		mainPanel = new DynamicDataPanel(mainController);
		setupFrame();
		
	}
	
	/**
	 * Setup our frame here
	 */
	private void setupFrame()
	{
		this.setContentPane(mainPanel);
		this.setSize(800,800);
		
		setVisible(true);
		
	}
}
