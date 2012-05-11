package skill;

import java.util.ArrayList;

public class AbilitySet {
	private ArrayList<Ability> abilities = new ArrayList<Ability>();
	
	public void addAbility(Ability ability) {
		abilities.add(ability);
	}
	
	public ArrayList<Ability> getAbilitiesAvailableForLevel(int level) {
		ArrayList<Ability> temp = new ArrayList<Ability>();
		
		for(Ability a : abilities) if(a.getRequiredLevel() <= level) temp.add(a);
		
		return temp;
	}
}
