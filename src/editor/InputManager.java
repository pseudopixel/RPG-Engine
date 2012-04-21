package editor;

import gfx.Render;
import io.SaveMap;

import org.lwjgl.input.Keyboard;

public class InputManager {
	public static boolean z = false;
	
	public static void update() {
		if(Keyboard.isKeyDown(Keyboard.KEY_Z)) z = true;
		if(!Keyboard.isKeyDown(Keyboard.KEY_Z)) z = false;
		while(Keyboard.next()) if(Keyboard.isKeyDown(Keyboard.KEY_S)) SaveMap.save(Map.positions);
	}
}
