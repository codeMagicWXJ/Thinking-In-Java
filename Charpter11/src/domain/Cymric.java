package domain;

public class Cymric extends Pet{
	private static long count = 1;
	public final long id = count++;
	public Cymric() {
		super();
	}
	public Cymric(String name) {
		super(name);
	}
	
}
