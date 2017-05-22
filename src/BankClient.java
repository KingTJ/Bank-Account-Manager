
public class BankClient {
public static void main(String [] args){
		
		BankAccounts B1 = new BankAccounts("John", 1000);
		B1.deposit(500);
		System.out.println(B1 + "\n");
		B1.withdraw(300); 
		System.out.println(B1 + "\n");
		B1.withdraw(1500);
		System.out.println(B1 + "\n"); 
		

	}
}
