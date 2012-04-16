package gui;

import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;

public class GameContainer {
	Window window;
	
	public GameContainer(Window window) {
		this.window = window;
	}
	
	public void update() {
		GL11.glClear(GL11.GL_COLOR_BUFFER_BIT);
		GL11.glClearColor(0.0f, 0.5f, 0.5f, 1.0f);
		
		Display.update();
		Display.sync(window.getFramerate());
	}
}
