package bar3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import domain.Person;
import domain.Student;

/*
 * ��ϰ���һ��Ԫ�ص�������
 */
public class MyTestAddingGroups {
	public static void main(String[] args) {
		Collection<Person> collection = new ArrayList<>();
		Collections.addAll(collection, 
				new Person("����",12),
				new Student("����",13,"No.1"),
				new Person("����",19)
				);
		
		System.out.println(collection);
	}
	
	private static void addGroups(){
		Collection<Integer> collection = new ArrayList<>();
		Collections.addAll(collection, 2,4,8,6,7);
		System.out.println(collection);
		collection.addAll(collection);
	}
}
