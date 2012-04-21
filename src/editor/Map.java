package editor;

import gfx.Position;

import java.util.ArrayList;

public class Map {
	public static ArrayList<Position> positions = new ArrayList<Position>();
	
	public static boolean check(Position pos) {
		for(Position p : positions) {
			if(pos.asVector().getX() == p.asVector().getX() && pos.asVector().getY() == p.asVector().getY()) return true;
			else return false;
		}
		
		return false;
	}
}
