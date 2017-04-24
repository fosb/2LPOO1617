package gui;

import logic.Edge;
import logic.Tile;
import logic.Water;

public class Map {
	
	private int width;
	private Tile[][] Map;
	
	public Map(int width){
		
		this.width = width;
		this.Map = new Tile[width][width];
		
		this.createMap();
	}
	
	public int getWidth(){
		
		return this.width;
	}
	public Tile[][] getMap(){
		
		return this.Map;
	}
	
	private void createMap(){
		
		for(int i = 0; i < width + 2; i++)
			for(int j = 0; j < width + 2; i++){
				if(j == 0 || j == width + 1)
					this.Map[i][j] = new Edge(i, j);
				else					
					this.Map[i][j] = new Water(i, j);
			}
	}
}
