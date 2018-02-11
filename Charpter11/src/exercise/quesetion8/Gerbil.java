package exercise.quesetion8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Gerbil {
	public final int gerbilNumber;
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
		Iterator<Gerbil> it = list.iterator();
		while(it.hasNext())
			it.next().hop();
	}
}
