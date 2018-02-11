package exercise.quesetion27;

import java.util.LinkedList;
import java.util.Queue;

public class QueueOffer<T> {
	private Queue<T> queue = new LinkedList<>();
	
	public T offer(T com){
		queue.offer(com);
		return com;
	}
	public Queue<T> queue(){
		return queue;
	}
}
