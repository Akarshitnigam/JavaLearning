package javaInnerClasses;
//One advantage of inner classes, is that they can access attributes and methods of the outer class:
public class Access_Outer_Class_From_Inner_Class {

	public static void main(String[] args) {
	    OuterClass myOuter = new OuterClass();
	    OuterClass.InnerClass myInner = myOuter.new InnerClass();
	    System.out.println(myInner.myInnerMethod());
	  }
}
class OuterClass {
	  int x = 10;

	  class InnerClass {
	    public int myInnerMethod() {
	      return x;
	    }
	  }
}
