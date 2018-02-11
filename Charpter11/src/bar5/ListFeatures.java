package bar5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import domain.Cymric;
import domain.Hamster;
import domain.Mouse;
import domain.Pet;
import util.Pets;

public class ListFeatures {
	public static void main(String[] args) {
		Random rand = new Random(47);
		Pets.setRandom(7);
		List<Pet> list = Pets.arrayList(7);
		System.out.println("1: "+list);
		
		Hamster h = new Hamster();
		list.add(h);
		System.out.println("2: "+list);
		System.out.println("3: "+list.contains(h));
		list.remove(h);
		
		Pet p = list.get(2);
		System.out.println("4: "+p+" "+list.contains(p));
		
		Pet cymric = new Cymric();
		System.out.println("5: "+list.indexOf(cymric));
		System.out.println("6: "+list.remove(cymric));
		
		System.out.println("7: "+list.remove(p));
		System.out.println("8: "+list);
		
		list.add(3, new Mouse());
		System.out.println("9: "+list);
		
		List<Pet> sub = list.subList(2, 5);
		System.out.println("subList "+sub);
		System.out.println("10: "+list.containsAll(sub));
		
		Collections.sort(sub);
		System.out.println("sorted sub: "+sub);
		
		
		System.out.println("11: "+list.containsAll(sub));
		Collections.shuffle(sub,rand);
		
		System.out.println("shuffled sub: "+sub);
		System.out.println("12: "+list.containsAll(sub));
		
		List<Pet> copy = new ArrayList<>(list);
		sub = Arrays.asList(list.get(1),list.get(3));
		System.out.println(list);
		System.out.println("sub: "+sub);
		copy.retainAll(sub);
		System.out.println("13: "+copy);
		
		copy = new ArrayList<>(list);
		copy.remove(2);
		System.out.println("14: "+copy);
		
		//removeAll只移除第一个匹配的
		copy.removeAll(sub);
		System.out.println("15: "+copy);
		
		copy.set(1,new Mouse());
		System.out.println("16: "+copy);
		
		copy.addAll(2,sub);
		System.out.println("17: "+copy);
		
		System.out.println("18: "+list.isEmpty());
		list.clear();
		System.out.println("19: "+list);
		System.out.println("20: "+list.isEmpty());
		
		list.addAll(Pets.arrayList(4));
		System.out.println("21: "+list);
		
		Object[] o =list.toArray();
		System.out.println("22: "+o[3]);
		
		Pet[] pa = list.toArray(new Pet[0]);
		System.out.println("23: "+pa[3]);
	}
}
