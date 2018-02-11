package exercise.quesetion11;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import domain.Pet;
import util.Pets;

public class CrossContainerIteration {
	public static void display(Collection<Pet> coll){
		Iterator<Pet> it = coll.iterator();
		while(it.hasNext()){
			Pet p = it.next();
			System.out.print(p.id+":"+p+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		List<Pet> arrayList = Pets.arrayList(10);
		List<Pet> linkedList = new LinkedList<>(arrayList);
		Set<Pet> hashSet = new HashSet<>(arrayList);
		Set<Pet> linkedHastSet = new LinkedHashSet<>(arrayList);
		Set<Pet> treeSet = new TreeSet<>(arrayList);
		
		display(arrayList);
		display(linkedList);
		display(hashSet);
		display(linkedHastSet);
		display(treeSet);
		
	}
	
}
