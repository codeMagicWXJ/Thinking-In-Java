package exercise.quesetion27;

public class Command {
	private String str;
	
	public Command(String str) {
		super();
		this.str = str;
	}

	public void operation(){
		System.out.println(str);
	}
}
