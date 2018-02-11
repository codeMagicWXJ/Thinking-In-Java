package bar12;

import java.util.Iterator;

import domain.Pet;

public class NonCollectionSequence extends PetSequence implements Iterable<Pet>{
	@Override
	public Iterator iterator(){
		return new Iterator<Pet>() {
			private int index = 0;
			@Override
			public boolean hasNext() {
				return index < pets.length;
			}

			@Override
			public Pet next() {
				return pets[index++];
			}

			@Override
			public void remove() {
				throw new UnsupportedOperationException();
			}
			
		};
	}
		
	public Iterator reverseIterator(){
		return new Iterator<Pet>() {
			private int index = pets.length-1;
			@Override
			public boolean hasNext() {
				return index >= 0 ;
			}

			@Override
			public Pet next() {
				return pets[index--];
			}

			@Override
			public void remove() {
				throw new UnsupportedOperationException();
			}
		};
	}
	public static void main(String[] args) {
		NonCollectionSequence ncs = new NonCollectionSequence();
		InterfaceVsIterator.display(ncs.iterator());
		InterfaceVsIterator.display(ncs.reverseIterator());
		for(Pet p: ncs)
			System.out.println(p);
	}
	
}
