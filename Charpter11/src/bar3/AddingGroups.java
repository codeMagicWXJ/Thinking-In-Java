package bar3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*
 * 	向集合中添加一组元素
 * 
 * 
 */
public class AddingGroups {
	public static void main(String[] args) {
		Collection<Integer> collection = 
				new ArrayList<>(Arrays.asList(1,2,3,4,5));
		Integer [] moreInts = {6,7,8,9,10};
		collection.addAll(Arrays.asList(moreInts));
		
		//Collections工具类
		Collections.addAll(collection, 11,12,13,14);
		Collections.addAll(collection, moreInts);
		
		List<Integer> list = Arrays.asList(moreInts);
		list.add(22);
		list.set(1, 99);
		
		System.out.println(collection);
		System.out.println(list);
	}
}
