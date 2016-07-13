package com.response;

import com.resources.Hero;

public class ResponseHeroes {

	private Hero[] data;
	
	public ResponseHeroes(Hero[] data) {
		this.data = data;
	}
	
	public Hero[] getData() {
		return data;
	}
}
