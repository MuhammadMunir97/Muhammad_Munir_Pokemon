package com.pokemon;

public interface attackPokemon {
	void attackingPokemon(Pokemon pokemon);
}

class simpleAttack implements attackPokemon{

	@Override
	public void attackingPokemon(Pokemon pokemon) {
		pokemon.setHealth(pokemon.getHealth()- 10);	
	}	
}