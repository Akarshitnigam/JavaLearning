package exceptionHandling;
class myException extends Exception{
	myException(){
		System.out.println("WE ae into myException class' constructor");
	}
	@Override
	public String toString() {
		return "Radius cannot be negative";
	}
	
	@Override
	public String getMessage() {
		return "Radius getMEssage()";
	}
	public String myExceptionMethod() {
		return "This is my Exception method";
	}
	public int myFavouriteNumber() {
		return 10000;
	}
}
public class ThrowsKeyword{
	 static double areaOfCircle(int r) throws myException{
		if(r<0) {
			throw new myException();
		}
		double ar = Math.PI * r * r;
		return ar;
		
		
	}
	public static void main(String[] args) {
		try {
			double area = areaOfCircle(-10);
			System.out.println(area);
		}catch(myException e) {
			System.out.println("toString "+e.toString());
			System.out.println(e);
			System.out.println("getMEssage()" + e.getMessage());
			System.out.println("My EXception method "+e.myExceptionMethod());
			System.out.println(e.myFavouriteNumber());
		}
	}
}