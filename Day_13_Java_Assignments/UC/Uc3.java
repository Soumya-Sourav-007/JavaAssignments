package Day_13_Java_Assignments.UC;

public class Uc3<T extends Comparable<T>> {

    T numberOne, numberTwo, numberthree;

    public Uc3(T numberOne, T numberTwo, T numberthree) {
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
		 	System.out.println("Test_Case 1 :: " +  maxOfValues( "Peach","Apple", "Banana") + "\n");
		 	System.out.println("Test_Case 2 :: " +  maxOfValues("Apple", "Peach", "Banana") + "\n");
		 	System.out.println("Test_Case 3 :: " +  maxOfValues("Apple", "Banana", "Peach") + "\n");
		 	System.out.println("The maximum value between the three string is: " + maxOfValues("Apple", "Peach", "Banana"));
	    	
		}
}