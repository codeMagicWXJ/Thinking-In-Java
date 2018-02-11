package bar11;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Set;

public class PriorityQueueDemo {
	
	public static void main(String[] args) {
		PriorityQueue<Integer> queue = new  PriorityQueue<>();
		Random rand = new Random();
		for(int i=0;i<10;i++){
			queue.offer(rand.nextInt(i+10));
		}
		
		QueueDemo.printQ(queue);
		
		//Ingerger===============================================================
		List<Integer> list = Arrays.asList(26,22,20,17,14,9,3,1,1,3,9,14,17,20,22,26);
		queue = new PriorityQueue<>(list);
		QueueDemo.printQ(queue);
		
		queue = new PriorityQueue<>(list.size(), Collections.reverseOrder());
		queue.addAll(list);
		QueueDemo.printQ(queue);
		
		//String===============================================================
		String fact = "EDUCATION SHOULE ESCHEW OBFUSCATION";
		List<String> strList = Arrays.asList(fact.split(" "));
		
		PriorityQueue<String> strQueue = new PriorityQueue<>(strList);
		QueueDemo.printQ(strQueue);
		
		strQueue = new PriorityQueue<>(strList.size(), Collections.reverseOrder());
		strQueue.addAll(strList);
		QueueDemo.printQ(strQueue);
		
		//Character===============================================================
		Set<Character> set = new HashSet<>();
		for(char c:fact.toCharArray())
			set.add(c);
		
		PriorityQueue<Character> chQueue = new PriorityQueue<>(set);
		QueueDemo.printQ(chQueue);
		
	}
}
