
public class Consparameter {

	

		
		String animal_name;
		String animal_type;
		
		
		
		Consparameter(String rec,String acc)
		{
			animal_name=rec;
			animal_type=acc;
			
			
		}
		
		
		public void sayaboutanimal()
		{
			System.out.println("animal details ="+animal_name +animal_type);
		}
		
		
		
		public static void main(String[] args) {
			
			Consparameter cons=new Consparameter("Lion", "Heavy");
			
			cons.sayaboutanimal();
		}

	}

	