package Day_6_Array_Practice_Assgn;

import java.util.Scanner;

public class AddTwoMatrixUsingMultidimentionalArray {
	
	static void userInputAddition() {
		Scanner getUserInput = new Scanner(System.in);
				int[][] matrixArraySum = new int[2][2];
				int[][] matrixArrayOne=  new int[2][2];
				int[][] matrixArrayTwo=  new int[2][2];
		System.out.println("enter 1st array 2x2 matrix :: ");
				matrixArrayOne[0][0]=getUserInput.nextInt();
				matrixArrayOne[0][1]=getUserInput.nextInt();
				matrixArrayOne[1][0]=getUserInput.nextInt();
				matrixArrayOne[1][1]=getUserInput.nextInt();
		System.out.println("enter 2nd array 2x2 matrix :: ");
				matrixArrayTwo[0][0]=getUserInput.nextInt();
				matrixArrayTwo[0][1]=getUserInput.nextInt();
				matrixArrayTwo[1][0]=getUserInput.nextInt();
				matrixArrayTwo[1][1]=getUserInput.nextInt();
		
		System.out.println(":: matrixArraySum[2][2] :: ");
				for(int i=0;i<2;i++) {
					for(int j=0;j<2;j++) {			
						matrixArraySum[i][j]=matrixArrayOne[i][j]+matrixArrayTwo[i][j];
						System.out.print(matrixArraySum[i][j]+" ");
					}
					System.out.println("");
				}
	}
	public static void main(String[] args) {
		
		AddTwoMatrixUsingMultidimentionalArray.userInputAddition();
		System.out.println("");
		
		}
}
