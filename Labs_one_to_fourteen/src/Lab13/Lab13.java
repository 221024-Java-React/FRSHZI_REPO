package Lab13;

public class Lab13 {

	public static void main (String [] args)
	{
		System.out.println(fizzBuzz(3));
		System.out.println(fizzBuzz(5));
		System.out.println(fizzBuzz(15));
		System.out.println(fizzBuzz(9));
		System.out.println(fizzBuzz(25));
		
	}
	public static String fizzBuzz (int N)
	{
		if(N%5==0 && N%3==0) return "FizzBuzz";
		if(N%3 ==0 ) return "Fizz";
		if(N%5 ==0)  return "Buzz";
		
		return ""+N;
	}
	
}
