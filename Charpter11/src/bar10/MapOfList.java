package bar10;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import domain.Cat;
import domain.Cymric;
import domain.Dog;
import domain.Mutt;
import domain.Person;
import domain.Pet;
import domain.Pug;
import domain.Rat;

public class MapOfList {
	public static Map<Person,List<? extends Pet>>
		petPeople = new HashMap<>();
	
	static{
		petPeople.put(new Person("Dawn"),
				Arrays.asList(new Cymric("Molly"),new Mutt("spot")));
		
		petPeople.put(new Person("Kate"),
				Arrays.asList(new Cat("Shackleton"),new Cat("Elsie May"),
						new Dog("Margrett")));
		
		petPeople.put(new Person("Marilyn"),
				Arrays.asList(
						new Pug("Louie aka Louis Snorkelstein Dupree"),
						new Cat("Stanford aka Stinky el Negro"),
						new Cat("Pinkola")));
		
		petPeople.put(new Person("Luke"),
				Arrays.asList(new Rat("Fuzzy"),new Rat("Fizzy")));
		
		petPeople.put(new Person("Isaac"),
				Arrays.asList(new Rat("Freckly")));
	}
	
	public static void main(String[] args) {
		System.out.println("People:"+petPeople.keySet());
		System.out.println("Pets:"+petPeople.values()+"  "+petPeople.values().getClass());
		
	}
}
