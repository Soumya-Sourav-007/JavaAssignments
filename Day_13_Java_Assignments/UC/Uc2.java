package Day_13_Java_Assignments.UC;

public class Uc2<T extends Comparable<T>> {

    T numberOne, numberTwo, numberthree;

    public Uc2(T numberOne, T numberTwo, T numberthree) {
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
			System.out.println("Test_Case 1 :: " +  maxOfValues(33.5f,27.5f,25.5f) + "\n");
		 	System.out.println("Test_Case 2 :: " +  maxOfValues(23.5f, 37.5f, 25.5f) + "\n");
		 	System.out.println("Test_Case 3 :: " +  maxOfValues(23.5f,27.5f, 35.5f) + "\n");
	        System.out.println("The maximum value between the three float is: " + maxOfValues(23.5f, 27.5f, 25.5f) + "\n");
		}
}