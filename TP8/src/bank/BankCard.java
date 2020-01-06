package bank;

public class BankCard extends Thread{
	BankAccount b;
	
	public BankCard(BankAccount b) {
		this.b = b;
	}

	public void run() {
		for (int i = 0; i < 100; i++) {
			b.withdraw(10);
		}
	}
}
