package Lab14 ;

public class Lab14 {

	
	public static void main (String [] args)
	{
		System.out.println(twoKidsAndATruck(3,4,5));
		System.out.println(twoKidsAndATruck(3,4,1));
		System.out.println(twoKidsAndATruck(4,2, 3));
		System.out.println(twoKidsAndATruck(5,8,11));
	}
	
	public static String twoKidsAndATruck(int k1Position, int k2Position, int tPosition)
	{
		int k1Units = Math.abs(k1Position - tPosition);
		int k2Units = Math.abs(k2Position - tPosition);
		
		if(k1Units< k2Units) return "kid1";
		if(k1Units > k2Units) return "kid2";
		else return "truck";
		
	}
}
