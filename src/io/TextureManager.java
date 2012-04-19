package io;

import java.io.IOException;

import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.TextureLoader;
import org.newdawn.slick.util.ResourceLoader;

public class TextureManager {
	public static Texture load(String location) {
		Texture tex = null;
		
		try {
			tex = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream(location));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return tex;
	}
}
