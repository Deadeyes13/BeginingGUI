package view;

import javax.swing.JButton;

import javax.swing.JPanel;
import javax.swing.SpringLayout;

import controller.GUIController;
import java.awt.Color;

/**
 * 
 * @author CJ Oman
 * @version 1.2
 * 10/22/13
 */

public class GUIPanel extends JPanel
{

	private GUIController baseController;
	private SpringLayout baseLayout;
	private JButton firstButton;
	private JButton secondButton;
	
	
	public GUIPanel(GUIController baseController)
	{
		this.baseController = baseController;
		
		baseLayout = new SpringLayout();
		firstButton = new JButton("my first button!!");
		baseLayout.putConstraint(SpringLayout.NORTH, firstButton, 0, SpringLayout.NORTH, this);
		secondButton = new JButton("wow a second one :)");		
		baseLayout.putConstraint(SpringLayout.WEST, firstButton, 0, SpringLayout.WEST, secondButton);
		baseLayout.putConstraint(SpringLayout.NORTH, secondButton, 29, SpringLayout.NORTH, this);
		
		setupPanel();
		setupLayout();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(firstButton);
		this.add(secondButton);
		
	}
	
	private void setupLayout()
	{


		
	}
}
