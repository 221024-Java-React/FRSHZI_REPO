package Lab12;

public class DuplicatetException extends Exception {

	private static final long serialVersionUID = 1L;
	String field= "";
	
	
	public DuplicatetException(String field)
	{
		super(field+" already exist");
		this.field= field;
	}
	
	public void message()
	{
		System.out.println(field+" already exist");
	}
	
}
