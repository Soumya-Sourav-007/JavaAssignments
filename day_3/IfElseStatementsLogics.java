package day_3;


/*

 * Decision_making Statements:
 		1. if_Statements
 		2. Switch State
 */


public class IfElseStatementsLogics {

	

	/*types { Syntax }:
				 Simple-if
							if(condition) {    
							statement 1; //executes when condition is true   
							} 
				if- else
							if(condition) {    
								statement 1; //executes when condition is true   
								}  
								else{  
								statement 2; //executes when condition is false   
								}  
				if -else-if
							if(condition 1) {    
								statement 1; //executes when condition 1 is true   
								}  
								else if(condition 2) {  
								statement 2; //executes when condition 2 is true   
								}  
								else {  
								statement 2; //executes when all the conditions are false   
								}  
				Nested if
							if(condition 1) {    
								statement 1; //executes when condition 1 is true   
								if(condition 2) {  
								statement 2; //executes when condition 2 is true   
								}  
								else{  
								statement 2; //executes when condition 2 is false   
								}  
						*/		 

		public static void main(String[] args) {

			int x = 115;  
			int y = 125;
			
			//simple if
			if (y>x) {
				System.out.println(" x > y ");
			}
			
			//if-else
			if(x+y < 10) {  
			System.out.println("x + y is less than      115");  
			}   else {  
			System.out.println("x + y is greater than 125");  
			}
			
			//if-else-if
			String city = "Delhi";  
			if(city == "Meerut") {  
			System.out.println("city is meerut");  
			}else if (city == "Noida") {  
			System.out.println("city is noida");  
			}else if(city == "Agra") {  
			System.out.println("city is agra");  
			}else {  
			System.out.println("Entered city is "+city);  
			}
			
			//Nested-if
			String address = "Delhi, India";    
		    
			if(address.endsWith("India")) {    
			if(address.contains("Meerut")) {    
			System.out.println("Your city is Meerut");    
			}else if(address.contains("Noida")) {    
			System.out.println("Your city is Noida");    
			}else {    
			System.out.println(address.split(",")[0]);    
			}    
			}else {    
			System.out.println("You are not living in India");    
			}    
		}

}
