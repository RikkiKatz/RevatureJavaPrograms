package com.rikki.game;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Data Access Object will perform CRUD (create, read, update, delete)
 * operations on hero data using text files.
 * 
 * @author Rikki
 *
 */
public class HeroDAO {
	
	/**
	 * Save hero into Comma-separated value file in the format:
	 * name,level,hitPoints,manaPoints,experiencePoints,class,weapon
	 */
	public void createHeroCSV(Hero hero) throws FileNotFoundException{
		PrintWriter writer = null;
		try{
			// appending data to heroes.txt
			File file = new File("heroes.txt");
			writer = new PrintWriter(new FileOutputStream(file, true));
		
			StringBuilder csv = new StringBuilder();
			csv.append(hero.getName()).append(",")
				.append(hero.getLevel()).append(",")
				.append(hero.getHitPoints()).append(",")
				.append(hero.getManaPoints()).append(",")
				.append(hero.getExperiencePoints()).append(",")
				.append(hero.getClazz()).append(",")
				.append(hero.getWeapon()).append(",")
				.append(hero).append("\n");
			writer.print(csv);
		}finally{
			writer.close();
		}
	}
	
	public List<Hero> readHeroes() throws FileNotFoundException{
		ArrayList<Hero> heroes = new ArrayList<>();
		Scanner scanner = null;
		try{
			scanner = new Scanner(new File("heroes.text"));
			scanner.useDelimiter(",");
			while(scanner.hasNextLine()){
				Hero hero = new Hero(scanner.next(), 
								scanner.nextInt(), 
								scanner.nextInt(), 
								scanner.nextInt(), 
								scanner.nextInt(),
								scanner.next(), 
								scanner.next());
							
			}//EOF
			return heroes;
		}finally{
			scanner.close();
		}
	}
	
}
