package bar10;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/*
 * 	����random���ɸ������ĸ����Ƿ����
 * 	Ҳ�����Ƿ����������
 * 
 * 
 */
public class Statistics {
	public static void main(String[] args) {
		Random rand = new Random();
		Map<Integer,Integer> map = new HashMap<>();
		for(int i =0;i<10000;i++){
			int num = rand.nextInt(20);
			Integer freg = map.get(num);
			map.put(num, freg == null ? 1:freg+1);
		}
		System.out.println(map);
	}
}
