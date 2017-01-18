
public class Account {

	private String name; 
	private double balance;
	
	//constructor initializes name with parameter of name
	public Account(String name, double balance) {
		this.name = name;
		if(balance > 0.0)
			this.balance = balance;
	}
	
	//account deposits(adds) only a valid amount to the balance
	public void deposit(double depositAmount){
		if(depositAmount > 0.0)
			balance = balance + depositAmount;
	}
	
	
	//method returns the balance
	public double getBalance(){
		return balance;
	}
	
	//method to set the name
	public void setName(String name) {
		this.name = name;
	}
	
	//method to get the name
	public String getName() {
		return name;
	}
}
