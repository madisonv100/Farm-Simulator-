// (hunger level +1)*2

public class Cow extends Animal {
	

	

	public Cow(String name, Integer hungerUnits) {
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
		System.out.print("MOO ");
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
	return "Cow";
	
}
	
	
}
