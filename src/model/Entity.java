package model;

import java.util.ArrayList;

public abstract class Entity {
	public static ArrayList<Entity> entities = new ArrayList<Entity>();
	
	private final int ID;
	
	public Entity(int id) {
		if(entities.get(id) != null) throw new RuntimeException("Duplicate Entity IDs! (" + id + ")");
		else {
			this.ID = id;
			entities.add(id, this);
		}
	}
	
	public int getID() {
		return ID;
	}
	
	public abstract void update();
}
