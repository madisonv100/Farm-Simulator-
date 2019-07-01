//(hunger level +1 ) 

public class Chicken extends Animal {




	public Chicken(String name, Integer hungerUnits) {
		super(name, hungerUnits);
		
	}


	public void speak()
	{  
	hungerLevel();
    if (getSleep())
    {
		for (int i = 0; i <= (hungerLevel()+1)*2; i++)
		{
		System.out.print("SNORE ");
		}
    }
    else
    {
    	for (int i = 0; i <= (hungerLevel()+1)*2; i++)
		{
		System.out.print("CLUCK ");
		}	
    }
	}
	
	
	
	@Override 
	public String toString ()
	{
	
		return   getName()+ " the "+ animalType() + " is " + getHungerLevelName(); 
	}

	

	private String animalType() 
	{
		return "Chicken";
		
	}


	
}
