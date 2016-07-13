package com.persistent;

import java.util.HashSet;
import java.util.Set;

import com.resources.Hero;

public class InitReources {
	
	public static Set<Hero> getInitialHeroes() {
		Set<Hero> m_heroes = new HashSet<Hero>();
		int i = 1;
		m_heroes.add(new Hero.Builder().withName("IronMan").withID(i++).build());
		m_heroes.add(new Hero.Builder().withName("Hulk").withID(i++).build());
		m_heroes.add(new Hero.Builder().withName("DareDavil").withID(i++).build());
		m_heroes.add(new Hero.Builder().withName("Thor").withID(i++).build());
		m_heroes.add(new Hero.Builder().withName("CaptanAmerica").withID(i++).build());
		m_heroes.add(new Hero.Builder().withName("AntMan").withID(i++).build());
		
		return m_heroes;
	}

}
