package learningEnums;

public class Enum_in_a_Switch_Statemen {
	public static void main(String[] args) {
		Level myVar = Level.HIGH;
		
		switch(myVar) {
		case LOW:
			System.out.println("LOW LEVEL");
			break;
		case MEDIUM:
			System.out.println("Medium level");
			break;
		case HIGH:
			System.out.println("HIgh level");
			break;
		}
		
	}
	
}
