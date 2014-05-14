package components.tiles;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.io.IOException;

import components.tiles.resources.*;
import components.tiles.tileBuildings.*;
import components.tiles.features.*;

public class Water extends Tile
{

	public Water(Point position, Feature feature, TileBuilding building, Resource resource) throws IOException
	{
		super(position, feature, building, resource, getTileImage(Tile.TILE_WATER));
		setTileImage(Tile.TILE_WATER);
	}
	
	public int getID()
	{
		return Tile.TILE_WATER;
	}

	public void draw(Graphics screen)
	{
		screen.drawImage(getTileImage(), (int)(getPosition().getX()*(modWidth + 1)), (int)(getPosition().getY()*(modHeight + 1)), modWidth, modHeight, this);
	}

	public String getTileName()
	{
		return "Water";
	}

}
