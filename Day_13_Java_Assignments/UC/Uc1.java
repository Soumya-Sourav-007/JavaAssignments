package Day_13_Java_Assignments.UC;

public class Uc1<T extends Comparable<T>> {

    T numberOne, numberTwo, numberthree;

    public Uc1(T numberOne, T numberTwo, T numberthree) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
        this.numberthree = numberthree;
    }

    public static <T extends Comparable <T>> T maxOfValues(T numberOne, T numberTwo, T numberthree) {
        T max = numberOne;
        if (numberTwo.compareTo(max) > 0) {
            max = numberTwo;
            }
        if (numberthree.compareTo(max) > 0) {
            max = numberthree;
            }
        return max;
    }

	public static void main(String[] args) {
		 	System.out.println("Welcome To Find Maximum Problem Using Generics \n");
		 	System.out.println("Test_Case 1 :: " +  maxOfValues(33,27,25) + "\n");
		 	System.out.println("Test_Case 2 :: " +  maxOfValues(23, 37, 25) + "\n");
		 	System.out.println("Test_Case 3 :: " +  maxOfValues(23,27, 35) + "\n");
	        System.out.println("The maximum value between the three integer is: " + maxOfValues(23, 29, 25) + "\n");
		}
}
