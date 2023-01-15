package day_2;

public class Bike {

	String modelName;
	String company;
	int cubicCapacity;
	int horsePower;
	String engineType;
	byte noOfCylinders;
	byte gears;
	byte milage;
	float zeroToHundred;
	
	public static void main(String[] args) {
		
		Bike kawasaki = new Bike();
		Bike yamaha = new Bike();
		
		
		//For kawasaki
		kawasaki.company = "Kawasaki";
		kawasaki.modelName = "Z900";
		kawasaki.cubicCapacity = 898;
		kawasaki.horsePower = 125;
		kawasaki.engineType = "inline Four";
		kawasaki.noOfCylinders = 4;
		kawasaki.gears = 6;
		kawasaki.milage = 18;
		kawasaki.zeroToHundred = 2.8f;
		
		System.out.println("   ::::: Super Bike :::::  ");
		System.out.println("The company of the bike :: " + kawasaki.company);
		System.out.println("Model name :: " + kawasaki.modelName);
		System.out.println("Cubic capacity :: " + kawasaki.cubicCapacity + "cc");
		System.out.println("Horse power :: " + kawasaki.horsePower + "hp");
		System.out.println("Engine type :: " + kawasaki.engineType);
		System.out.println("Number of Cylinders :: " + kawasaki.noOfCylinders);
		System.out.println("Number of Gears :: " + kawasaki.gears);
		System.out.println("Milage :: " + kawasaki.milage + "kmpl");
		System.out.println("Zero to hunderd :: " + kawasaki.zeroToHundred + "seconds");
		
		
		
		//For Yamaha
				yamaha.company = "Yamaha";
				yamaha.modelName = "R1";
				yamaha.cubicCapacity = 998;
				yamaha.horsePower = 212;
				yamaha.engineType = "inline Four";
				yamaha.noOfCylinders = 4;
				yamaha.gears = 6;
				yamaha.milage = 14;
				yamaha.zeroToHundred = 2.3f;
				
				System.out.println("   ::::: Super Bike :::::  ");
				System.out.println("The company of the bike :: " + yamaha.company);
				System.out.println("Model name :: " + yamaha.modelName);
				System.out.println("Cubic capacity :: " + yamaha.cubicCapacity + "cc");
				System.out.println("Horse power :: " + yamaha.horsePower + "hp");
				System.out.println("Engine type :: " + yamaha.engineType);
				System.out.println("Number of Cylinders :: " + yamaha.noOfCylinders);
				System.out.println("Number of Gears :: " + yamaha.gears);
				System.out.println("Milage :: " + yamaha.milage + "kmpl");
				System.out.println("Zero to hunderd :: " + yamaha.zeroToHundred + "seconds");
	}
	
	
}
