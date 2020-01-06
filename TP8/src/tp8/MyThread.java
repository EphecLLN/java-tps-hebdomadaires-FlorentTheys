package tp8;

public class MyThread extends Thread {
	
	private Thread other;
	
	public MyThread(String nom) {
		super(nom);
	}


	public void setOther(Thread o) {
		this.other = o;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(this.getName() + this.getState());
			System.out.println("this nom= " + this.getName() +  " - this etat= " + this.getState() + " other nom= " + other.getName() + " - other etat = " 
					+ other.getState());
		}
	}
	public static void main(String[] args) {
		MyThread threadA = new MyThread("threadA");
		MyThread threadB = new MyThread("threadB");
		threadA.setOther(threadB);
		threadB.setOther(threadA);
		System.out.println("etat threadA = " + threadA.getState() + "\n etat threadB = " + threadB.getState());
		threadA.start();
		threadB.start();
		System.out.println("etat threadA = " + threadA.getState() + "\n etat threadB = " + threadB.getState());
	}
}
