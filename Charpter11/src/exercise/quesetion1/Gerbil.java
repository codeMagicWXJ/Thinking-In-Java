package exercise.quesetion1;

import java.util.ArrayList;
import java.util.List;

public class Gerbil {
	public final int gerbilNumber;
	private String name ;
	
	@Override
	public String toString(){
		return name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public Gerbil(String name){
		this(0);
		this.name =name;
	}

	public Gerbil(int number){
		gerbilNumber = number;
	}
	
	public void hop(){
		System.out.println(gerbilNumber+" is jumping");
	}
	
	
	public static void main(String[] args) {
		List<Gerbil> list = new ArrayList<>();
		for(int i =0;i<10;i++)
			list.add(new Gerbil(i));
		
		for(int i =0 ;i < list.size();i++)
			list.get(i).hop();
	}
}
