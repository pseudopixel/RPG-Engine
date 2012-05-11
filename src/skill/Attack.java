package skill;

import ui.Button;

public class Attack extends Skill {
	// Each skill has individually crafted Ablities to go along with it.
	public AbilitySet abilities = new AbilitySet();
	
	public Attack(int id, int level, Button icon) {
		super(id, level, icon);
		
		abilities.addAbility(new Ability(1) {
			@Override
			public void use() {
				
			}
		});
	}
}
