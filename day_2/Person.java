package day_2;


// persons charesteristics


public class Person {
	
	String name;
	String gender;
	byte age;
	String complaxtion;
	float height;
	String bodyType;
	String eyeColour;
	String hairType;
	boolean marriage;
	boolean smoking;
	boolean drinkingAlcohol;
	
	public static void main(String[] args) {
		
		Person ram = new Person();
		Person radhika = new Person();
		
		//for ram
		ram.name = "ram";
		ram.gender = "male";
		ram.age = 34;
		ram.complaxtion = "Medium";
		ram.height = (float) 5.9;
		ram.bodyType = "slim";
		ram.eyeColour = "black";
		ram.hairType = "short";
		ram.marriage = true;
		ram.smoking = true;
		ram.drinkingAlcohol = false;
		
		System.out.println("  :::::Person::::: ");
		System.out.println("Name of the person :: " + ram.name);
		System.out.println("Gender :: " + ram.gender);
		System.out.println("Age of the person :: " + ram.age);
		System.out.println("Coplaxion :: " + ram.complaxtion);
		System.out.println("Height :: " + ram.height + "ft");
		System.out.println("Body type :: " + ram.bodyType);
		System.out.println("Eye colour :: " + ram.eyeColour);
		System.out.println("Hair type :: " + ram.hairType);
		System.out.println("Married :: " + ram.marriage);
		System.out.println("Smoking :: " + ram.smoking);
		System.out.println("Drinking Alcohol :: " + ram.drinkingAlcohol);
		
		
		
		
		//for radhika
		
		radhika.name = "Radhika";
		radhika.gender = "female";
		radhika.age = 26;
		radhika.complaxtion = "Fair";
		radhika.height = (float) 5.4;
		radhika.bodyType = "slim";
		radhika.eyeColour = "black";
		radhika.hairType = "short";
		radhika.marriage = false;
		radhika.smoking = false;
		radhika.drinkingAlcohol = false;

		System.out.println("  :::::Person::::: ");
		System.out.println("Name of the person :: " + radhika.name);
		System.out.println("Gender :: " + radhika.gender);
		System.out.println("Age of the person :: " + radhika.age);
		System.out.println("Coplaxion :: " + radhika.complaxtion);
		System.out.println("Height :: " + radhika.height + "ft");
		System.out.println("Body type :: " + radhika.bodyType);
		System.out.println("Eye colour :: " + radhika.eyeColour);
		System.out.println("Hair type :: " + radhika.hairType);
		System.out.println("Married :: " + radhika.marriage);
		System.out.println("Smoking :: " + radhika.smoking);
		System.out.println("Drinking Alcohol :: " + radhika.drinkingAlcohol);
	
		
		
	}
	
	
	
	
	
}
