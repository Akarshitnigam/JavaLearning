package w3Schools;

 class staticClassInJava {

	private static String msg="GeeksForGeeks";
	public static class NestedStaticClass{
		public void printMessage() {
			System.out.println("Message from nested static class: "+msg);
		}
	}
	
	public class InnerClass{
		public void display() {
			System.out.println("Message from non-static nested class: "+msg);
		}
	}
}
