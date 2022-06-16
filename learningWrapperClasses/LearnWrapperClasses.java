package learningWrapperClasses;

public class LearnWrapperClasses {

	public static void main(String[] args) {
		 	
		
		Integer myInt = 5;
		    Double myDouble = 5.99;
		    Character myChar = 'A';
//Since you're now working with objects, you can use certain methods to get information about the specific object.

//For example, the following methods are used to get the value associated with the corresponding wrapper object: intValue(), byteValue(), shortValue(), longValue(), floatValue(), doubleValue(), charValue(), booleanValue().

		    
		    
		    System.out.println(myInt + " "+ myInt.intValue());
		    System.out.println(myDouble.doubleValue());
		    System.out.println(myChar.charValue());
		    
		    //Another useful method is the toString() method, which is used to convert wrapper objects to strings.

		    //In the following example, we convert an Integer to a String, and use the length() method of the String class to output the length of the "string":
		    
		    //toString() method
		    Integer i1 = 1001;
		    String myString =  i1.toString();
		    System.out.println("string value is :"+ myString);
		    System.out.println("String length is "+myString.length());
		    
		    
		    
		    
	}
}
