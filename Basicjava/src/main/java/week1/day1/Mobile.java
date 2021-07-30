package week1.day1;

public class Mobile {

	public int getprice() 
	{
		return 70000;
	}
	
	public String getmodel()
	{
		return "iphone";
	}

  private void getpicture()
  {
	  System.out.print(":The picture of the wallpaper is a bike");
 
  }

public static void main (String[]args)
{
	Mobile mycell = new Mobile();
			mycell.getprice();
			mycell.getmodel();
			System.out.println("The value of the mobile is" +mycell.getprice());
			System.out.println("The model of the mobile is"+mycell.getmodel());
}

public int getprice(int type)
{
if (type ==1)
{
	return 10000;
	
}
else if (type ==2)
{
	return 20000;
}
else if (type ==3)
{
	return 30000;
}
else
{
	return 40000;
}
}


}
