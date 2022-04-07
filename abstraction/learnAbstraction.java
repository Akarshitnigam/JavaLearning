package abstraction;



abstract class Animal {
	//Abstract method (does not have a body)
	public abstract void animalSound();
	//Regular method
	public void sleep() {
	System.out.println("Zzz");
	}

}


class Pig extends Animal {

	public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("The pig says: wee wee");
    }


}






public class learnAbstraction {

	public static void main(String[] args) {
		 Pig myPig = new Pig(); // Create a Pig object
		 myPig.animalSound();
		 myPig.sleep();
		}	
	
	
}
/*
Why And When To Use Abstract Classes and Methods?
To achieve security - hide certain details and only show the important details of an object.
*/