package editor;

import java.util.ArrayList;

public class Key {
	public static ArrayList<Key> keys = new ArrayList<Key>();
	
	private String letter;
	private final int ID;
	private boolean activated = false;
	private boolean written = false;
	
	public Key(String letter, int id) {
		this.ID = id;
		this.letter = letter;
		keys.add(this);
	}
	
	public String getKey() {
		return letter;
	}
	
	public int getID() {
		return ID;
	}
	
	public boolean getActivated() {
		return activated;
	}
	
	public boolean getWritten() {
		return written;
	}
	
	public void setActivated(boolean activated) {
		this.activated = activated;
	}
	
	public void setWritten(boolean written) {
		this.written = written;
	}
}
