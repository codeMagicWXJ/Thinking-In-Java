package exercise.quesetion4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/*
 * 	创建一个生成器类，它可以在每次调用next()方法时，生成最喜欢电影构成的名字。在字符列表中的电影名称
 * 	用完之后，循环到这个字符列表的开始处，使用这个生成器填充数组、ArrayList、LinkedList、HashSet、
 *  LinkedHashSet、TreeSet，然后打印每一个集合
 * 
 * 
 */
public class MovieGenerator {
	//我最喜欢的电影列表
	private static String [] movies = {"速度与激情","刀剑神域","Clannad","DARLING in the FRANXX"};
	private static int index = 0;
	
	public static String next(){
		if(index > movies.length-1)
			index = 0;
		return movies[index++];
	}
	
	public static void  fill(Collection<String> collection){
		index = 0;
		for(int i =0 ;i<10 ;i++){
			collection.add(next());
		}
	}
	
	
	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<>();
		List<String> linkedList = new LinkedList<>();
		Set<String> hashSet = new HashSet<>();
		Set<String> linkedHashSet= new LinkedHashSet<>();
		Set<String> treeSet= new TreeSet<>();
		
		fill(arrayList);
		fill(linkedList);
		fill(hashSet);
		fill(linkedHashSet);
		fill(treeSet);
		
		
		System.out.println(arrayList.getClass().getName() + arrayList);
		System.out.println(linkedList.getClass().getName() + linkedList);
		System.out.println(hashSet.getClass().getName() + hashSet);
		System.out.println(linkedHashSet.getClass().getName() + linkedHashSet);
		System.out.println(treeSet.getClass().getName() + treeSet);
	}
	
}
