package bar2;
/*
 * 	���������֣��Ƿ���Է���˽�е��ڲ���
 * 		������û��������ģ�ֻ��ָ���������ò������÷�Χ��
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
