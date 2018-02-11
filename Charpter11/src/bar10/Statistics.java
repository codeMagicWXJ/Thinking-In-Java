package bar10;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/*
 * 	测试random生成各个数的概率是否相等
 * 	也就是是否是随记序列
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
