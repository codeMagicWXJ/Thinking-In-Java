package bar6;

import java.util.Iterator;
import java.util.List;

import domain.Pet;
import util.Pets;

/*
 * 	ÑÝÊ¾µü´úÆ÷iterator
 * 
 */
public class SimpleIteration {
	public static void main(String[] args) {
		List<Pet> list = Pets.arrayList(12);
		Iterator<Pet> it = list.iterator();
		while(it.hasNext()){
			Pet p = it.next();
			System.out.print(p.id+":"+p+" ");
		}
		System.out.println();
		
		for(Pet p :list){
			System.out.print(p.id+":"+p+" ");
		}
		System.out.println();
		
		//An iterator can also remove elements
		it = list.iterator();
		for(int i=0;i<6;i++){
			it.next();
			it.remove();
		}
		for(Pet p :list){
			System.out.print(p.id+":"+p+" ");
		}
			
	}
}
