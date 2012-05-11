package ui;

import gfx.Quad;
import gfx.Render;
import gfx.Sprite;

import java.util.ArrayList;
import java.util.List;

import org.lwjgl.opengl.GL11;

import model.Entity;
import util.Vector2d;

public class Menu extends Entity {
	private List<Button> buttons = new ArrayList<Button>();
	private List<Quad> sprites = new ArrayList<Quad>();
	private List<Text> text = new ArrayList<Text>();
	private Quad sprite;
	private boolean active;
	private Vector2d sPos;
	
	public Menu(int id, Vector2d sPos, Sprite sprite, boolean addImmediately) {
		super(id);
		this.sPos = sPos;
		this.sprite = new Quad(sPos, sprite);
		
		if(addImmediately) addToRenderlist();
	}
	
	public boolean isActive() {
		return active;
	}
	
	public void addToRenderlist() {
//		Render.gameQueue.add(sprite);
	}
	
	public void removeFromRenderlist() {
		Render.gameQueue.remove(sprite);
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
	
	public void addQuad(Quad q) {
		this.sprites.add(q);
	}
	
	public void removeQuad(Quad q) {
		this.sprites.remove(q);
	}

	public void update() {
		int x = 0;
		int y = 0;
		
		for(Quad q : sprites) {			
			q.getSprite().getTex().bind();
			
			GL11.glBegin(GL11.GL_QUADS);
			GL11.glTexCoord2f(0, 0);
			GL11.glVertex2d(x, y);
			GL11.glTexCoord2f(1, 0);
			GL11.glVertex2d(x + (q.getSprite().getTex().getTextureWidth() * 2), y);
			GL11.glTexCoord2f(1, 1);
			GL11.glVertex2d(x + (q.getSprite().getTex().getTextureWidth() * 2), y + (q.getSprite().getTex().getTextureHeight() * 2));
			GL11.glTexCoord2f(0, 1);
			GL11.glVertex2d(x, y + (q.getSprite().getTex().getTextureHeight() * 2));
			GL11.glEnd();
						
			x += q.getSprite().getTex().getTextureWidth() * 2;
			
			if(x > 1280) {
				x = 0;
				y += q.getSprite().getTex().getTextureHeight() * 2;
			}
		}
	}
}
