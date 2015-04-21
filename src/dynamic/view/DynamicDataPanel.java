package dynamic.view;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.table.DefaultTableModel;

import dynamic.controller.DatabaseController;

/**
 * this is the panel class for the GUI that we can sea with our i's. (W0W m8,
 * d3d u jus1 do that?)
 * 
 * @author VGAR7399
 * @version 1.0
 */
public class DynamicDataPanel extends JPanel
{
	private DatabaseController mainController;
	private SpringLayout baseLayout;
	private JScrollPane displayPane;
	private JButton submitQueryButton;

	/**
	 * this is the constructor for the DatabasePanel class
	 * 
	 * @param mainController
	 *            this is how we refer the DatabaseController class for this
	 *            class
	 */
	public DynamicDataPanel(DatabaseController mainController, String table)
	{
		this.mainController = mainController;
		baseLayout = new SpringLayout();
		submitQueryButton = new JButton();

		setupPanel(table);
		setupLayout();
		setupListeners();
	}

	private void setupPanel(String table)
	{
		this.setLayout(baseLayout);
		this.add(submitQueryButton);
		int startOffset = 20;
		for (int count = 1; count < 7; count++)
		{
			JLabel dynamicLabel = new JLabel(mainController.getDatabase().getDatabaseColumnNames(table).length);
			JTextField textField = new JTextField(10);
			this.add(dynamicLabel);
			this.add(textField);
			baseLayout.putConstraint(SpringLayout.NORTH, test, startOffset, SpringLayout.NORTH, this);
			startOffset += 20;

			baseLayout.putConstraint(SpringLayout.NORTH, textField, startOffset, SpringLayout.NORTH, this);

			startOffset += 50;

		}
	}

	/**
	 * This is where all of the constraints for the elements in the panel
	 */
	private void setupLayout()
	{

	}

	/**
	 * This method is all of our listeners for all of the elements in the panel
	 */
	private void setupListeners()
	{
		JTextField[] myFields;
		ArrayList<JTextField> myTextFields = new ArrayList<JTextField>();
		int fieldCount = 0;
		for (Component current : this.getComponents())
		{
			if (current instanceof JTextField)
			{
				fieldCount++;
			}
		}
		myFields = new JTextField[fieldCount];
		for (Component current : this.getComponents())
		{
			if (current instanceof JTextField)
			{
				myFields[fieldCount - 1] = (JTextField) current;
				fieldCount--;
			}
		}

	}
}
