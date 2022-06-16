package learningJAvaThreads;

public class CreatingThreadByExtendingTheThreadClass extends Thread{

	public void run() {
		System.out.println("This code is runnig in a thread");
	}
	public static void main(String[] args) {
		CreatingThreadByExtendingTheThreadClass n = new CreatingThreadByExtendingTheThreadClass();
		n.start();
		
	}
}
