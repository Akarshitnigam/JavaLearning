package learningEnums;

public class Enum_inside_a_Class {

	enum Level{
		LOW,
		HIGH,
		MEdium
		
	}
	
	public static void main(String[] args) {
		Level myvar = Level.MEdium;
		System.out.println(myvar);
	}
}


/*
You can also have an enum inside a class:
*/