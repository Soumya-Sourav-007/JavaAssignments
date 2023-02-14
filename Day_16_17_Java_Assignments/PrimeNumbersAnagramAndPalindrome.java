package Day_16_17_Java_Assignments;

class PrimesTwo{
	
	static int primeCountTwo = 0;
	
	static boolean isPalindromeAnagramAndPrime(int number) {
		int store = number, rev = 0, reserve = 0;
		boolean getBoolean = false;
		while(number != 0) {
			reserve = number;
			rev = rev*10 + number%10;
			number = number/10;
		}
			if(primeNumber(rev)) {
				if(store == rev) {
				getBoolean = true;
			}
			
		}
		return getBoolean;
	}
	
	static boolean primeNumber(int number) {
		int count = 0;
		boolean getBoolean = false;
		for(int i = 1;i <= number; i++) {
			if(number%i == 0 ) {
				count++;
			}
			}if (count == 2) {
				getBoolean = true;
				primeCountTwo++;
		}
			return getBoolean;
	}
	
	
}

public class PrimeNumbersAnagramAndPalindrome extends PrimesTwo {

	int getArray(int range) {
		int number = 0;
		int[] arr = new int[range];
		for(int i = 1;i <= arr.length ; i++) {
			arr[i-1] = i;
				if(primeNumber(arr[i-1])) {
					if(isPalindromeAnagramAndPrime(arr[i-1])) {
					System.out.println("Number :: "+arr[i-1]);
			}}
		}
		return number;
	}

	public static void main(String[] args) {
		
		PrimeNumbersAnagramAndPalindrome primeObj = new PrimeNumbersAnagramAndPalindrome();
		int range = 1000;
		primeObj.getArray(range);
		
		System.out.println("Number of Primes between 0 and "+ range +" :: "+ primeCountTwo);
		
	}

}
