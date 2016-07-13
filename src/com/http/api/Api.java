package com.http.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.persistent.IPersistentEngine;
import com.persistent.MemoryDB;
import com.resources.Hero;
import com.service.HeroService;


@Path("api/v1")
public class Api {

	private HeroService heroService =  new HeroService();
	private IPersistentEngine persistent = new MemoryDB();
	
	public Api() {
		this.heroService = new HeroService();
		this.heroService.setPersistent(this.persistent);
	}
	
	@GET
	@Path("/heroes")
	@Produces(MediaType.APPLICATION_JSON)
	public Hero[] heroes() {
		Hero[] heroes = this.heroService.getHeroes();
	    return heroes;
	}
		  
}
