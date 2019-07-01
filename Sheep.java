//hinger level + 2

public class Sheep extends Animal  {




	public Sheep(String name, int hungerUnits) {
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
		System.out.print("BAHH ");
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
		return "Sheep";
		
	}

}
