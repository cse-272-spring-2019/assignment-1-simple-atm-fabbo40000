import java.lang.Math; 
public class Accounts{
	//private String Account; 
	public String FirstName; 
	public String LastName; 
	private double Balance=0.0;
	private String CardNumber;
	private int Password;
	
	public Accounts (String FirstName , String LastName  , double Balance , int Password ) {
		
		CardNumber=CardNumberGenerate();

	}
	public Accounts ()
	{
		CardNumber=CardNumberGenerate();
	}
	
	public String CardNumberGenerate() {
		String random  ; 
		
		 random =Integer.toString( (int) (Math.round(Math.random()*10000))); 
		 
		 /*had to type cast it and not use math.floor cause actually math. anything returns a double in OS but
		  * integer for users which is sad */

		return random ; 
	}
	
	public void Withdraw (double Amount ) {
		Balance =Balance - Amount ;
		
	}
	public double Deposit (double Amount) {
		Balance = Balance + Amount ; 
	return Balance; 
	} 
	
	public double BalanceCheck () {
		return Balance;
	}
	public String GetCardNumber () {
		
		return CardNumber;
	}
	
	
}

