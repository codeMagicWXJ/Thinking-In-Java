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
 * 	����һ���������࣬��������ÿ�ε���next()����ʱ��������ϲ����Ӱ���ɵ����֡����ַ��б��еĵ�Ӱ����
 * 	����֮��ѭ��������ַ��б�Ŀ�ʼ����ʹ�����������������顢ArrayList��LinkedList��HashSet��
 *  LinkedHashSet��TreeSet��Ȼ���ӡÿһ������
 * 
 * 
 */
public class MovieGenerator {
	//����ϲ���ĵ�Ӱ�б�
	private static String [] movies = {"�ٶ��뼤��","��������","Clannad","DARLING in the FRANXX"};
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
