package domain;

public abstract class Pet implements Comparable<Pet> {
	private String name;
	private static long count = 1;
	public final long id = count++;
	
	
	public Pet(String name) {
		super();
		this.name = name;
	}
	

	public Pet() {
		super();
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName()+":"+name;
	}
	
	@Override
	public int compareTo(Pet o) {
		return this.getClass().getSimpleName().compareTo(o.getClass().getSimpleName());
	}
}
