package domain;

public class Student extends Person {
	private String stuNumber;

	public String getStuNumber() {
		return stuNumber;
	}

	public void setStuNumber(String stuNumber) {
		this.stuNumber = stuNumber;
	}
	
	public void show(){
		System.out.println(stuNumber+"  "+getName());
	}

	

	public Student(String name, int age,String stuNumber) {
		super(name, age);
		this.stuNumber = stuNumber;
	}

	public Student() {
		super();
	}
	
	
}
