package exercise.quesetion28;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

import bar11.QueueDemo;

/*
 * 	—› æpriorityQueueÃÓ≥‰Double∂‘œÛ
 * 
 * 
 */
public class PriorityQueueDemo {
	public static void main(String[] args) {
		Random rand = new Random();
		Queue<Double> queue  = new PriorityQueue<>(1,Collections.reverseOrder());
		for(int i = 0;i<10;i++)
			queue.offer(rand.nextDouble()+rand.nextInt(20));
		
		QueueDemo.printQ(queue);
		
	}
}
