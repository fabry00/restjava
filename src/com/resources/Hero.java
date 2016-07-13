package com.resources;

public class Hero {

	String name;
	int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getID() {
		return id;
	}

	public void setID(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Hero [name=" + name + ", id=" + id + "]";
	}
	
	public static class Builder {
		private Hero hero;
		private String name;
		private int id;
		
		public Builder withName(String name){
			this.name = name;
			return this;
		}
		
		public Builder withID(int id){
			this.id = id;
			return this;
		}
		
		public Hero build() {
			this.hero = new Hero();
			this.hero.setID(this.id);
			this.hero.setName(this.name);
			return this.hero;
		}
		
	}
}
