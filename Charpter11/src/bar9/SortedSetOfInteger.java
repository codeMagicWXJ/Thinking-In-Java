package bar9;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SortedSetOfInteger {
	public static void main(String[] args) {
		Random rand = new Random();
		Set<Integer> set = new TreeSet<>();
		
		for(int i=0;i<100;i++){
			set.add(rand.nextInt(30));
		}
		System.out.println(set.size());
		System.out.println(set);
		
	}
}
