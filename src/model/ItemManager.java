package model;

import java.util.ArrayList;

public class ItemManager {
	private ArrayList<Item> items = new ArrayList<Item>();
	
	public ItemManager() {
	}
	
	public ItemManager(ArrayList<Item> items) {
		this.items = items;
	}
	
	public void add(Item item) {
		this.items.add(item);
	}
	
	public void remove(Item item) {
		this.items.remove(item);
	}
	
	public void clear() {
		this.items.clear();
	}
	
	public void update() {
		
	}
}
