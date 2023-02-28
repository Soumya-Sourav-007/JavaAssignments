package Day_23_Java_Assignments.moodanalyzer.main;

import java.util.Scanner;


import Day_23_Java_Assignments.moodanalyzer.interfaces.IMathFunction;
import Day_23_Java_Assignments.moodanalyzer.interfaces.IMessageDisplay;

public class MathsOperationApp {

	private static Scanner getInput = new Scanner(System.in);
	
	public static void main(String[] args) {

		IMathFunction add = (a,b)-> a+b;
		IMathFunction substract = (a,b)-> a-b;
		IMathFunction multiply = (a,b)-> a*b;
		IMathFunction divide = (a,b)-> a/b;
		IMessageDisplay displayMessage = ()-> System.out.println(" :: Welcome to MathsOperationApp :: ");
		
		
		displayMessage.welcomeDisplay();
		byte option =0;
		do {
			System.out.println("Press 1: Addition--" + '\n' +"Press 2: Substraction--" + '\n' +"Press 3: Multiplication--" + '\n' +"Press 4: Division--");
			System.out.println("Enter option :: ");
			switch(getInput.nextByte()) {
			case 1:
				System.out.println("Enter numbers to add :: ");
				System.out.println(add.getCalculation(getInput.nextDouble(), getInput.nextDouble()));
				break;
			case 2:
				System.out.println("Enter numbers to substract :: ");
				System.out.println(substract.getCalculation(getInput.nextDouble(), getInput.nextDouble()));
				break;
			case 3:
				System.out.println("Enter numbers to multiply :: ");
				System.out.println(multiply.getCalculation(getInput.nextDouble(), getInput.nextDouble()));
				break;
			case 4:
				System.out.println("Enter numbers to divide :: ");
				System.out.println(divide.getCalculation(getInput.nextDouble(), getInput.nextDouble()));
				break;
			default:
				System.err.println("Invalid Input....");
			}
				System.out.println("Press 1: To see Menu Again--" + '\n' + "Press 0: To Exit--");
				option = getInput.nextByte();
		}while(option == 1);
	

	}

}