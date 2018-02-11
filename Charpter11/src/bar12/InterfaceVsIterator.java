package bar12;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import domain.Pet;
import util.Pets;

public class InterfaceVsIterator {
	public static void display(Iterator<Pet> it){
		while(it.hasNext()){
			Pet p = it.next();
			System.out.print(p.id+":"+p+" ");
			
		}
		System.out.println();
	}
	
	
	public static void display(Collection<Pet> coll){
		for(Pet p : coll){
			System.out.print(p.id+":"+p+" ");
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		List<Pet> list = Pets.arrayList(8);
		Set<Pet> set = new HashSet<>(list);
		Map<String,Pet> map = new LinkedHashMap<>();
		String [] names = 
				"Ralph Eric Robin Lacey Britney Sam Spot Fluffy".split(" ");
		for(int i =0;i<names.length;i++)
			map.put(names[i], list.get(i));
		display(list);
		display(set);
		display(list.iterator());
		display(set.iterator());
		System.out.println(map);
		System.out.println(map.keySet());
		display(map.values());
		display(map.values().iterator());
	}
}
