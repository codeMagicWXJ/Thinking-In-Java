package util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import domain.Cymric;
import domain.Manx;
import domain.Mutt;
import domain.Pet;
import domain.Pug;
import domain.Rat;

/*
 * 
 * 
 */
public class Pets {
	private static Random rand = new Random();
	
	public static void setRandom(int i){
		rand = new Random(i);
	}
	
	public static List<Pet> arrayList(int size){
		List<Pet> list = new ArrayList<>();
		for(int i =0 ;i < size; i++){
			list.add(randomPet());			
		}
		return list;
	}
	
	public  static Pet randomPet(){
		switch(rand.nextInt(5)){
			default:
			case 0:
				return new Cymric();
			case 1:
				return new Manx();
			case 2:
				return new Mutt();
			case 3:
				return new Rat();
			case 4:
				return new Pug();
		}
	}
		
	public static void main(String[] args) {
		setRandom(47);
		System.out.println(arrayList(7));
	}
	
}
