package learningJAvaThreads;

public class AvoidConcurrencyProblem extends Thread{
//To avoid concurrency problems, it is best to share as few attributes between threads as possible. If attributes need to be shared, one possible solution is to use the isAlive() method of the thread to check whether the thread has finished running before using any attributes that the thread can change.
//Use isAlive() method to avoid concurrency methods
	public static int amount = 0;
	public static void main(String[] args) {
		AvoidConcurrencyProblem thread1 = new AvoidConcurrencyProblem();
		thread1.start();
		//WAit for thread to finish
		while(thread1.isAlive()) {
			System.out.println("THread is currently exceuting");
		}
		System.out.println(amount);
		amount++;
		System.out.println(amount);


	}
	public void run() {
		amount++;
	}
	

	
}
