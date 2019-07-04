package com.pokemon;

public class PokemonTest {
	public static void main(String[] args) {
		Pokedex capturedPokemons = new Pokedex();
		attackPokemon mainAttack = new simpleAttack();
		capturedPokemons.addPokemon("charizard", 1000, "flying");
		capturedPokemons.addPokemon("raquaza", 10000, "flying");
		capturedPokemons.addPokemon("turtoise", 1000, "ground");
		
		capturedPokemons.listPokemon();
		
		Pokemon pokemonNum1 = capturedPokemons.getPokemon(1);
		Pokemon pokemonNum2 = capturedPokemons.getPokemon(2);
		
		pokemonNum1.attackEnemy(pokemonNum2);
		System.out.println("name: " + pokemonNum2.getName() + ", health: " + pokemonNum2.getHealth()); 
		
		// after checking the error handling part
		pokemonNum1.setAttackType(mainAttack);
		
		pokemonNum1.attackEnemy(pokemonNum2);
		System.out.println("name: " + pokemonNum2.getName() + ", health: " + pokemonNum2.getHealth()); 
		
	}
}
