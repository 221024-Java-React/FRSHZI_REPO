package Lab9;

public class Lab9 {

	/*public static void main (String args [] )
	{
		
		char[] characters = new char[] {};
		int [] bonuses = calculateBonuses(characters);
	
		for(int bonus: bonuses)
		{
			System.out.println(bonus);
		}
	}*/
	
	public int[] calculateBonuses(char[] toConvert) {
		
		int i =0;
		int[] bonuses = new int[toConvert.length];
		do
		{
			switch(toConvert[i])
			{
			case 'A': bonuses[i]=5000;break;
			case 'B': bonuses[i]=2500;break;
			case 'C': bonuses[i]=1000;break;
			case 'D': bonuses[i]=500;break;
			case 'F': bonuses[i]=0;break;
			default:  bonuses[i]= -1 ;break;
			}
			i++;
		}while(i<toConvert.length);
		
		return bonuses;
	}
}
