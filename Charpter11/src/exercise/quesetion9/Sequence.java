package exercise.quesetion9;

import java.nio.channels.Selector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * 链接到外部类：
 * 	内部类除了名字隐藏和一种代码组织模式外
 * 	内部类还可以直接访问创建内部类对象的外部类对象的所有成员（包括private修饰的成员）
 * 
 * 
 */



public class Sequence {
	private List items;
	
	public Sequence(){
		items = new ArrayList();
	}
	public void add(Object item){
		items.add(item);
	}
	
	private  class SequenceIterator implements  Iterator{
		private int i = 0;

		@Override
		public boolean hasNext() {
			return i < items.size();
		}

		@Override
		public Object next() {
			return items.get(i++);
		}

		@Override
		public void remove() {
			items.remove(i);
		}
		
		
	}
	
	public Iterator iterator(){
		return new  SequenceIterator();
	}
	
	public static void main(String[] args) {
		Sequence s = new Sequence();
		for(int i =0;i<100;i++){
			s.add(i);
		}
		Iterator it = s.iterator();
		int count = 0;
		while(it.hasNext()){
			if(count++==9){
				System.out.println();
				count = 0;
			}
			System.out.print(it.next()+"  ");
		}
		System.out.println();
		
	}
	

}
