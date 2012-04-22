package editor;

import gfx.GameContainer;
import gfx.Position;
import gfx.Quad;
import gfx.Render;
import gfx.Sprite;
import gfx.Window;
import io.TextureManager;

import java.awt.Font;

import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;
import org.newdawn.slick.TrueTypeFont;

import util.Vector2d;

@SuppressWarnings("deprecation")
public class Main {
	public static final double VERSION = 0.1;
	public static String str = "TEST STRING: ";
	public static Quad quad;
	public static State cur = State.TYPING;

	public static void main(String[] args) {
		Window window = new Window("Editor v"+ VERSION, 1280, 720, 60);
		GameContainer gc = new GameContainer(window);

		new Render(window);
		quad = new Quad(new Vector2d(100, 100), new Sprite(TextureManager.load("C:/Users/EXE/Desktop/testSprite.png")));
		Render.queue.add(quad);
		TrueTypeFont ttf = new TrueTypeFont(new Font("serif", 0, 20), false);

		while(!Display.isCloseRequested()) {
			GL11.glClear(GL11.GL_COLOR_BUFFER_BIT);
			InputManager.update(cur);
			if(cur == State.TYPING && (Mouse.isButtonDown(0) || Mouse.isButtonDown(1))) cur = State.EDITING_MAP;
			quad.getVec().set(Position.vector2dToPosition(new Vector2d(Mouse.getX(), (window.HEIGHT - Mouse.getY()))));
			Render.render();
			ttf.drawString(0, 0, str);
			gc.update();
		}
		
		gc.cleanup();
	}
}
