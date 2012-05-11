package editor;

import org.lwjgl.input.Keyboard;


public class MenuInputManager extends InputManager {
	@Override
	public void poll() {
		while(Keyboard.next()) {
			for(Key key : Key.keys) {
				if(Character.toString(Keyboard.getEventCharacter()).equalsIgnoreCase(key.getKey())) key.setActivated(true);
				if(key.getActivated() && !key.getWritten()) {
					key.setWritten(true);
				}
			}
		}
		
		for(Key key : Key.keys) {
			if(key.getWritten() && !Keyboard.isKeyDown(key.getID())) key.setWritten(false);
		}
		
		Keyboard.poll();
	}
}
