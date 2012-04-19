package test;

import gfx.GameContainer;
import gfx.Quad;
import gfx.Render;
import gfx.Sprite;
import gfx.Window;
import io.TextureManager;

import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;

import util.Vector2d;

public class Main {
	public static void main(String[] args) {
		Window window = new Window("", 800, 600, 60);
		GameContainer gc = new GameContainer(window);
		new Render(window);
		Quad quad = new Quad(new Vector2d(100, 100), new Sprite(TextureManager.load("C:/Users/EXE/Desktop/testSprite.png")));
		Render.queue.add(quad);
			
		while(!Display.isCloseRequested()) {
			GL11.glClear(GL11.GL_COLOR_BUFFER_BIT);
			quad.getVec().set(Mouse.getX(), (window.HEIGHT - Mouse.getY()));
			if(Mouse.isButtonDown(0) || Mouse.isButtonDown(1)) Render.queue.add(new Quad(new Vector2d(Mouse.getX(), (window.HEIGHT - Mouse.getY())), new Sprite(TextureManager.load("C:/Users/EXE/Desktop/testSprite.png"))));
			if(Keyboard.isKeyDown(Keyboard.KEY_R)) {
				Render.queue.clear();
				Render.queue.add(quad);
			}
			Render.render();
			gc.update();
		}
	}
}
