package com.pokemon;


public class Pokemon {
	private String name;
	private int health;
	private String type;
	private static int numberOfPokemon = 0;
	private attackPokemon attack;
	public Pokemon(String nameParameter, int healthParameter, String typeParameter) {
		name = nameParameter;
		health = healthParameter;
		type = typeParameter;
		numberOfPokemon++;	
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public static int getNumberOfPokemon() {
		return numberOfPokemon;
	}
	public void setAttackType(attackPokemon attackType) {
		attack = attackType;
	}
	public void attackEnemy(Pokemon pokemon) {
		try {
			attack.attackingPokemon(pokemon);
		}catch (Exception e) {
			System.out.println("this object does not have an attack type, please set the attack type");
		}
		
		
	}
	
}

