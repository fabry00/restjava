package com.persistent;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import com.resources.Hero;

public class MemoryDB implements IPersistentEngine{

	private Set<Hero> m_heroes = new HashSet<Hero>();
	
	public MemoryDB() {
		m_heroes.addAll(InitReources.getInitialHeroes());
	}
	
	public Set<Hero> getHeroes(){
		return Collections.unmodifiableSet(m_heroes);
	}
}
