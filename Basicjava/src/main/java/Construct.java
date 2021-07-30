
public class Construct {

int rollno;
String studentname;
	

	Construct()
	{
		rollno=100;
		studentname="hari";
		System.out.println("Object created");
	}
	
	
	
	public static void main(String[] args) {
		
		Construct cons=new Construct();
		
		int roll=cons.rollno;
		System.out.println(roll);
		System.out.println(cons.studentname);
		
		
		

	}

}
