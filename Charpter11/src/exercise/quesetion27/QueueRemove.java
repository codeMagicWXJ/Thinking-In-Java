package exercise.quesetion27;

import java.util.Queue;

public class QueueRemove {
	public static void poll(Queue<Command> queue){
		queue.poll().operation();
	}
}
