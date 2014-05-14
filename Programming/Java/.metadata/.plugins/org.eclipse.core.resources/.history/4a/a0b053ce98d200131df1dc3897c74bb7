package components;
/*
 * Grid class: contains methods for generating and smoothing the map
 */
import gui.Main;

import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Point;
import java.io.IOException;

import javax.swing.JPanel;

import components.tiles.*;
public class Grid extends JPanel
{
    private int width;
    private int height;
    private int ID;
    private int [][] gridNums;
    private Tile[][] grid;
    public Grid(int n, int w, int h) throws IOException
    {
    	super();
        height = h;
        width = w;
        gridNums = new int[width][height];
        grid = new Tile[width][height];
        ID = n;
    	this.setLayout(new GridLayout(width, height));
    }
    public Tile getTile(int x, int y)
    {
        return grid[x][y]; 
    }
    public final void create() throws IOException
    {
    	for(int i = 0; i < grid.length; i ++)
    	{
    		for(int j = 0; j < grid[0].length; j ++)
    		{
    			switch(gridNums[i][j])
    			{
    			case 1:
    			{
    				grid[i][j] = new Water(new Point(i,j), null, null, null);
    				break;
    			}
    			case 2:
    			{
    				grid[i][j] = new Desert(new Point(i,j), null, null, null);
    				break;
    			}
    			case 3:
    			{
    				grid[i][j] = new Plains(new Point(i,j), null, null, null);
    				break;
    			}
    			case 4:
    			{
    				grid[i][j] = new Tundra(new Point(i,j), null, null, null);
    				break;
    			}
    			case 5:
    			{
    				grid[i][j] = new Rock(new Point(i,j), null, null, null);
    				break;
    			}
    			}
                Main.progressBar.mapgen.progress += 1;
                Main.progressBar.mapgen.setprogress((int)((double)Main.progressBar.mapgen.progress / (double)Main.progressBar.mapgen.maxProgress * 100));
    		}
    	}
    }
    public final void generate() throws IOException
    {
        double[] probability = new double[6];
        for(int i = 2; i < probability.length; i++)
        {
            probability[i] = 1;
        }
        probability[1] = 2;
        probability[ID] = 2;
        double sum = 0;
        for(int i = 1; i < probability.length; i++)
        {
            sum += probability[i];
        }
        for(int i = 0; i < gridNums.length; i++)
        {
            for(int j = 0; j < gridNums[0].length; j++)
            {
                double random = (Math.random());
                double currentProb = 0;
                for(int p = 1; p < probability.length; p ++)
                {
                	if(random >= currentProb)
                	{
                		gridNums[i][j] = p;
                	}
                	currentProb += probability[p]/sum;
                }
            }
        }
    }
    //Getters and setters
    public int getWidth() 
    {
        return width;
    }
    public void setWidth(int width) 
    {
        this.width = width;
    }
    public int getHeight() 
    {
        return height;
    }
    public void setHeight(int height) 
    {
        this.height = height;
    }
    public Tile[][] getGrid() 
    {
        return grid;
    }
    public void setGrid(Tile[][] grid) 
    {
        this.grid = grid;
    }
    public void setTile(int x, int y, Tile n)
    {
        grid[x][y] = n;
    }
//    public void draw(Graphics screen)
//    {
//        for(int i = 0; i < grid.length; i ++)
//        {
//            for(int j = 0; j < grid[0].length; j++)
//            {
//                grid[i][j].draw(screen);
//            }
//        }
//    }
    public void smooth() throws IOException
    {
        for(int i = 0; i < gridNums.length; i++)
        {
            for(int j = 0; j < gridNums[0].length; j++)
            {
                float [] prob = new float[6];
                prob[gridNums[i][j]] += 0;
                prob[1] += 0;
                for(int k = Math.max(0, i - 1); k <= Math.min(gridNums.length - 1, i + 1); k++)
                {
                    for(int l = Math.max(0, j - 1); l <= Math.min(gridNums[0].length - 1, j + 1); l++)
                    {
                        prob[gridNums[k][l]] += 1;
                    }
                }
                float sum = 0;
                for(int a = 0; a < prob.length; a++)
                {
                    sum += prob[a];
                }
                double r = Math.random();
                for(int y = 1; y < prob.length; y++)
                {
                    float s = 0;
                    for(int z = 0; z < y; z++)
                    {
                        s += prob[z];
                    }
                    if(r > s/sum && r < (s + prob[y])/sum)
                    {
                    	switch(y)
                    	{
                    	case Tile.TILE_WATER: gridNums[i][j] = Tile.TILE_WATER; break;
                    	case Tile.TILE_DESERT: gridNums[i][j] = Tile.TILE_DESERT; break;
                    	case Tile.TILE_PLAINS: gridNums[i][j] = Tile.TILE_PLAINS; break;
                    	case Tile.TILE_TUNDRA: gridNums[i][j] = Tile.TILE_TUNDRA; break;
                    	case Tile.TILE_ROCK: gridNums[i][j] = Tile.TILE_ROCK; break;
                    	}
                    }
                }
            }
        }
    }
}
