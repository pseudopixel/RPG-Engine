package gfx;

import java.util.ArrayList;

import org.lwjgl.opengl.GL11;

import ui.TextManager;



public class Render {
	Window window;
	
	// Render Managers
	public static TextManager testManager = new TextManager();
	
	public static ArrayList<Quad> quadQueue = new ArrayList<Quad>();
	
	public Render(Window window) {
		this.window = window;
		
		GL11.glOrtho(0, window.WIDTH, window.HEIGHT, 0, -1, 1);
		GL11.glEnable(GL11.GL_TEXTURE_2D);
		GL11.glEnable(GL11.GL_BLEND);
		GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
		GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MAG_FILTER, GL11.GL_NEAREST);
	}
	
	public static void render() {
		for(Quad q : quadQueue) {
			q.getSprite().getTex().bind();
	
			GL11.glBegin(GL11.GL_QUADS);
				GL11.glTexCoord2f(0, 0);
				GL11.glVertex2d(q.getVec().getX(), q.getVec().getY());
				GL11.glTexCoord2f(1, 0);
				GL11.glVertex2d(q.getVec().getX() + (q.getSprite().getTex().getTextureWidth() * 2), q.getVec().getY());
				GL11.glTexCoord2f(1, 1);
				GL11.glVertex2d(q.getVec().getX() + (q.getSprite().getTex().getTextureWidth() * 2), q.getVec().getY() + (q.getSprite().getTex().getTextureHeight() * 2));
				GL11.glTexCoord2f(0, 1);
				GL11.glVertex2d(q.getVec().getX(), q.getVec().getY() + (q.getSprite().getTex().getTextureHeight() * 2));
			GL11.glEnd();
		}
		
		testManager._iterate();
	}
}
