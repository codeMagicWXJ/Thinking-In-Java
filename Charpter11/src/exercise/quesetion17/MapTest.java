package exercise.quesetion17;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import exercise.quesetion1.Gerbil;

public class MapTest {
	public static void main(String[] args) {
		Map<String,Gerbil> map = new HashMap<>();
		map.put("Spot", new Gerbil("Spot"));
		map.put("Fuzzy", new Gerbil("Fuzzy"));
		
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()){
			String name = it.next();
			System.out.println(name+":"+map.get(name));
		}
		
	}
}
