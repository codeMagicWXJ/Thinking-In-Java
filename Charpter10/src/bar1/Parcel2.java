package bar1;
/*
 * Ŀ�ģ�
 * 	Ϊʲô���ⲿ�ڵķǾ�̬�����У����Բ���дȫ�ڲ���ı�ʶ��
 * 	���ۣ�
 * 		�ھ�̬�����У�Ҳ����ʡ���ⲿ���������
 * 		��ô
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
