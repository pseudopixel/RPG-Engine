package gfx;

import util.Vector2d;

public class Position {
	private static final int MULTIPLIER = 32;
	Vector2d vector;
	Vector2d position;
	
	public Position(Vector2d v2d) {
		this.vector = v2d;
		this.position = new Vector2d(Math.floor(v2d.getX() / MULTIPLIER), Math.floor(v2d.getY() / MULTIPLIER)); 
	}
	
	public Position(int x, int y) {
		this.vector = new Vector2d(x * MULTIPLIER, y * MULTIPLIER);
		this.position = new Vector2d(x, y);
	}
	
	public Vector2d asVector() {
		return new Vector2d(position.getX() * MULTIPLIER, position.getY() * MULTIPLIER);
	}
	
	public Position get() {
		return this;
	}
	
	public double getX() {
		return position.getX();
	}
	
	public double getY() {
		return position.getY();
	}

		
	public static Vector2d vector2dToPosition(Vector2d cur) {
		return new Vector2d(Math.floor(cur.getX() / MULTIPLIER) * MULTIPLIER, Math.floor(cur.getY() / MULTIPLIER) * MULTIPLIER);
	}
}
