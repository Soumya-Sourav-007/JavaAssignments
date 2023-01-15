package day_3;

public class SwitchCaseLogics {

	/*In Java, Switch statements are similar to if-else-if statements.
	The switch statement contains multiple blocks of code called cases and a single case is executed based on the variable which is being switched.
	The switch statement is easier to use instead of if-else-if statements.
	It also enhances the readability of the program.
	*/
	/*Points to be noted in Switch_Case:
	1. The case variables can be int, short, byte, char, or enumeration. String type is also supported since version 7 of Java
	2. Cases cannot be duplicate
	3. Default statement is executed when any of the case doesn't match the value of expression. It is optional.
	4. Break statement terminates the switch block when the condition is satisfied.
	5. It is optional, if not used, next case is executed.
	6. While using switch statements, we must notice that the case expression will be of the same type as the variable. However, it will also be a constant value.
	
		/*
			switch (expression){  
			    case value1:  
			     statement1;  
			     break;  
			    .  
			    .  
			    .  
			    case valueN:  
			     statementN;  
			     break;  
			    default:  
			     default statement;  
				}  
				  
		  */

		public static void main(String[] args) {
		
			int num = 3;
			
			switch (num){  
				case 0:  
				System.out.println("number is 0");  
				break;  
				case 1:  
				System.out.println("number is 1");  
				break;  
				default:  
				System.out.println("default_number is :: "+num);  
			}  

		}
	
}
