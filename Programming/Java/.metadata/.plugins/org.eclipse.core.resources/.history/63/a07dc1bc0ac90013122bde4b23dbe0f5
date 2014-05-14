package gui;
/*
 * ClickBox class: class to check whether a mouse action is within a certain field
 */
import java.awt.Point;


public class ClickBox 
{

	private Point ulPosition;
	private int height;
	private int width;
	
	public ClickBox(Point pos, int w, int h)
	{
		ulPosition = pos;
		height = h;
		width = w;
	}
	
	public ClickBox(Point pos, double w, double h) 
	{
		ulPosition = pos;
		height = (int)h;
		width = (int)w;
	}

	public boolean includes(Point pos)
	{
		if (pos.getX() > ulPosition.getX() && pos.getY() > ulPosition.getY() && pos.getX() < (ulPosition.getX() + width) && pos.getY() < (ulPosition.getY() + height))
		{
			return true;
		}
		return false;
	}

	public Point getUlPosition() 
	{
		return ulPosition;
	}

	public void setUlPosition(Point ulPosition) 
	{
		this.ulPosition = ulPosition;
	}

	public int getHeight() 
	{
		return height;
	}

	public void setHeight(int height) 
	{
		this.height = height;
	}
	
	public void setHeight(double height) 
	{
		this.height = (int)height;
	}
	
	public int getWidth() 
	{
		return width;
	}

	public void setWidth(int width) 
	{
		this.width = width;
	}

	public void setWidth(double width) 
	{
		this.width = (int)width;
		
	}
}
