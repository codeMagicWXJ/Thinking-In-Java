package domain;

public class Rat extends Pet {
	private static long count = 1;
	public final long id = count++;
	public Rat() {
		super();
	}
	public Rat(String name) {
		super(name);
	}
	
	
}
