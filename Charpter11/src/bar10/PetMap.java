package bar10;

import java.util.HashMap;
import java.util.Map;

import domain.Cat;
import domain.Dog;
import domain.Hamster;
import domain.Pet;

public class PetMap {
	public static void main(String[] args) {
		Map<String,Pet> map = new HashMap<>();
		
		map.put("My Cat", new Cat());
		map.put("My Dog", new Dog());
		map.put("My Hamster", new Hamster());
		
		System.out.println(map);
		
		Pet dog = map.get("My Dog");
		System.out.println(dog);
		
		System.out.println(map.containsKey("My Dog"));
		System.out.println(map.containsValue(dog));
	}
}
