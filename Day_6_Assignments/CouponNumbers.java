package Day_6_Assignments;


/*
 * a. Desc -> Given N distinct Coupon Numbers, how many random numbers do you
need to generate a distinct coupon number? This program simulates this random
process.
b. I/P -> N Distinct Coupon Number
c. Logic -> repeatedly choose a random number and check whether it's a new one.
d. O/P -> total random number needed to have all distinct numbers.
e. Functions => Write Class Static Functions to generate random numbers and to
process distinct coupons.
 */
public class CouponNumbers {

		static int couponNumbers=0;
		static void luckyDraw() {
			int[] secretCoupon=new int[5];
			int couponNumber=0;
			do 
			{
				couponNumber=(int)(Math.random()*1000000);
			}
			while(couponNumber<=9999 || couponNumber>99999);
		
				System.out.print(":: Your Coupon number :: ");	
				for(int i = 4;i>=0;i--) 
				{
					secretCoupon[i]=couponNumber%10;
					couponNumber=couponNumber/10;
					System.out.print(secretCoupon[i]+" ");
				}System.out.println('\n');
				
		}
		public static void main(String[] args) {
			
			luckyDraw();
			if(45000<=couponNumbers && couponNumbers<=46500) 
			{
				System.out.println(":: CONGRATULATIONS YOU WON A BRIDGELABZ COUPON");
			}
			else 
			{
				System.out.println("BETTER LUCK NEXT TIME");
			}
		}
}
			
