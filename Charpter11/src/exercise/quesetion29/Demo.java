package exercise.quesetion29;

import java.util.PriorityQueue;
import java.util.Queue;

import domain.Question29;

/*
 * 	����һ��������Object�ļ��࣬���������κγ�Ա��չʾ�㲻�ܽ������Ķ��ʵ���ɹ�
 *  ��ӵ�PriorityQueue��
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
