package fcu.iecs.oop.pokemon;

public class Charmander extends Pokemon {

	public Charmander(String a, PokemonType b, int c) {
		super(a, b, c);
	}

	public void attack() {
		System.out.println("Ember...");
	}
}
