
public class Consoverload {

	
	String draw;
	
	Consoverload()
	{
		System.out.println("no argument passes");
	}
	
	Consoverload(String name)
	{
		draw=name;
		
		System.out.println("overload ="+draw);
	}
	
	public static void main(String[] args) {
		Consoverload cons=new Consoverload("karthik");
		Consoverload cons1=new Consoverload();

	}

}
