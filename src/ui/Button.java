package ui;

import gfx.Quad;
import gfx.Sprite;
import util.Vector2d;

public class Button {
	private Text text;
	private Vector2d location;
	private Quad sprite;
	
	public Button(Text text, Vector2d location, Sprite sprite) {
		this.text = text;
		this.location = location;
		this.sprite = new Quad(location, sprite);
	}
}
