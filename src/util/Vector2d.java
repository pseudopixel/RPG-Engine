package util;

public class Vector2d {	private double x, y;
	
	public Vector2d(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public Vector2d get() {
		return this;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public void set(double x, double y) {
		this.x = x;
		this.y = y;
	}
}
