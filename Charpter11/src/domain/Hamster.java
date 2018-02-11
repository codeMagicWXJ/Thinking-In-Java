package domain;

public class Hamster extends Pet {
	private static long count = 1;
	public final long id = count++;
	public Hamster() {
		super();
	}
	public Hamster(String name) {
		super(name);
	}
	

}
