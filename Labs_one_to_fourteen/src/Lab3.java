
public class Lab3 {

	
	public static String replaceAllSpaces (String random)
	{
		return random.replace(" ", "-");
	}
	
	public static boolean containsWord (String one, String two)
	{
		return one.toLowerCase().contains(two.toLowerCase());
	}
	
	public static String[] splitPhoneNumber (String number)
	{
	return number.split("-");
	
	}
	
	public static void main (String[] args)
	{
		System.out.println(replaceAllSpaces("hello world hello "));
		
		System.out.println(containsWord("Hello world", "world"));
		
		for(String number :splitPhoneNumber("754-86545-6564"))	System.out.println(number);
	
	}
}
