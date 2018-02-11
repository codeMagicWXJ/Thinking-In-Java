package domain;

public class Manx extends Pet{
	private static long count = 1;
	public final long id = count++;
	public Manx() {
		super();
	}
	public Manx(String name) {
		super(name);
	}
		
}
