package domain;

public class Pug extends Pet{
	private static long count = 1;
	public final long id = count++;
	public Pug() {
		super();
	}
	public Pug(String name) {
		super(name);
	}
	
}
