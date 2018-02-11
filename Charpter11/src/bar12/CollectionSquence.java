package bar12;

import java.util.AbstractCollection;
import java.util.Iterator;

import domain.Pet;
import util.Pets;

public class CollectionSquence extends AbstractCollection<Pet>{
	private Pet [] pets = Pets.arrayList(8).toArray(new Pet [0]);

	@Override
	public Iterator<Pet> iterator() {
		return new Iterator<Pet>(){
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

	@Override
	public int size() {
		return pets.length;
	}
	
	public static void main(String[] args) {
		CollectionSquence cs = new CollectionSquence();
		InterfaceVsIterator.display(cs);
		InterfaceVsIterator.display(cs.iterator());
	}
}
