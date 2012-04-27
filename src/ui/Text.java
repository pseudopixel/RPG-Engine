package ui;

import gfx.Render;

import java.awt.Font;

import org.newdawn.slick.TrueTypeFont;

import util.Vector2d;

@SuppressWarnings("deprecation")
public class Text {
	private TrueTypeFont ttf;
	private Vector2d location;
	private String text;
	private int size;
	
	public Text(Vector2d location, String text, int size, boolean addImmediately) {
		this.location = location;
		this.text = text;
		this.size = size;
		
		ttf = new TrueTypeFont(new Font("serif", 0, size), true);
		if(addImmediately) addToDrawlist();
	}
	
	public void addToDrawlist() {
		Render.testManager.add(this);
	}
	
	public void removeFromDrawlist() {
		Render.testManager.remove(this);
	}
	
	public void draw() {
		ttf.drawString((float) location.getX(), (float) location.getY(), text);
	}
	
	public Vector2d getLocation() {
		return location;
	}
	
	public String getText() {
		return text;
	}
	
	public int getSize() {
		return size;
	}
	
	public void setLocation(Vector2d location) {
		this.location = location;
	}
	
	public void appendText(String text) {
		this.text += text;
	}
	
	public void setText(String text) {
		this.text = text;
	}
}
