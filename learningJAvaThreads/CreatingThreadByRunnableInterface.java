package learningJAvaThreads;

public class CreatingThreadByRunnableInterface implements Runnable{
//If the class implements the Runnable interface, the thread can be run by passing an instance of the class to a Thread object's constructor and then calling the thread's start() method
	
	 public static void main(String[] args) {
		 CreatingThreadByRunnableInterface  obj = new CreatingThreadByRunnableInterface ();
		 Thread thread = new Thread(obj);
		 thread.start();
		 System.out.println("This code is outside of the thread");
		  }
	 public void run() {
		    System.out.println("This code is running in a thread");
		  }
}
//Differences between "extending" and "implementing" Threads

//The major difference is that when a class extends the Thread class, you cannot extend any other class, but by implementing the Runnable interface, it is possible to extend from another class as well, like: class MyClass extends OtherClass implements Runnable.
