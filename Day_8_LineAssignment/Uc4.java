package Day_8_LineAssignment;

/*
 * 
 * Use Java Object Oriented
Programming Concepts of Line
and Point as well as equals and
compareTo methods. - Using Java compareTo method to compare 2 Lengths is
preferable.
 */

public class Uc4 {
	
	
	float lineLen(int x1, int y1,int x2,int y2) {
		
		float length= (float)(Math.sqrt( (Math. pow((x1-x2),2) + Math. pow((x1-x2),2)) ));
		
		return length;
	}
	void checkLineEquality(float lengthOne,float lengthTwo)
	{
		String stringOne=Float.toString(lengthOne);
		String stringTwo=Float.toString(lengthTwo);
		System.out.println(stringOne.equals(stringTwo) ? " :: Lines Are Equal :: " : " Lines Are Not Equal ");
	}
	
	
	public static void main(String[] args) {
		Uc2 len = new Uc2();
		Uc2 len1 = new Uc2();
		int numb1 = (int)(Math.random()*100);
		int numb2 = (int)(Math.random()*100);
		int numb3 = (int)(Math.random()*100);
		int numb4 = (int)(Math.random()*100);
		int numb5 = (int)(Math.random()*100);
		int numb6 = (int)(Math.random()*100);
		int numb7 = (int)(Math.random()*100);
		int numb8 = (int)(Math.random()*100);
		
		float lengthOne =len.lineLen(numb1, numb2, numb3, numb4) ;
		float lengthTwo =len1.lineLen(numb5, numb6, numb7, numb8) ;
		
		System.out.println("Lenth of Line with (x1,y1) & (x2,y2) Co-ordinates (cm):: "+lengthOne);
		System.out.println("Lenth of Line with (x3,y3) & (x4,y4) Co-ordinates (cm):: "+lengthTwo);
		
		len.checkLineEquality(lengthOne, lengthTwo);

}}



