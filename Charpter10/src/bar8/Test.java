package bar8;
/*
 * 	�����ڲ����Ƿ����ⲿ�ڵĽӿ�
 * 
 * 
 */
interface Service{
	void g();
}
public class Test {
	public void f(){
		System.out.println("Test.f()");
	}
	public class Inner implements Service{

		@Override
		public void g() {
			System.out.println("Inner.g()");
		}
	}
	public Service inner(){
		return new Inner();
	}
}

