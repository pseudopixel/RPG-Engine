package gfx;

import java.util.ArrayList;

import org.lwjgl.opengl.GL11;


public class Render {
	Window window;
	
	public static ArrayList<Quad> queue = new ArrayList<Quad>();
	
	public Render(Window window) {
		this.window = window;
		
		GL11.glOrtho(0, window.WIDTH, window.HEIGHT, 0, -1, 1);
		GL11.glEnable(GL11.GL_TEXTURE_2D);
	}
	
	public static void render() {
		for(Quad q : queue) {
			q.getSprite().getTex().bind();
			
			GL11.glBegin(GL11.GL_QUADS);
				GL11.glTexCoord2f(0, 0);
				GL11.glVertex2d(q.getVec().getX(), q.getVec().getY());
				GL11.glTexCoord2f(1, 0);
				GL11.glVertex2d(q.getVec().getX() + q.getSprite().getTex().getTextureWidth(), q.getVec().getY());
				GL11.glTexCoord2f(1, 1);
				GL11.glVertex2d(q.getVec().getX() + q.getSprite().getTex().getTextureWidth(), q.getVec().getY() + q.getSprite().getTex().getTextureHeight());
				GL11.glTexCoord2f(0, 1);
				GL11.glVertex2d(q.getVec().getX(), q.getVec().getY() + q.getSprite().getTex().getTextureHeight());
			GL11.glEnd();
		}
	}
}
