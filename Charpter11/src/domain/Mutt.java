package domain;

public class Mutt extends Pet {
	private static long count = 1;
	public final long id = count++;
	public Mutt() {
		super();
	}
	public Mutt(String name) {
		super(name);
	}
	
}
