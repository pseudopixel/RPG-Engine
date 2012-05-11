package model;

import java.util.ArrayList;

import skill.SkillDefinitions;

public abstract class Mob extends Entity {
	// Globals
	public static ArrayList<Mob> mobs = new ArrayList<Mob>();
	
	// Per mob values
	public final int id;
	public boolean dead = false;
	public SkillDefinitions skillDefinitions = new SkillDefinitions();
	
	public Mob(int id, SkillDefinitions skillDefinitions) {
		super(id);
		this.id = id;
		this.skillDefinitions = skillDefinitions;
	}
	
	public SkillDefinitions getSkillDefinitions() {
		return skillDefinitions;
	}
		
	@Override
	public void update() {
		
	}
}
