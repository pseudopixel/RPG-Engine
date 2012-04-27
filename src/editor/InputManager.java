package editor;

import org.lwjgl.input.Keyboard;


public abstract class InputManager {
	public static Key[] keys = {
	new Key("a", Keyboard.KEY_A),
	new Key("b", Keyboard.KEY_B),
	new Key("c", Keyboard.KEY_C),
	new Key("d", Keyboard.KEY_D),
	new Key("e", Keyboard.KEY_E),
	new Key("f", Keyboard.KEY_F),
	new Key("g", Keyboard.KEY_G),
	new Key("h", Keyboard.KEY_H),
	new Key("i", Keyboard.KEY_I),
	new Key("j", Keyboard.KEY_J),
	new Key("k", Keyboard.KEY_K),
	new Key("l", Keyboard.KEY_L),
	new Key("m", Keyboard.KEY_M),
	new Key("n", Keyboard.KEY_N),
	new Key("o", Keyboard.KEY_O),
	new Key("p", Keyboard.KEY_P),
	new Key("q", Keyboard.KEY_Q),
	new Key("r", Keyboard.KEY_R),
	new Key("s", Keyboard.KEY_S),
	new Key("t", Keyboard.KEY_T),
	new Key("u", Keyboard.KEY_U),
	new Key("v", Keyboard.KEY_V),
	new Key("w", Keyboard.KEY_W),
	new Key("x", Keyboard.KEY_X),
	new Key("y", Keyboard.KEY_Y),
	new Key("z", Keyboard.KEY_Z),
	new Key("0", Keyboard.KEY_0),
	new Key("1", Keyboard.KEY_1),
	new Key("2", Keyboard.KEY_2),
	new Key("3", Keyboard.KEY_3),
	new Key("4", Keyboard.KEY_4),
	new Key("5", Keyboard.KEY_5),
	new Key("6", Keyboard.KEY_6),
	new Key("7", Keyboard.KEY_7),
	new Key("8", Keyboard.KEY_8),
	new Key("9", Keyboard.KEY_9),
	new Key(" ", Keyboard.KEY_SPACE),
	new Key(".", Keyboard.KEY_PERIOD),
	new Key(",", Keyboard.KEY_COMMA),
	new Key("'", Keyboard.KEY_APOSTROPHE)};
	
	public abstract void poll();
}
