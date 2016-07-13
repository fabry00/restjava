package com.persistent;

import java.util.Set;

import com.resources.Hero;

public interface IPersistentEngine {

	public Set<Hero> getHeroes();
}
