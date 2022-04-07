package javaInnerClasses;
//An inner class can also be static, which means that you can access it without creating an object of the outer class:
public class Static_Inner_Class {

	  public static void main(String[] args) {
		    OuterClass1.InnerClass myInner = new OuterClass1.InnerClass();
		    System.out.println(myInner.y);
		
	  }
	
}
class OuterClass1 {
	  int x = 10;

	  static class InnerClass {
	    int y = 5;
	  }
}

