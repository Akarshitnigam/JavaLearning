package learnMap;
import java.util.TreeMap;
import java.util.Map;
public class LearnTreeMap {

	 public static void main(String[] args) {
		  
		 
		 Map<String, Integer> numbers = new TreeMap<>();
		 numbers.put("One", 1);
		 numbers.put("Two", 2);
		 numbers.put("Three",3);
		 numbers.put("Four", 4);
		 numbers.put("Five", 5);
		 System.out.println(numbers);
		 
		 numbers.remove("Five");
		 System.out.println(numbers);
	 }
}
