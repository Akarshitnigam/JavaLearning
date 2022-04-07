package javaInnerClasses;

public class Java_Inner_Classes {
	 public static void main(String[] args) {
		    OuterClass3 myOuter = new OuterClass3();
		    OuterClass3.InnerClass myInner = myOuter.new InnerClass();
		    System.out.println(myInner.y );
		    System.out.println( myOuter.x);
	 }

}
class OuterClass3 {
	  int x = 10;
     
	  class InnerClass {
	    int y = 5;
	    
	  }

}