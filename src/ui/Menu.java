package ui;

import java.util.ArrayList;
import java.util.List;

import model.Entity;

import gfx.Quad;
import gfx.Render;
import gfx.Sprite;
import util.Vector2d;

public abstract class Menu extends Entity {
	private List<Button> buttons = new ArrayList<Button>();
	private List<Text> text = new ArrayList<Text>();
	private Quad sprite;
	private boolean active;
	
	public Menu(int id, Vector2d sPos, Sprite sprite, boolean addImmediately) {
		super(id);
		this.sprite = new Quad(sPos, sprite);
		
		if(addImmediately) addToRenderlist();
	}
	
	public boolean isActive() {
		return active;
	}
	
	public void addToRenderlist() {
		Render.quadQueue.add(sprite);
	}
	
	public void removeFromRenderlist() {
		Render.quadQueue.remove(sprite);
	}
	
	public void addButton(Button button) {
		buttons.add(button);
	}
	
	public void removeButton(Button button) {
		buttons.remove(button);
	}
	
	public void addText(Text text) {
		this.text.add(text);
	}
	
	public void removeText(Text text) {
		this.text.remove(text);
	}
}
