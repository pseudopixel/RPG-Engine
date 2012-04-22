package editor;

import gfx.Position;
import gfx.Quad;
import gfx.Render;
import gfx.Sprite;
import io.SaveMap;
import io.TextureManager;

import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

import util.Vector2d;

public class InputManager {
	private static Key[] keys = {
	new Key("a"),
	new Key("b"),
	new Key("c"),
	new Key("d"),
	new Key("e"),
	new Key("f"),
	new Key("g"),
	new Key("h"),
	new Key("i"),
	new Key("j"),
	new Key("k"),
	new Key("l"),
	new Key("m"),
	new Key("n"),
	new Key("o"),
	new Key("p"),
	new Key("q"),
	new Key("r"),
	new Key("s"),
	new Key("t"),
	new Key("u"),
	new Key("v"),
	new Key("w"),
	new Key("x"),
	new Key("y"),
	new Key("z"),
	new Key("0"),
	new Key("1"),
	new Key("2"),
	new Key("3"),
	new Key("4"),
	new Key("5"),
	new Key("6"),
	new Key("7"),
	new Key("8"),
	new Key("9"),
	new Key(" "),
	new Key(""),
	new Key("."),
	new Key(","),
	new Key("'")};
	
	public static void update(State state) {
		if(state == State.TYPING) {
			Keyboard.enableRepeatEvents(true);
			while(Keyboard.next()) {
				if(Keyboard.getEventKeyState()) {
					if(Keyboard.isKeyDown(Keyboard.KEY_A)) keys[0] .setActivated(true);
					if(Keyboard.isKeyDown(Keyboard.KEY_B)) keys[1] .setActivated(true);
					if(Keyboard.isKeyDown(Keyboard.KEY_C)) keys[2] .setActivated(true);
					if(Keyboard.isKeyDown(Keyboard.KEY_D)) keys[3] .setActivated(true);
					if(Keyboard.isKeyDown(Keyboard.KEY_E)) keys[4] .setActivated(true);
					if(Keyboard.isKeyDown(Keyboard.KEY_F)) keys[5] .setActivated(true);
					if(Keyboard.isKeyDown(Keyboard.KEY_G)) keys[6] .setActivated(true);
					if(Keyboard.isKeyDown(Keyboard.KEY_H)) keys[7] .setActivated(true);
					if(Keyboard.isKeyDown(Keyboard.KEY_I)) keys[8] .setActivated(true);
					if(Keyboard.isKeyDown(Keyboard.KEY_J)) keys[9] .setActivated(true);
					if(Keyboard.isKeyDown(Keyboard.KEY_K)) keys[10].setActivated(true);
					if(Keyboard.isKeyDown(Keyboard.KEY_L)) keys[11].setActivated(true);
					if(Keyboard.isKeyDown(Keyboard.KEY_M)) keys[12].setActivated(true);
					if(Keyboard.isKeyDown(Keyboard.KEY_N)) keys[13].setActivated(true);
					if(Keyboard.isKeyDown(Keyboard.KEY_O)) keys[14].setActivated(true);
					if(Keyboard.isKeyDown(Keyboard.KEY_P)) keys[15].setActivated(true);
					if(Keyboard.isKeyDown(Keyboard.KEY_Q)) keys[16].setActivated(true);
					if(Keyboard.isKeyDown(Keyboard.KEY_R)) keys[17].setActivated(true);
					if(Keyboard.isKeyDown(Keyboard.KEY_S)) keys[18].setActivated(true);
					if(Keyboard.isKeyDown(Keyboard.KEY_T)) keys[19].setActivated(true);
					if(Keyboard.isKeyDown(Keyboard.KEY_U)) keys[20].setActivated(true);
					if(Keyboard.isKeyDown(Keyboard.KEY_V)) keys[21].setActivated(true);
					if(Keyboard.isKeyDown(Keyboard.KEY_W)) keys[22].setActivated(true);
					if(Keyboard.isKeyDown(Keyboard.KEY_X)) keys[23].setActivated(true);
					if(Keyboard.isKeyDown(Keyboard.KEY_Y)) keys[24].setActivated(true);
					if(Keyboard.isKeyDown(Keyboard.KEY_Z)) keys[25].setActivated(true);
					if(Keyboard.isKeyDown(Keyboard.KEY_0)) keys[26].setActivated(true);
					if(Keyboard.isKeyDown(Keyboard.KEY_1)) keys[27].setActivated(true);
					if(Keyboard.isKeyDown(Keyboard.KEY_2)) keys[28].setActivated(true);
					if(Keyboard.isKeyDown(Keyboard.KEY_3)) keys[29].setActivated(true);
					if(Keyboard.isKeyDown(Keyboard.KEY_4)) keys[30].setActivated(true);
					if(Keyboard.isKeyDown(Keyboard.KEY_5)) keys[31].setActivated(true);
					if(Keyboard.isKeyDown(Keyboard.KEY_6)) keys[32].setActivated(true);
					if(Keyboard.isKeyDown(Keyboard.KEY_7)) keys[33].setActivated(true);
					if(Keyboard.isKeyDown(Keyboard.KEY_8)) keys[34].setActivated(true);
					if(Keyboard.isKeyDown(Keyboard.KEY_9)) keys[35].setActivated(true);
					if(Keyboard.isKeyDown(Keyboard.KEY_SPACE)) keys[36].setActivated(true);
					if(Keyboard.isKeyDown(Keyboard.KEY_BACK) && Main.str.length() > 0) keys[37].setActivated(true);
					if(Keyboard.isKeyDown(Keyboard.KEY_PERIOD)) keys[38].setActivated(true);
					if(Keyboard.isKeyDown(Keyboard.KEY_COMMA)) keys[39].setActivated(true);
					if(Keyboard.isKeyDown(Keyboard.KEY_APOSTROPHE)) keys[40].setActivated(true);
				}
			}
			
			if(!Keyboard.isKeyDown(Keyboard.KEY_A)) keys[0].setActivated(false);
			if(!Keyboard.isKeyDown(Keyboard.KEY_B)) keys[1].setActivated(false);
			if(!Keyboard.isKeyDown(Keyboard.KEY_C)) keys[2].setActivated(false);
			if(!Keyboard.isKeyDown(Keyboard.KEY_D)) keys[3].setActivated(false);
			if(!Keyboard.isKeyDown(Keyboard.KEY_E)) keys[4].setActivated(false);
			if(!Keyboard.isKeyDown(Keyboard.KEY_F)) keys[5].setActivated(false);
			if(!Keyboard.isKeyDown(Keyboard.KEY_G)) keys[6].setActivated(false);
			if(!Keyboard.isKeyDown(Keyboard.KEY_H)) keys[7].setActivated(false);
			if(!Keyboard.isKeyDown(Keyboard.KEY_I)) keys[8].setActivated(false);
			if(!Keyboard.isKeyDown(Keyboard.KEY_J)) keys[9].setActivated(false);
			if(!Keyboard.isKeyDown(Keyboard.KEY_K)) keys[10].setActivated(false);
			if(!Keyboard.isKeyDown(Keyboard.KEY_L)) keys[11].setActivated(false);
			if(!Keyboard.isKeyDown(Keyboard.KEY_M)) keys[12].setActivated(false);
			if(!Keyboard.isKeyDown(Keyboard.KEY_N)) keys[13].setActivated(false);
			if(!Keyboard.isKeyDown(Keyboard.KEY_O)) keys[14].setActivated(false);
			if(!Keyboard.isKeyDown(Keyboard.KEY_P)) keys[15].setActivated(false);
			if(!Keyboard.isKeyDown(Keyboard.KEY_Q)) keys[16].setActivated(false);
			if(!Keyboard.isKeyDown(Keyboard.KEY_R)) keys[17].setActivated(false);
			if(!Keyboard.isKeyDown(Keyboard.KEY_S)) keys[18].setActivated(false);
			if(!Keyboard.isKeyDown(Keyboard.KEY_T)) keys[19].setActivated(false);
			if(!Keyboard.isKeyDown(Keyboard.KEY_U)) keys[20].setActivated(false);
			if(!Keyboard.isKeyDown(Keyboard.KEY_V)) keys[21].setActivated(false);
			if(!Keyboard.isKeyDown(Keyboard.KEY_W)) keys[22].setActivated(false);
			if(!Keyboard.isKeyDown(Keyboard.KEY_X)) keys[23].setActivated(false);
			if(!Keyboard.isKeyDown(Keyboard.KEY_Y)) keys[24].setActivated(false);
			if(!Keyboard.isKeyDown(Keyboard.KEY_Z)) keys[25].setActivated(false);
			if(!Keyboard.isKeyDown(Keyboard.KEY_0)) keys[26].setActivated(false);
			if(!Keyboard.isKeyDown(Keyboard.KEY_1)) keys[27].setActivated(false);
			if(!Keyboard.isKeyDown(Keyboard.KEY_2)) keys[28].setActivated(false);
			if(!Keyboard.isKeyDown(Keyboard.KEY_3)) keys[29].setActivated(false);
			if(!Keyboard.isKeyDown(Keyboard.KEY_4)) keys[30].setActivated(false);
			if(!Keyboard.isKeyDown(Keyboard.KEY_5)) keys[31].setActivated(false);
			if(!Keyboard.isKeyDown(Keyboard.KEY_6)) keys[32].setActivated(false);
			if(!Keyboard.isKeyDown(Keyboard.KEY_7)) keys[33].setActivated(false);
			if(!Keyboard.isKeyDown(Keyboard.KEY_8)) keys[34].setActivated(false);
			if(!Keyboard.isKeyDown(Keyboard.KEY_9)) keys[35].setActivated(false);
			if(!Keyboard.isKeyDown(Keyboard.KEY_SPACE)) keys[36].setActivated(false);
			if(!Keyboard.isKeyDown(Keyboard.KEY_BACK) && Main.str.length() > 0) keys[37].setActivated(false);
			if(!Keyboard.isKeyDown(Keyboard.KEY_PERIOD)) keys[38].setActivated(false);
			if(!Keyboard.isKeyDown(Keyboard.KEY_COMMA)) keys[39].setActivated(false);
			if(!Keyboard.isKeyDown(Keyboard.KEY_APOSTROPHE)) keys[40].setActivated(false);
			
			for(int i = 0; i < keys.length; i++) {
				if(keys[i].getActivated() && !keys[i].getWritten()) {
					Main.str += keys[i].getKey();
					if(i == 37) Main.str = Main.str.substring(0, Main.str.length()-1);
					keys[i].setWritten(true);
				}
				
				if(!keys[i].getActivated()) keys[i].setWritten(false);
			}
		}
		
		if(state == State.EDITING_MAP) {
			while(Keyboard.next()) {
				if(Keyboard.isKeyDown(Keyboard.KEY_R)) {
					Render.queue.clear();
					Render.queue.add(Main.quad);
				}
				
				if(Keyboard.isKeyDown(Keyboard.KEY_L)) {
					Render.queue.clear();
					Map.positions.clear();
					Render.queue.add(Main.quad);
					LoadMap.load("map.xml");
					Map.initialize();
				}
				
				if(Keyboard.isKeyDown(Keyboard.KEY_S)) {
					SaveMap.save(Map.positions);
				}
				
				if(Keyboard.isKeyDown(Keyboard.KEY_T)) Main.cur = State.TYPING;
			}
			
			if(Mouse.isButtonDown(0) || Mouse.isButtonDown(1)) {
				Quad q = new Quad(Position.vector2dToPosition(new Vector2d(Mouse.getX(), (720 - Mouse.getY()))), new Sprite(TextureManager.load("C:/Users/EXE/Desktop/testSprite.png")));
				if(!Map.check(new Position(q.getVec()).get())) {
					Render.queue.add(q);
					Map.positions.add(new Position(q.getVec()));
				}
			}
		}
	}
}
