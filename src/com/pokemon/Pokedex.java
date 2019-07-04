package com.pokemon;

import java.util.ArrayList;

public class Pokedex extends AbstractPokemon {

	private ArrayList<Pokemon> myPokemons = new ArrayList<Pokemon>();
	
	public void addPokemon(String name, int health, String type) {	
		myPokemons.add(createPokemon(name, health, type));
	}
	@Override
	public void listPokemon() {
		for (int i = 0; i < myPokemons.size(); i++) {
			System.out.println(pokemonInfo(myPokemons.get(i)));
		}	
	}
	public Pokemon getPokemon(int index) {
		try {
		return myPokemons.get(index - 1);
		}catch (Exception e) {
			System.out.println("soryy pokemon does not exist");
			return null;
		}
	}
	
}
