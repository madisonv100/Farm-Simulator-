//(hunger Level *3) 

public class Pig extends Animal{



	public Pig(String name, Integer hungerUnits) {
		super(name, hungerUnits);
		
	}
	public void speak()
	{  
	hungerLevel();
    if (getSleep() == true)
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
		System.out.print("OINK ");
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
		return "Pig";
		
	}
	
}
