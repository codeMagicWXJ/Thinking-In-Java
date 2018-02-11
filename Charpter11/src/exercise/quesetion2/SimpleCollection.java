package exercise.quesetion2;

import java.util.Collection;
import java.util.HashSet;

public class SimpleCollection {
	public static void main(String[] args) {
		Collection<Integer> coll = new HashSet<>();
		
		for(int i =0;i<10;i++)
			coll.add(i);
		
		for(Integer in : coll)
			System.out.print(in+" ");
	}
}
