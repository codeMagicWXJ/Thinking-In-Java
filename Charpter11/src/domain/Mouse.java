package domain;

public class Mouse extends Pet {
	private static long count = 1;
	public final long id = count++;
	public Mouse() {
		super();
	}
	public Mouse(String name) {
		super(name);
	}
	
}
