package Day_6_Array_Practice_Assgn;

import java.util.Scanner;

public class FindDuplicateInArray {
	
        public static void main(String[] args) {
			
        	System.out.println("Counting the frequency of each element in an array");
    		Scanner scanner=new Scanner(System.in);
    		System.out.println("Enter the number of elements you want :: ");
    		int n=scanner.nextInt();
    		int[] array=new int[n];
    		
    		for (int i=0;i<n;i++)//for input
    		{
    			System.out.println("Enter "+ ((i+1)) + "element ");
    			array[i]=scanner.nextInt();
    		}
    		System.out.println("The array elements entered ::");
    		for (int i=0;i<array.length;i++)//for printing
    		{
    			System.out.print(array[i] + " ");
    		}
    		System.out.println();
        	byte[] freq = new byte[array.length] ;
    		byte visited=-1; //will be use to recognize elements being visited before
    		
    		for (byte i=0;i<array.length;i++)
    		{
    			byte count=1;
    			for(byte j=(byte)(i+1);j<array.length;j++) 
    			{
    				if(array[i]==array[j]) 
    				{
    					count++;
    					freq[j]=visited;//duplication limiter
    				}
    			}
    			//if element not visited then,
    				if(freq[i]!=visited)
    				{
    				freq[i]=count;
    				}
    		}
    		System.out.println(" : Element  ::::  Frequency :");
    		for(byte z=0;z<freq.length;z++) {
    			if(freq[z]!=visited) {
    				if(freq[z]>1) {
    				System.out.println("       "+array[z]+"     ::      "+freq[z]);
    				}
    			}
    		
    		}
        }
}
