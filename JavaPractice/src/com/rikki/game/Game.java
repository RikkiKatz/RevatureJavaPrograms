package com.rikki.game;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class Game {

	public static void main(String[] args) throws Exception {
		deserialize();
		System.out.println("Done.");
	}

	/**
	 * Deserialize the object from the file
	 * @throws Exception
	 */
	public static void deserialize() throws Exception{
		Hero hero = new HeroSerialization().load("Pickles");
		System.out.println(hero);
		
	} 
	/**
	 * Serialize an object into the file
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static void serialize() throws FileNotFoundException, IOException {
		Hero hero1 = new Hero("Pickles", 20, 55, 70, 1000, "pickle-person", "battle axe");
		HeroSerialization serializer = new HeroSerialization();
		serializer.save(hero1);
		
		//Hero hero2 = new Hero("Jam", 200, 25, 700, 100, "PBJ sammich", "sword of destruction");
		//Hero hero3 = new Hero("Mr.", 20000, 25000, 700000, 100000, "alien", "sonic screwdriver");
	}
/**
	public static void read() throws FileNotFoundException {
		List<Hero> heroes = new HeroDAO().readHeroes();
		for(Hero h : heroes){
			System.out.println(h);
		}
	}
**/	
	/**
	 * CSV
	 * @throws FileNotFoundException
	 */
/**	public static void create() throws FileNotFoundException {
		Hero hero1 = new Hero("Pickles", 20, 55, 70, 1000, "pickle-person", "battle axe");
		Hero hero2 = new Hero("Jam", 200, 25, 700, 100, "PBJ sammich", "sword of destruction");
		Hero hero3 = new Hero("Mr.", 20000, 25000, 700000, 100000, "alien", "sonic screwdriver");
		
		HeroDAO dao = new HeroDAO();
		//save the state of my party of payers
		dao.createHeroCSV(hero1);
		dao.createHeroCSV(hero2);
		dao.createHeroCSV(hero3);
	}
**/
}
