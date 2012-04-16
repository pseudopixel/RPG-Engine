package test;

import org.lwjgl.opengl.Display;

import gui.GameContainer;
import gui.Window;

public class Main {
	public static void main(String[] args) {
		Window window = new Window("Title Here", 1280, 720, 60, true);
		GameContainer gc = new GameContainer(window);
		
		while(!window.isCloseRequested()) {
			gc.update();
		}
	}
}
