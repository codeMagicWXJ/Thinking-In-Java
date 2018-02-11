package exercise.quesetion18;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeSet;

public class MapTest {
	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<>();
		for(int i =0;i<26;i++){
			map.put(i, (char)('a'+i)+"");
		}
		System.out.println(map);
		
		Map<Integer,String> sortedMap = new LinkedHashMap<>();
		TreeSet<Integer> treeSet = new TreeSet<>(map.keySet());
		for(Integer in : treeSet){
			sortedMap.put(in, map.get(in));
		}
		
		System.out.println(sortedMap);
		
	}
}
