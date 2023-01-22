package Day_6_Array_Practice_Assgn;


//Java Program to convert char Array to String
public class ConvertChrArrayToString {
	
	public static void main(String[] args) {
		
		char[] ch = {'a','b','c','d'};
		
		String str = new String(ch);//1st method
		System.out.println(ch);
		
		
		 String str2 = String.valueOf(ch);//second method
	     System.out.println(str2);
	     
	}
}
