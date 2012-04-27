package ui;

import java.util.ArrayList;

public class TextManager {
	private ArrayList<Text> texts = new ArrayList<Text>();
	
	public TextManager() {
	}
	
	public TextManager(ArrayList<Text> texts) {
		this.texts = texts;
	}
	
	public void clear() {
		this.texts.clear();
	}
	
	public ArrayList<Text> get() {
		return texts;
	}
	
	public void set(ArrayList<Text> texts) {
		this.texts = texts;
	}
	
	public void add(Text text) {
		this.texts.add(text);
	}
	
	public void remove(Text text) {
		this.texts.remove(text);
	}
	
	public void _iterate() {
		for(Text t : texts) {
			t.draw();
		}
	}
}
