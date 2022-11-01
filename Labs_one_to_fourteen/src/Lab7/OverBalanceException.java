package Lab7;

public class OverBalanceException extends Exception {

	private static final long serialVersionUID = 1L;
    
    
	public OverBalanceException()
	{
		super("You don't have enough balance");
	}
	public OverBalanceException(String message)
	{
		 super(message);
		
	}
	
}
