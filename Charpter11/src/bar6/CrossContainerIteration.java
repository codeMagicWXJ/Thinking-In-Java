package bar6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

import domain.Pet;
import util.Pets;

/*
 * 	有个display()方法，这个方法接受一个迭代器，
 * 然后迭代所有元素，并打印出来。
 * 
 */
public class CrossContainerIteration {
	public static void display(Iterator<Pet> it){
		while(it.hasNext()){
			Pet p = it.next(); 
			System.out.print(p.id+":"+p+" ");
			
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		ArrayList<Pet> arrayList = (ArrayList<Pet>)Pets.arrayList(8);
		LinkedList<Pet> linkedList = new LinkedList<>(arrayList);
		HashSet<Pet> hashSet = new HashSet<>(arrayList);
		
		TreeSet<Pet> treeSet = new TreeSet<>(arrayList);
		
		display(arrayList.iterator());
		display(linkedList.iterator());
		display(hashSet.iterator());
		display(treeSet.iterator());
		
		System.out.println(treeSet.size());
 		
	}
}
