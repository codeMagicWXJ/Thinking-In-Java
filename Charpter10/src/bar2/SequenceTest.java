package bar2;
/*
 * 	在其他那种，是否可以访问私有的内部类
 * 		对象是没有作用域的，只有指向对象的引用才有作用范围。
 */
public class SequenceTest {
	public static void main(String[] args) {
//		test1();
		Sequence s = new Sequence(10);
		Selector selector = s.selector();
	}

	private static void test1() {
		Sequence s = new Sequence(10);
		for(int i =0;i<100;i++){
			s.add(i);
		}
		Selector selector = s.selector();
		while(!selector.end()){
			System.out.print(selector.current()+"  ");
			selector.next();
		}
	}

}
