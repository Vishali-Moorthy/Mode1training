package dummy;

public class Employ {
	
	int empNo;
	String name;
	double basic;
	
	public Employ[] showEmploy() {
		Employ[] arrEmploy=new Employ[3];
		
		arrEmploy[0]=new Employ();
		arrEmploy[0].empNo=1;
		arrEmploy[0].name="Priya";
		arrEmploy[0].basic=34567;
		
		arrEmploy[1]=new Employ();
		arrEmploy[1].empNo=2;
		arrEmploy[1].name="Swetha";
		arrEmploy[1].basic=44567;
		
		arrEmploy[2]=new Employ();
		arrEmploy[2].empNo=3;
		arrEmploy[2].name="Visha";
		arrEmploy[2].basic=54567;
		
		return arrEmploy;
	}
	public static void main(String[] args) {
		Employ objEmploy=new Employ();
		Employ[] res=objEmploy.showEmploy();
		for (Employ employ : res) {
			System.out.println(employ.empNo + " " +employ.name + " " +employ.basic);
		}
	}

}
