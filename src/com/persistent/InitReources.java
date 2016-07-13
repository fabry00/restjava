package com.persistent;

import java.util.HashSet;
import java.util.Set;

import com.resources.Hero;

public class InitReources {
	
	public static Set<Hero> getInitialHeroes() {
		Set<Hero> m_heroes = new HashSet<Hero>();
		
		m_heroes.add(new Hero.Builder().withName("IronMan").withID(0).build());
		m_heroes.add(new Hero.Builder().withName("Hulk").withID(0).build());
		m_heroes.add(new Hero.Builder().withName("DareDavil").withID(0).build());
		
		return m_heroes;
	}

}
