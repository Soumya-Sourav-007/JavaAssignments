package Day_16_17_Java_Assignments;

/*
7. Take a range of 0 - 1000 Numbers and find the Prime numbers in that range. 
*/
class Primes{
	static int primeCount = 0;
	static void primeNumber(int number) {
		int count = 0;
		for(int i = 1;i <= number; i++) {
			if(number%i == 0 ) {
				count++;
			}
		}if (count == 2) {
			System.out.println("Prime number :: " + number);
			primeCount++;
		}
		
	}
}

public class FindPrimeNumbers extends Primes {

	int getArray(int range) {
		int number = 0;
		int[] arr = new int[range];
		for(int i = 1;i <= arr.length ; i++) {
			arr[i-1] = i;
			primeNumber(arr[i-1]);
		}
		return number;
	}

	public static void main(String[] args) {
		
		FindPrimeNumbers primeObj = new FindPrimeNumbers();
		int range = 1000;
		primeObj.getArray(range);
		
		System.out.println("Number of Primes between 0 and "+ range +" :: "+primeCount);
		
	}

}