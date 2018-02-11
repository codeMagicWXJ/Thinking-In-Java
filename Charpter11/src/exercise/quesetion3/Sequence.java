package exercise.quesetion3;

import java.util.ArrayList;
import java.util.List;

/*
 * 链接到外部类：
 * 	内部类除了名字隐藏和一种代码组织模式外
 * 	内部类还可以直接访问创建内部类对象的外部类对象的所有成员（包括private修饰的成员）
 * 
 * 
 */
interface Selector{
	boolean end();
	Object current();
	void next();
}


public class Sequence {
	private List items;
	private int next = 0;
	
	public Sequence(){
		items = new ArrayList();
	}
	public void add(Object item){
		items.add(item);
	}
	
	private  class SequenceSelector implements Selector{
		private int i = 0;
		
		@Override
		public boolean end() {
			return i == items.size();
		}

		@Override
		public Object current() {
			return items.get(i);
		}

		@Override
		public void next() {
			if(i < items.size())
				i++;
		}
		
		public Sequence sequence(){
			return Sequence.this;
		}
		
	}
	
	public Selector selector(){
		return new SequenceSelector();
	}
	
	public static void main(String[] args) {
		Sequence s = new Sequence();
		for(int i =0;i<100;i++){
			s.add(i);
		}
		Selector selector = s.selector();
		while(!selector.end()){
			System.out.print(selector.current()+"  ");
			selector.next();
		}
		System.out.println();
		
	}
	

}
