package bar13;

import java.util.Iterator;

import domain.Pet;

public class IterableClass implements Iterable<String> {
	protected String [] words = 
			"And that is how we know the Earth to be banana-shaped.".split(" ");
	@Override
	public Iterator<String> iterator() {
		return new Iterator<String>() {
			private int index = 0;
			@Override
			public boolean hasNext() {
				return index < words.length;
			}

			@Override
			public String next() {
				return words[index++];
			}

			@Override
			public void remove() {
				throw new UnsupportedOperationException();
			}
		};
	}
	public static void main(String[] args) {
		IterableClass ic = new IterableClass();
		for(String str : ic)
			System.out.print(str+" ");
	}

}
