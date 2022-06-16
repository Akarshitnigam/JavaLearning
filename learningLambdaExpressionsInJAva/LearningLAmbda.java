package learningLambdaExpressionsInJAva;

import java.util.ArrayList;

public class LearningLAmbda {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(5);
		numbers.add(9);
		numbers.add(8);
		numbers.forEach( (element) -> {
			System.out.println(element+100);
			});
		
		
	}
}
