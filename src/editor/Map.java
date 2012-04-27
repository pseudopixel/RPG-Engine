package editor;

import gfx.Position;
import gfx.Quad;
import gfx.Render;
import gfx.Sprite;
import io.TextureManager;

import java.util.ArrayList;

public class Map {
	public static ArrayList<Position> positions = new ArrayList<Position>();
	
	public static void initialize() {
		for(Position p : positions) {
			Render.quadQueue.add(new Quad(p.asVector(), new Sprite(TextureManager.load("C:/Users/EXE/Desktop/testSprite.png"))));
		}
	}
	
	public static boolean check(Position pos) {
		for(Position p : positions) {
			if(pos.asVector().getX() == p.asVector().getX() && pos.asVector().getY() == p.asVector().getY()) return true;
			else return false;
		}
		
		return false;
	}
}
