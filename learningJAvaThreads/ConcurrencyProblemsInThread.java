package learningJAvaThreads;

public class ConcurrencyProblemsInThread extends Thread{
//Because threads run at the same time as other parts of the program, there is no way to know in which order the code will run. When the threads and main program are reading and writing the same variables, the values are unpredictable. The problems that result from this are called concurrency problems.
	
	
	
	
	
	 public static int amount = 0;

	  public static void main(String[] args) {
	    ConcurrencyProblemsInThread thread = new ConcurrencyProblemsInThread();
	    thread.start();
	    System.out.println(amount);
	    amount++;
	    System.out.println(amount);
	  }

	  public void run() {
	    amount++;
	  }
	
	
	
	
}
