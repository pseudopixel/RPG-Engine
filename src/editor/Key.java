package editor;

public class Key {
	private String letter;
	private boolean activated = false;
	private boolean written = false;
	
	public Key(String letter) {
		this.letter = letter;
	}
	
	public String getKey() {
		return letter;
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
