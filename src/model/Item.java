package model;

public class Item extends Entity {
	private final ItemDefinitions definitions;
	
	public Item(int id, ItemDefinitions definitions) {
		super(id);
		
		this.definitions = definitions;
	}
	
	public ItemDefinitions getDefinitions() {
		return definitions;
	}

	@Override
	public void update() {
		
	}
}
