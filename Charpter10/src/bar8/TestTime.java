package bar8;

public class TestTime {
	public static class Inner{
		private static int a =0; 
	}
	public static void main(String[] args) {
		System.out.println(System.nanoTime()+" nanoTime()");
		System.out.println(System.currentTimeMillis()+" currentTimeMillis");
		System.out.println(Inner.a);
	}
}	
