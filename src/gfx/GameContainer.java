package gfx;

import org.lwjgl.opengl.Display;


public class GameContainer {
	Window window;
	
	public GameContainer(Window window) {
		this.window = window;
	}
	
	public void update() {
		Display.update();
		Display.sync(window.FRAMERATE);
	}
}
