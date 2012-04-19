package gfx;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

public class Window {
	public final String TITLE;
	public final int WIDTH, HEIGHT;
	public final int FRAMERATE;
	
	public Window(String title, int width, int height, int framerate) {
		this.TITLE = title;
		this.WIDTH = width;
		this.HEIGHT = height;
		this.FRAMERATE = framerate;
		
		construct();
	}
	
	private void construct() {
		try {
			Display.setDisplayMode(new DisplayMode(WIDTH, HEIGHT));
			Display.setTitle(TITLE);
			Display.create();
		} catch (LWJGLException e) {
			e.printStackTrace();
		}
	}
}
