import java.util.Random;

public abstract class Animal implements Comparable<Animal> {
	
private String name;

private Integer hungerUnits;

private int feedCount = 1;

private boolean sleep = false;

private Random rand = new Random();


public Animal (String name, Integer  hungerUnits)
{
	this.name = name;
	this.hungerUnits = hungerUnits;
	
}
	
public abstract void speak();


public void  tick()
{
if (hungerUnits <24)
{
	hungerUnits++;
}
	if (hungerUnits%5==0)
	{
		sleep= false;
		
	}
		
    
	
	
}


public int hungerLevel()
{
	
	return (hungerUnits/5);
	
}

private final static String[] levels = {"full","Peckish","Hungry","Very Hungry", "Starving"};

public String getHungerLevelName()
{ 
return levels[hungerLevel()];

//	int val =hungerLevel();
//
//	if (val == 0)
//	{
//		return "full";
//	}
//	else if (val == 1)
//	{
//		return "Peckish";
//	}
//	else if (val == 2)
//	{
//		return "Hungry";
//	}
//	else if (val == 3)
//	{
//		return "Very Hungry";
//	}
//	else {
//		return "Starving";
//		
//	}

}

public void  sleep()
{
	int sleepNumber = rand.nextInt(10);
	if (sleepNumber == 1)
	{
		sleep = true;
		
		
	}else {
		sleep = false;
	}

}


public void feed()
{

	
	
	System.out.println("Feed  " + feedCount );
	
	feedCount ++;
	sleep();
	if (!sleep && hungerUnits > 4)
	{
	hungerUnits = hungerUnits - 5;
	}
	
	
	
	

	


	
}
	
		
public String getName()
{
	return name;
	
}
public boolean getSleep()
{
	return sleep;
	
}

public String toString ()
{
	return  getName()+ " is " + getHungerLevelName(); 
}
	
@Override
public int compareTo(Animal o) {
	
	return o.hungerUnits.compareTo(this.hungerUnits);
	
}
}
