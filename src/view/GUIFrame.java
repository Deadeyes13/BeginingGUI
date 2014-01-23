package view;

import javax.swing.JFrame;

import controller.GUIController;

/**
 * Framework For a GUI Frame class.
 * @author CJ Oman
 * @version 1.3
 * 10/22/13	
 * @param <GUIPanel>
 */

public class GUIFrame extends JFrame
{
	/**
	 * The controller object that will be shared across the application.
	 */
	private GUIController baseController;
	/**
	 * The main panel for the application.
	 */
	private GUIPanel basePanel;
	
	public GUIFrame(GUIController baseController)
	{
		this.baseController = baseController;
		basePanel = new GUIPanel(baseController);
	
		setupFrame();
	}
	/**
	 * helper method to setup the default size and panel for the frame.
	 */
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(400, 200);
		this.setVisible(true);
	}
}
