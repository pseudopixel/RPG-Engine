package editor;

import gfx.GameContainer;
import gfx.Position;
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
	public static final double VERSION = 0.1;

	public static void main(String[] args) {
		Window window = new Window("Editor v"+ VERSION, 1280, 720, 60);
		GameContainer gc = new GameContainer(window);

		new Render(window);
		Quad quad = new Quad(new Vector2d(100, 100), new Sprite(TextureManager.load("C:/Users/EXE/Desktop/testSprite.png")));
		Render.queue.add(quad);

		while(!Display.isCloseRequested()) {
			GL11.glClear(GL11.GL_COLOR_BUFFER_BIT);
			InputManager.update();
			quad.getVec().set(Position.vector2dToPosition(new Vector2d(Mouse.getX(), (window.HEIGHT - Mouse.getY()))));
			if(Mouse.isButtonDown(0) || Mouse.isButtonDown(1)) {
				Quad q = new Quad(Position.vector2dToPosition(new Vector2d(Mouse.getX(), (window.HEIGHT - Mouse.getY()))), new Sprite(TextureManager.load("C:/Users/EXE/Desktop/testSprite.png")));
				if(!Map.check(new Position(q.getVec()).get())) {
					Render.queue.add(q);
					Map.positions.add(new Position(q.getVec()));
				}
			}
			if(Keyboard.isKeyDown(Keyboard.KEY_R)) {
				Render.queue.clear();
				Render.queue.add(quad);
			}
			if(InputManager.z && Render.queue.size() > 1) Render.queue.remove(Render.queue.size()-1);
			Render.render();
			gc.update();
		}
	}
}
