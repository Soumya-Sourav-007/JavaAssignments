package LineAssignments;



/*
 * As a fan of geometry, I want to
compare two lines based on
the end points, So that I know
one line is equal, greater or
less than the other line. - Using Java compareTo method to compare 2 Lengths is
preferable.
 */
public class Uc3 {
	
public float lineLen(int x1, int y1,int x2,int y2) {
		
		float length= (float)(Math.sqrt( (Math. pow((x1-x2),2) + Math. pow((x1-x2),2)) ));
		
		return length;
	}
	
	public static void main(String[] args) {
		Uc3 len = new Uc3();
		
		int numb1 = (int)(Math.random()*10);
		int numb2 = (int)(Math.random()*10);
		int numb3 = (int)(Math.random()*10);
		int numb4 = (int)(Math.random()*10);
		int numb5 = (int)(Math.random()*10);
		int numb6 = (int)(Math.random()*10);
		int numb7 = (int)(Math.random()*10);
		int numb8 = (int)(Math.random()*10);
		
		String s1=Float.toString(len.lineLen(numb1, numb2, numb3, numb4));
		String s2=Float.toString(len.lineLen(numb5, numb6, numb7, numb8));
		System.out.println("Lenth of Line{1} with (x1,y1) & (x2,y2) Co-ordinates (cm):: "+s1);
		System.out.println("Lenth of Line{2} with (x3,y3) & (x4,y4) Co-ordinates (cm):: "+s2);
		System.out.println(s1.compareTo(s2)==0 ? " :: Lines Are Equal :: ":s1.compareTo(s2)>0 ?" :: Line{1} is greater than Line{2}  :: ":" :: Line{2} is greater than Line{1}  :: ");
	
	

}}
