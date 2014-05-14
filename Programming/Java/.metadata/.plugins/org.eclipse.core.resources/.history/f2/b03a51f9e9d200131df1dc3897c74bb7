package components.tiles;

import java.awt.Graphics;
import java.awt.Point;
import java.io.IOException;

import components.tiles.resources.*;
import components.tiles.tileBuildings.*;
import components.tiles.features.*;

public class Tundra extends Tile
{

	public Tundra(Point position, Feature feature, TileBuilding building, Resource resource) throws IOException
	{
		super(position, feature, building, resource, getTileImage(Tile.TILE_TUNDRA));
		setTileImage(Tile.TILE_TUNDRA);
	}
	
	public int getID()
	{
		return Tile.TILE_TUNDRA;
	}

//	public void draw(Graphics screen)
//	{
//		screen.drawImage(getTileImage(), (int)(getPosition().getX()*(modWidth + 1)), (int)(getPosition().getY()*(modHeight + 1)), modWidth, modHeight, this);
//	}

	public String getTileName() {
		return "Tundra";
	}
}
