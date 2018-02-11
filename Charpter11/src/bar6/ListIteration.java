package bar6;

import java.util.List;
import java.util.ListIterator;

import domain.Pet;
import util.Pets;

public class ListIteration {
	public static void main(String[] args) {
		List<Pet> list = Pets.arrayList(10);
		ListIterator<Pet> it = list.listIterator();
		while(it.hasNext()){
			System.out.print(it.next()+", "+it.nextIndex()+", "+it.previousIndex()+"; ");
			
		}
		
		System.out.println();
		
		while(it.hasPrevious()){
			System.out.print(it.previous()+", "+it.nextIndex()+", "+it.previousIndex()+"; ");
		}
		System.out.println();
		System.out.println(list);
		
		it = list.listIterator(3);
		while(it.hasNext()){
			it.next();
			it.set(Pets.randomPet());
		}
		System.out.println(list);
	}
}
