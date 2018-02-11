package bar2;
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
	private Object[] items;
	private int next = 0;
	
	public Sequence(int size){
		items = new Object[size];
	}
	public void add(Object item){
		if(next < items.length)
			items[next++] = item;
	}
	
	private  class SequenceSelector implements Selector{
		private int i = 0;
		
		@Override
		public boolean end() {
			return i == items.length;
		}

		@Override
		public Object current() {
			return items[i];
		}

		@Override
		public void next() {
			if(i < items.length)
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
		Sequence s = new Sequence(10);
		for(int i =0;i<100;i++){
			s.add(i);
		}
		Selector selector = s.selector();
		while(!selector.end()){
			System.out.print(selector.current()+"  ");
			selector.next();
		}
		
		Sequence.SequenceSelector selector1 = (SequenceSelector)selector;
		System.out.println(selector1.sequence().getClass());
		
	}
	

}
