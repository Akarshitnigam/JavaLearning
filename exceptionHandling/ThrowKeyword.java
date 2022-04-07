package exceptionHandling;

public class ThrowKeyword {
	public static void valid(int i) {
		if(i<10) {
			throw new ArithmeticException("This is not a valid brother");
		}
		else {
			System.out.println("Welcome");
		}
		
	}
	
	public static void main(String[] args) {
		try {
			valid(1);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}