package LineAssignments;

public class Uc1 {
	
/*
 * As a fan of geometry, I want to
model a line based on a point
consisting of (x, y) co

-ordinates
using the Cartesian system,
So that I can calculate its
length
.

- A Length as 2 Points (x1, y1) and (x2, y2) - Length of a Line = sqrt( (x2 - x1) ^ 2 + (y2

- y1) ^ 2)
 */
	
	public float lineLen(int x1, int y1,int x2,int y2) {
		
		float length= (float)(Math.sqrt( (Math. pow((x1-x2),2) + Math. pow((x1-x2),2)) ));
		
		return length;
	}
	
	public static void main(String[] args) {
		Uc1 len = new Uc1();
		int numb1 = (int)(Math.random()*100);
		int numb2 = (int)(Math.random()*100);
		int numb3 = (int)(Math.random()*100);
		int numb4 = (int)(Math.random()*100);
		System.out.println("Lenth of Line with (x1,y1) & (x2,y2) Co-ordinates (cm):: "+len.lineLen(numb1, numb2, numb3, numb4));

	}

}
