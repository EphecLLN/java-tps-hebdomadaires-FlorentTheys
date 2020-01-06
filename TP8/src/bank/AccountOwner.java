package bank;

public class AccountOwner {

	public static void main(String[] args) {
		BankAccount compte1 = new BankAccount(0);
		Salary salaire1 = new Salary(compte1);
		BankCard debit1 = new BankCard(compte1);		
		salaire1.start();	
		debit1.start();
		System.out.println(compte1.getAmount());	
	}
}
