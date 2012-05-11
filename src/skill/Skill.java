package skill;

import model.Entity;
import ui.Button;


public abstract class Skill extends Entity {
	// Globals
	public static final int MAX_LEVEL = 100;
	public static final int MIN_LEVEL = 0;
	public static final int SHARED_PERCENTAGE = 100;
	
	// Per Skill attributes
	private Button icon;
	private int level;
	private int exp;
	private int nextLevelExp;
	
	public Skill(int id, int level, Button icon) {
		super(id);
		this.icon = icon;
		this.level = level;
		this.exp = findExpForLevel(level);
		this.exp = findExpForLevel(level+1);
	}
	
	public void addExp(int amount) {
		this.exp += amount;
	}
	
	public void setExp(int exp) {
		this.exp = exp;
	}
	
	public int getLevel() {
		return level;
	}
	
	public int getExp() {
		return exp;
	}
	
	public int getNextLevelExp() {
		return nextLevelExp;
	}
	
	public int getExpUntilNextLevel() {
		return nextLevelExp - exp;
	}
	
	private void checkLevelUp() {
		if(getExpUntilNextLevel() <= 0) level++;
	}
	
	private int findLevelForExp(int exp) {
		return 1;
	}
	
	private int findExpForLevel(int level) {
		return 1;
	}
	
	public void update() {
		checkLevelUp();
	}
}
