package exceptionHandling;

public class FinallyBlock {
	public static void main(String[] args) {
		try {
			int i=100/0;
		}
		catch(Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("finally");
		}
	}
}
