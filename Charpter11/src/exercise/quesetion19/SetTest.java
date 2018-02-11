package exercise.quesetion19;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		for(int i=0 ;i<26;i++){
			set.add(i+"");
			set.add((char)('a'+i)+"");	
		}
		System.out.println(set);
		Set<String> sortedSet = new TreeSet<>(set);
		System.out.println(sortedSet);
		Set<String> linked = new LinkedHashSet<>(sortedSet);
		System.out.println(linked);
	}
}
