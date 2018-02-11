package bar1;
/*
 * 目的：
 * 	为什么在外部内的非静态方法中，可以不用写全内部类的标识符
 * 	结论：
 * 		在静态方法中，也可以省略外部类的类名。
 * 		那么
 * 
 * 
 */
public class Parcel2 {
	class Contents{
		private int  i = 11;
		public int value(){
			return i;
		}
	}
	class Destination{
		private String label;
		Destination(String whereTo){
			label = whereTo;
		}
		String readLabel(){
			return label;
		}
	}
	
	public Contents contents(){
//		return new bar1.Contents();
		return new Contents();
	}
	
	public Destination destination(String dest){
		return new Destination(dest);
	}
	
	public void ship(String dest){
		Contents c = contents();
		Destination d = destination(dest);
		System.out.println(c.getClass());
		System.out.println(d.getClass().getSimpleName());
		System.out.println(d.readLabel());
	}
	
	public static void main(String[] args) {
		Parcel2 p = new Parcel2();
		p.ship("Tasmania");
		Contents c1 = p.contents();
		Destination d1 = p.destination("Borneo");
		System.out.println(d1.getClass()+"   "+c1.getClass());
	}
	
}
