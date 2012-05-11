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

import skill.Ability;
import skill.Attack;
import util.CLogger;
import util.Vector2d;

public class Editor {
	public static final double VERSION = 0.1;
	public static Quad quad;
	public static int x = 0, y = 0;

	public static void main(String[] args) {
		Window window = new Window("SWAG v"+ VERSION, 1280, 720, 60);
		CLogger.log(window, "Creating Window...");
		GameContainer gc = new GameContainer(window);
		CLogger.log(gc, "Creating GameContainer...");
				
		Attack attack = new Attack(0, 100, null);
		if(attack.abilities.getAbilitiesAvailableForLevel(attack.getLevel()).size() > 0) attack.abilities.getAbilitiesAvailableForLevel(attack.getLevel()).get(0).use();
		Sprite qSprite = new Sprite(TextureManager.load("C:/Users/EXE/Desktop/DTOP/testSprite.png"));
		new Render(window);
		quad = new Quad(new Vector2d(100, 100), qSprite);
		Render.gameQueue.add(quad);
		
		CLogger.glog("Starting Main Loop...");
		
		while(!Display.isCloseRequested()) {
			GL11.glClear(GL11.GL_COLOR_BUFFER_BIT);
			GL11.glClearColor(0.0f, 0.5f, 0.5f, 1.0f);
			quad.getVec().set(Position.vector2dToPosition(new Vector2d(Mouse.getX(), (window.HEIGHT - Mouse.getY()))));
		
			if(Keyboard.isKeyDown(Keyboard.KEY_W)) {
				GL11.glTranslated(0, 1, 0);
				y++;
			}
			if(Keyboard.isKeyDown(Keyboard.KEY_S)) {
				GL11.glTranslated(0, -1, 0);
				y--;
			}
			if(Keyboard.isKeyDown(Keyboard.KEY_A)) {
				GL11.glTranslated(1, 0, 0);
				x++;
			}
			if(Keyboard.isKeyDown(Keyboard.KEY_D)) {
				GL11.glTranslated(-1, 0, 0);
				x--;
			}
			if(Keyboard.isKeyDown(Keyboard.KEY_ESCAPE)) {
				CLogger.glog("Shutting Down...");
				System.exit(0);
			}
			
			if(Mouse.isButtonDown(0) || Mouse.isButtonDown(1)) Render.gameQueue.add(new Quad(new Vector2d(quad.getVec().getX(), quad.getVec().getY()), qSprite));
			
			Render.render();
			gc.update();
			
		}
		
		gc.cleanup();
	}
}
