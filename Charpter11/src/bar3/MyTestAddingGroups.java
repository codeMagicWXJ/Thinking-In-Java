package bar3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import domain.Person;
import domain.Student;

/*
 * 练习添加一组元素到容器中
 */
public class MyTestAddingGroups {
	public static void main(String[] args) {
		Collection<Person> collection = new ArrayList<>();
		Collections.addAll(collection, 
				new Person("张三",12),
				new Student("李四",13,"No.1"),
				new Person("王五",19)
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
