package exercise.quesetion29;

import java.util.PriorityQueue;
import java.util.Queue;

import domain.Question29;

/*
 * 	创建一个基础子Object的简单类，它不包含任何成员，展示你不能将这个类的多个实例成功
 *  添加到PriorityQueue中
 * 
 * 
 */
public class Demo {
	public static void main(String[] args) {
		Queue<Question29> queue = new PriorityQueue<>();
		queue.offer(new Question29());
		queue.offer(new Question29());
		
	}
}
