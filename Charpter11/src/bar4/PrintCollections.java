package bar4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/*
 * 	打印集合，
 * 打印数组要用工具类Array.toString()
 * 	而打印集合直接答应
 * 
 * 
 */
public class PrintCollections {
	public static void main(String[] args) {
		printArray();
		System.out.println(fill(new ArrayList<String>()));
		System.out.println(fill(new LinkedList<String>()));
		System.out.println(fill(new HashSet<String>()));
		System.out.println(fill(new TreeSet<String>()));
		System.out.println(fill(new LinkedHashSet<String>()));
		
		System.out.println(fill(new HashMap<String,String>()));
		System.out.println(fill(new TreeMap<String,String>()));
		System.out.println(fill(new LinkedHashMap<String,String>()));
	}
	
	static Collection<String> fill(Collection<String> coll){
		coll.add("rat");
		coll.add("cat");
		coll.add("dog");
		coll.add("dog");
		return coll;
	}
	
	static Map<String,String> fill(Map<String,String> map){
		map.put("rat", "Fuzzy");
		map.put("cat", "Rags");
		map.put("dog", "Bosco");
		map.put("dog", "Spot");
		return map;
	}
	
	
	private static void printArray() {
		int[] arr = {12,3,4,5,6,7};
		String result = Arrays.toString(arr);
		System.out.println(result);
	}
	
	
}
