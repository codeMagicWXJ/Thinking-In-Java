package bar9;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetOfInteger {
	public static void main(String[] args) {
		Random rand = new Random();
		Set<Integer> set = new HashSet<>();
		
		for(int i=0;i<100;i++){
			set.add(rand.nextInt(30));
		}
		System.out.println(set.size());
		System.out.println(set);
		
	}
}
