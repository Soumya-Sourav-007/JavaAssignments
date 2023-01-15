package day_3;


	
	/*Looping_Statements:
	 In programming, sometimes we need to execute the block of code repeatedly while some condition evaluates to true.
	  However, loop statements are used to execute the set of instructions in a repeated order.
	 The execution of the set of instructions depends upon a particular condition.
	 
	 Types:
	 1. for loop
	 2. while loop
	 3. do-while loop
	 */

	public class ForLoops {
	/*
	 -->for_loop:
	 :	It enables us to initialize the loop variable, check the condition, and increment/decrement in a single line of code.
	  We use the for loop only when we exactly know the number of times, we want to execute the block of code.	:
	 
	  			>>>syntax
	  
				for(initialization, condition, increment/decrement) {    
							{ block of statements }    
				}    
	  
	 -->while_loop:
	 	The while loop is also used to iterate over the number of statements multiple times.
	 	However, if we don't know the number of iterations in advance, it is recommended to use a while loop.
	 	Unlike for loop, the initialization and increment/decrement doesn't take place inside the loop statement in while loop.
	    It is also known as the entry-controlled loop since the condition is checked at the start of the loop.
	    If the condition is true, then the loop body will be executed; otherwise, the statements after the loop will be executed.
	 			>>>Syntax
	 				
	 				while(condition){    
										{ looping statements }   
								}

	 -->do-while_loop
	 		The do-while loop checks the condition at the end of the loop after executing the loop statements.
	 		When the number of iteration is not known and we have to execute the loop at least once, we can use do-while loop.
			It is also known as the exit-controlled loop since the condition is not checked in advance.
	 				>>>Syntax
	 				
	 				do     
					{    
									{ statements }   
					} while (condition);  
	 
	 */
		public static void main(String[] args) {
			
			//for_loop
			int sum = 0;  
			for(int j = 1; j<=10; j++) {  
			sum = sum + j;  
			}  
			System.out.println("The sum of first 10 natural numbers is " + sum);  
			
			/*for-each_loop:
			 Java provides an enhanced for loop to traverse the data structures like array or collection.
			 In the for-each loop, we don't need to update the loop variable.
			 		>>>Syntax
					 		for(data_type variable : array_name/collection_name){    
										{ statements }   
							}
					 
			 */
			
			//for-each
			String[] names = {"Java","C","C++","Python","JavaScript"};  
			System.out.println("Printing the content of the array names:\n");    
			for(String name:names) {    
			System.out.println(name);    
			}   
			
			//while_loop
			int i = 0;    
			System.out.println("Printing the list of first 10 even numbers \n");    
			while(i<=10) {    
			System.out.println(i);    
			i = i + 2;    
			}
			
			//do_while_loop
			int j = 0;    
			System.out.println("Printing the list of first 10 even numbers \n");    
			do {    
			System.out.println(j);
			j = j + 2;    
			}while(j<=20);   
			
		}

	
}
