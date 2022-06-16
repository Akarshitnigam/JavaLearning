package learnMap;
import java.util.Map;
import java.util.HashMap;
public class LearnHashMap {

	public static void main(String[] args) {
		Map<String,Integer> numbers = new HashMap<>();
		//put()
		numbers.put("Three",3);
		numbers.put("One", 1);
		numbers.put("Two", 2);
		
		System.out.println(numbers);
		
		numbers.put("Three", 23);
		System.out.println(numbers);
		
		numbers.putIfAbsent("One", 1111);
		numbers.putIfAbsent("Four", 4);
		System.out.println(numbers);
		
		//Map.Entry<String,Integer> e 
		for(Map.Entry<String, Integer> e: numbers.entrySet()) {
			System.out.println(e);
		}
		for(Map.Entry<String, Integer> e : numbers.entrySet()) {
			System.out.println(e.getKey());
		}
		for(Map.Entry<String, Integer> e: numbers.entrySet()) {
			System.out.println(e.getValue());
		}
		
		for(String keys:numbers.keySet())
			System.out.println(keys);
		
		for(Integer values:numbers.values())
			System.out.println(values);
		
		//containsValue()
		//containsKey()
		System.out.println(numbers.containsValue(23));
		System.out.println(numbers.containsKey("One"));
		
		//isEmpty()
		System.out.println(numbers.isEmpty());
		
		
		//new example from w3 schools
		HashMap<String, Integer> countriesRanking = new HashMap<String, Integer>();
		countriesRanking.put("USA", 1);
		countriesRanking.put("Australia", 2);
		countriesRanking.put("Japan", 3);
		countriesRanking.put("India", 4);
		
		for(String s: countriesRanking.keySet()) {
			System.out.println(s);
		}
		
		for(int i: countriesRanking.values()) {
			System.out.println(i);
			
		}
		
		for(String kS: countriesRanking.keySet()) {
			System.out.println(countriesRanking.get(kS));
		}
		
		//3rd Examples
		 HashMap<String, Integer> people = new HashMap<String, Integer>();


		    // Add keys and values (Name, Age)
		    people.put("John", 32);
		    people.put("Steve", 30);
		    people.put("Angie", 33);

		    for (String i : people.keySet()) {
		      System.out.println("key: " + i + " value: " + people.get(i));
		    }
	}
}
