import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class Main {

	public static void main(String [] args) {
		
		ArrayList<Animal> farm = new ArrayList<>();
		
		farm.add(new Cow("Betsy", hungryUnit() ));
		farm.add(new Cow("Carne",hungryUnit()));

		farm.add(new Chicken("Little", hungryUnit() ));
		farm.add(new Chicken("Fried",hungryUnit()));

		farm.add(new Dog("Cliffard", hungryUnit()));
		farm.add(new Dog("Rover",hungryUnit()));

		farm.add(new Pig("Wilber", hungryUnit()));
		farm.add(new Pig("Bacon",hungryUnit()));

		farm.add(new Sheep("Stacy", hungryUnit() ));
		farm.add(new Sheep("Chop",hungryUnit()));

		
		
		
		Collections.sort(farm);
		
		
		while (farm.get(0).hungerLevel() > 0)
		{Collections.sort(farm);
		for (Animal animal : farm )
		{
    		animal.tick();
    		animal.feed();
    		animal.speak();
    		System.out.println();
    		System.out.println(animal);
    		System.out.println();
    
			
			
			
			
		}}
		
		
	}
	static Random rand = new Random();

	public static int hungryUnit()
	{
		int hungerUnits = rand.nextInt(24);
		return hungerUnits;
		
	}

}
