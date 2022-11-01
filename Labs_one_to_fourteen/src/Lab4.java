
public class Lab4 {


	

	
	
	
	public static void main (String[] args)
	{
		int [] numbers = new int[100];
		int index = 0;
		int oddSum = 0 ;
		int evenSum  = 0;
		
		for(int i =0; i<numbers.length; i++)
		{
			numbers[i]= i+1;
		}
		while(index <100)
		{
			if(numbers[index]%2 ==0) evenSum+=numbers[index];
			else if(numbers[index]%2 !=0) oddSum+=numbers[index];
			index++;
		}
		System.out.println("sum of odds "+oddSum);
		System.out.println("sum of evens "+evenSum);
	}
}
