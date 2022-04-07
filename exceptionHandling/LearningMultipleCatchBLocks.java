package exceptionHandling;

public class LearningMultipleCatchBLocks {

	public static void main(String[] args) {
		try {
			int i=100/0;
			
		}
		catch(ArithmeticException e1) {
			System.out.println(e1);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
}
