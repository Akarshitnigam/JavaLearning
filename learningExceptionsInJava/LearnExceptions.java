package learningExceptionsInJava;

public class LearnExceptions {

	 static void checkAge(int age) {
		    if (age < 18) {
		    	throw new ArithmeticException("Access denied - You must be at least 18 years old.");
		    }
		    else {
		      System.out.println("Access granted - You are old enough!");
		    }
	  }
	 
	 public static void main(String[] args) {
		 
		 try {
			 int[] arr = new int[10];
			 arr[13] = 56;
			 
			 
		 }
		 catch(Exception e) {
			 
			 System.out.println("there's something wrong here");
			 		
		 }
		 checkAge(13);
	 }
}
