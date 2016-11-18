package com.rikki.game;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class HeroSerialization {

	/**
	 * Serialize hero and save to binary file
	 * with the name "heroname.ser"
	 * Java object --> binary data
	 * @param hero
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public void save(Hero hero) throws FileNotFoundException, IOException{
		// ObjectOutputStream converts Object to bytes
		// FileOutputStream outputs the bytes to file
		ObjectOutputStream out = 
				new ObjectOutputStream(
						new FileOutputStream(
								new File(hero.getName() + ".ser")));
		out.writeObject(hero);
	}
	
	/**
	 * Deserialize hero and load into memory
	 * @param hero
	 * @return
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 * @throws ClassNotFoundException 
	 */
	public Hero load(String hero) throws FileNotFoundException, IOException, ClassNotFoundException{
		ObjectInputStream out = 
				new ObjectInputStream(
						new FileInputStream(
								new File(hero + ".ser")));
		//don't forget to cast 
		//because it was saved as an object so need to change it back when it comes back out of the file
		return (Hero) out.readObject();
	}
	
}
