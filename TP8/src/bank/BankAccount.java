package bank;

public class BankAccount {

	private double solde;
	
	public BankAccount(double solde) {
		this.solde = solde;
	}
	
	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public synchronized void deposit(double amount) {
		this.solde += amount;
	}
	
	public synchronized void withdraw(double amount) {
		this.solde -= amount;
	}
	
	public synchronized double getAmount() {
		return this.solde;
	}
}
