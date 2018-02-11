package bar8;

import java.util.ArrayList;
import java.util.List;

public class Controller {
	private List<Event> eventList = new ArrayList<>();
	
	public void addEvent(Event event){
		eventList.add(event);
	}
	
	public void run(){
		while(eventList.size()>0){
			for(Event e : eventList){
				if(e.ready()){
					System.out.println(e);
					e.action();
					eventList.remove(e);
				}
			}
		}
	}
}
