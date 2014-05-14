package gui;

import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.JToolTip;
import javax.swing.JWindow;
import javax.swing.Popup;
import javax.swing.PopupFactory;

import components.tiles.TileToolTip;

public class TranslucentPopup extends Popup
{
	private JWindow popupWindow;

	TranslucentPopup(Component owner, Component contents, int ownerX, int ownerY)
	{
		// create a new heavyweight window
		this.popupWindow = new JWindow();
		// mark the popup with partial opacity
		com.sun.awt.AWTUtilities.setWindowOpacity(popupWindow, (contents instanceof TileToolTip) ? 0.5f : 0.95f);
	    popupWindow.setLocation(ownerX, ownerY);
		// determine the popup location
		// add the contents to the popup
		popupWindow.getContentPane().add(contents, BorderLayout.CENTER);
		contents.invalidate();
	}
	
	public void show()
	{
		com.sun.awt.AWTUtilities.setWindowOpaque(this.popupWindow, false);
		this.popupWindow.setVisible(true);
		this.popupWindow.pack();
		// mark the window as non-opaque, so that the
		// shadow border pixels take on the per-pixel
		// translucency
	}
	
	public void hide()
	{
		this.popupWindow.setVisible(false);
		this.popupWindow.removeAll();
		this.popupWindow.dispose();
	}
}
