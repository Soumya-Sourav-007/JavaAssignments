package Day_16_17_Java_Assignments;

import java.util.Arrays;

public class InsertionSort {

	public static void insertionSort(Comparable[] objArray) {
		// insertion sort starts from second element
		for (int i = 1; i < objArray.length; i++) {
			Comparable objectToSort = objArray[i];
			int j = i;
			while (j > 0 && objArray[j - 1].compareTo(objectToSort) > 1) {
				objArray[j] = objArray[j - 1];
				j--;
			 }
			objArray[j] = objectToSort; 
			}
		}

	public static void main(String[] args) {
		
		String[] cities = {"London", "Paris", "Tokyo", "NewYork", "Chicago"};
		System.out.println("String array before sorting : " + Arrays.toString(cities));
		
		insertionSort(cities);
		System.out.println("String array after sorting : " + Arrays.toString(cities));
	
	}
}
