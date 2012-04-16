package gui;

import java.util.logging.Logger;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

public class Window {
	private static String TITLE;
	private static int WIDTH, HEIGHT;
	private static int FRAMERATE;
	private static boolean V_SYNC_ENABLED;
	
	@SuppressWarnings("static-access")
	public Window(String title, int width, int height, int framerate, boolean vSyncEnabled) {
		this.TITLE = title;
		this.WIDTH = width;
		this.HEIGHT = height;
		this.FRAMERATE = framerate;
		this.V_SYNC_ENABLED = vSyncEnabled;
		
		construct();
	}
	
	private void construct() {
		try {
			Display.setDisplayMode(new DisplayMode(WIDTH, HEIGHT));
			Display.setTitle(TITLE);
			Display.setVSyncEnabled(V_SYNC_ENABLED);
			Display.create();
		} catch (LWJGLException e) {
			e.printStackTrace();
		}
	}
	
	public String getTitle() {
		return TITLE;
	}
	
	public int getWidth() {
		return WIDTH;
	}
	
	public int getHeight() {
		return HEIGHT;
	}
	
	public int getFramerate() {
		return FRAMERATE;
	}

	public boolean isCloseRequested() {
		return Display.isCloseRequested();
	}
}
