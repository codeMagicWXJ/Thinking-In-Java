package bar8;
/*
 * 	测试内部类是否有外部内的接口
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

