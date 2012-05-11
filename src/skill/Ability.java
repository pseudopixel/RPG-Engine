package skill;

public abstract class Ability {
	private int requiredLevel;
	
	public Ability(int requiredLevel) {
		this.requiredLevel = requiredLevel;
	}
	
	public int getRequiredLevel() {
		return requiredLevel;
	}
	
	public abstract void use();
}
