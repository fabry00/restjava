package com.service;

import java.util.Set;

import com.persistent.IPersistentEngine;
import com.resources.Hero;

public class HeroService {
	private IPersistentEngine persistent;
	
	public HeroService(){
		
	}
	public void setPersistent(IPersistentEngine persistent){
		this.persistent = persistent;
	}

	public Hero[] getHeroes(){
		Set<Hero> heroes = this.persistent.getHeroes();
		return heroes.toArray(new Hero[heroes.size()]);
	}
}
