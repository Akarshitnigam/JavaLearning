package exceptionHandling;

public class LearningTryCatch {
	public static void main(String[] args) {
		try {
			int i=100/0;
		}
		catch(ArithmeticException e){
			System.out.println(e);
			System.out.println("----------------");
			e.printStackTrace();
			System.out.println("----------------");
			e.toString();
			System.out.println("------------------");
			e.getMessage();
		}
		finally {
		System.out.println("After try catch execution");
		}
		}
	
}
