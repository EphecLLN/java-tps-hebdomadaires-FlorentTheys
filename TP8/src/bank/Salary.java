package bank;

public class Salary extends Thread {
	private BankAccount a;
	
	public Salary(BankAccount a) {
		this.a = a;
	}

	public void run() {
		for (int i = 0; i < 100; i++) {
			a.deposit(10);
		}
	}
}
