package editor;

import gfx.GameContainer;
import gfx.Position;
import gfx.Quad;
import gfx.Render;
import gfx.Sprite;
import gfx.Window;
import io.ItemLoader;
import io.TextureManager;

import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;

import ui.Text;
import util.Vector2d;

public class Main {
	public static final double VERSION = 0.1;
	public static Quad quad;
	public static int y = 0;
	// Test
	public static Text t;
	// /Test

	public static void main(String[] args) {
		Window window = new Window("Editor v"+ VERSION, 1280, 720, 60);
		GameContainer gc = new GameContainer(window);

		new Render(window);
		quad = new Quad(new Vector2d(100, 100), new Sprite(TextureManager.load("C:/Users/EXE/Desktop/testSprite.png")));
		Render.quadQueue.add(quad);
		
		ItemLoader.load("C:/Users/EXE/Desktop/items.dat");
		
		// Test
		MenuInputManager mi = new MenuInputManager();
		t = new Text(new Vector2d(0, 0), "", 20, true);
		// /Test
		
		while(!Display.isCloseRequested()) {
			GL11.glClear(GL11.GL_COLOR_BUFFER_BIT);
			GL11.glClearColor(0.0f, 0.5f, 0.5f, 1.0f);
			quad.getVec().set(Position.vector2dToPosition(new Vector2d(Mouse.getX(), (window.HEIGHT - Mouse.getY()))));
			
			// Test
			mi.poll();
			// /Test
			
			Render.render();
			gc.update();
		}
		
		gc.cleanup();
	}
}
