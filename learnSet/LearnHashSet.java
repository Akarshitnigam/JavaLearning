package learnSet;
import java.util.Set;
import java.util.HashSet;
public class LearnHashSet {

	public static void main(String[] args) {
		
		Set<Integer> set1 = new HashSet<>();
		//add()
		set1.add(3);
		set1.add(32);
		set1.add(54);
		set1.add(21);
		set1.add(65);
		System.out.println(set1);
		
		//remove()
		set1.remove(54);
		System.out.println(set1);
		
		//contains()
		System.out.println(set1.contains(21));
		
		//isEmpty()
		System.out.println(set1.isEmpty());
		
		//size()
		System.out.println(set1.size());
		
		//clear()
		set1.clear();
		System.out.println(set1);
		
		
		
		//2nd example HashSet w3schoold
		HashSet<Integer> hS = new HashSet<Integer>();
		
		hS.add(101);
		hS.add(501);
		hS.add(1001);
		
		for(int i: hS) {
			System.out.println(i);
		}
		System.out.println(hS);
		hS.add(101);
		System.out.println(hS);
		if(hS.contains(10001)==false) {
			hS.add(10001);
		}
		System.out.println(hS);
		
		hS.remove(10001);
		System.out.println(hS);
		
		
		System.out.println("4th Example-------");
		// Create a HashSet object called numbers
	    HashSet<Integer> numbers = new HashSet<Integer>();

	    // Add values to the set
	    numbers.add(4);
	    numbers.add(7);
	    numbers.add(8);

	    // Show which numbers between 1 and 10 are in the set
	    for(int i = 1; i <= 10; i++) {
	      if(numbers.contains(i)) {
	        System.out.println(i + " was found in the set.");
	      } else {
	        System.out.println(i + " was not found in the set.");
	      }
	    }
	}
}
