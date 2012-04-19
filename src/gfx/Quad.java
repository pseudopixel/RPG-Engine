package gfx;

import util.Vector2d;

public class Quad {
	Vector2d vec;
	Sprite sprite;
	
	public Quad(Vector2d vec, Sprite sprite) {
		this.vec = vec;
		this.sprite = sprite;
	}
	
	public Vector2d getVec() {
		return vec;
	}
	
	public Sprite getSprite() {
		return sprite;
	}
}
