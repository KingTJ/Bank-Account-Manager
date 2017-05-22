
public class BankAccounts {
	private String name;
	private double balance; 
	
	public BankAccounts(){
		name = null; 
		balance = 0; 
	}
	 
	public BankAccounts(String king, double userbalance) {
		name = king; 
		balance = userbalance; 
	}
	 
	public void deposit(double amount) {
		balance = balance + amount; 
	}
	
	public void withdraw(double amount) {
		balance = balance - amount; 
		if (balance < amount) {
			System.out.println("Insufficient funds, failed to withdraw \n");
			balance += amount; 
		}
	}
	
	public void getName(String blah) {
		blah = name; 
	}
	
	public void getBalance(double kin) {
		kin = balance; 
	}
	
	public String toString() {
		return(name + ", " +"$" + balance); 
	}
	
}
