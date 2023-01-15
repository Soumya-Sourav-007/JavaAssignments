package day_2;


//animal characteristics
public class AnimalCharesteristics {
	
	String type;
	byte noOfLegs;
	String foodPreference;
	String mobility;
	String livingPreference;
	
	
	public static void main(String[] args) {
		
		AnimalCharesteristics tiger = new AnimalCharesteristics();
		AnimalCharesteristics lion = new AnimalCharesteristics();
		AnimalCharesteristics turtle = new AnimalCharesteristics();
		AnimalCharesteristics snake = new AnimalCharesteristics();
		AnimalCharesteristics cow = new AnimalCharesteristics();
	
		
		//for Tiger 
		tiger.type = "mamal";
		tiger.noOfLegs = 4;
		tiger.foodPreference = "carnivorous";
		tiger.mobility = "fast";
		tiger.livingPreference = "earth surface";
		System.out.println(":: Tiger ::");
		System.out.println("Type of animal :: " + tiger.type);
		System.out.println("Numbers of legs have :: " + tiger.noOfLegs);
		System.out.println("Food preference :: " + tiger.foodPreference);
		System.out.println("Food Preference :: " + tiger.mobility);
		System.out.println("Living preference :: " + tiger.livingPreference);
		
		
		//for lion
		lion.type = "mamal";
		lion.noOfLegs = 4;
		lion.foodPreference = "carnivorous";
		lion.mobility = "fast";
		lion.livingPreference = "earth surface";
		System.out.println(":: Lion ::");
		System.out.println("Type of animal :: " + lion.type);
		System.out.println("Numbers of legs have :: " + lion.noOfLegs);
		System.out.println("Food preference :: " + lion.foodPreference);
		System.out.println("Food Preference :: " + lion.mobility);
		System.out.println("Living preference :: " + lion.livingPreference);
		
		//for turtle
		turtle.type = "amphibia";
		turtle.noOfLegs = 4;
		turtle.foodPreference = "omnivorous";
		turtle.mobility = "slow";
		turtle.livingPreference = "earth surface and water";
		System.out.println(":: Turtle ::");
		System.out.println("Type of animal :: " + turtle.type);
		System.out.println("Numbers of legs have :: " + turtle.noOfLegs);
		System.out.println("Food preference :: " + turtle.foodPreference);
		System.out.println("Food Preference :: " + turtle.mobility);
		System.out.println("Living preference :: " + turtle.livingPreference);
		
		
		//for snake
		snake.type = "Reptile";
		snake.noOfLegs = 0;
		snake.foodPreference = "carnivorous";
		snake.mobility = "fast";
		snake.livingPreference = "earth surface and water";
		System.out.println(":: Snake ::");
		System.out.println("Type of animal :: " + snake.type);
		System.out.println("Numbers of legs have :: " + snake.noOfLegs);
		System.out.println("Food preference :: " + snake.foodPreference);
		System.out.println("Food Preference :: " + snake.mobility);
		System.out.println("Living preference :: " + snake.livingPreference);
		
		
		//for cow
		cow.type = "mamal";
		cow.noOfLegs = 4;
		cow.foodPreference = "herbivorous";
		cow.mobility = "slow";
		cow.livingPreference = "earth surface";
		System.out.println(":: Cow ::");
		System.out.println("Type of animal :: " + cow.type);
		System.out.println("Numbers of legs have :: " + cow.noOfLegs);
		System.out.println("Food preference :: " + cow.foodPreference);
		System.out.println("Food Preference :: " + cow.mobility);
		System.out.println("Living preference :: " + cow.livingPreference);
	}

}
