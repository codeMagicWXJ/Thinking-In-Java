package bar2;
/*
 * ���ӵ��ⲿ�ࣺ
 * 	�ڲ�������������غ�һ�ִ�����֯ģʽ��
 * 	�ڲ��໹����ֱ�ӷ��ʴ����ڲ��������ⲿ���������г�Ա������private���εĳ�Ա��
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
