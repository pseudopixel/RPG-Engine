package gfx;

import org.newdawn.slick.opengl.Texture;

public class Sprite {
	Texture tex;
	
	int tWidth, tHeight;
	int iWidth, iHeight;
	int cWidth, cHeight;
	
	public Sprite(Texture tex) {
		this.tex = tex;
		
		this.tWidth = tex.getTextureWidth();
		this.tHeight = tex.getTextureHeight();
		this.iWidth = tex.getImageWidth();
		this.iHeight = tex.getImageHeight(); 
		this.cWidth = tex.getTextureWidth();
		this.cHeight = tex.getTextureHeight();
	}
	
	public Texture getTex() {
		return tex;
	}
}
