package p1;

public class Demo {

	private int empno=12;
	public String name="Visali";
	protected String city="Chennai";
	double basic=85664.6;
	
	public void show() {
		Demo obj=new Demo();
		System.out.println(obj.basic);
		System.out.println(obj.city);
		System.out.println(obj.empno);
		System.out.println(obj.name);
	}
}
