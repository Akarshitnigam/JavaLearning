package learnIteratorCOllectionsClass;
import java.util.ArrayList;
import java.util.Iterator;
public class LearnIterators {
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(101);
		al.add(501);
		al.add(1001);
		
		
		//make the iterator
		Iterator<Integer> it = al.iterator();

		while(it.hasNext()) {
			System.out.println( it.next());
		}
		
		
		//Iterators are designed to easily change the collections that they loop through. The remove() method can remove items from a collection while looping.
		
		//Example 2
		
		//Use an iterator to remove numbers less than 10 from a collection:
		
		
		
		
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(1864013004);
		al2.add(1090783);
		al2.add(1408550);
		al2.add(2);
		al2.add(3);
		al2.add(5);
		al2.add(7);
		System.out.println(al2);
		Iterator<Integer> it2 =  al2.iterator();
		while(it2.hasNext()) {
			if(it2.next()<10) {
				it2.remove();
			}
		}
		System.out.println(al2);

		
		//fourth example
		ArrayList<Integer> numbers = new ArrayList<Integer>();
	    numbers.add(12);
	    numbers.add(8);
	    numbers.add(2);
	    numbers.add(23);
	    Iterator<Integer> it4 = numbers.iterator();
	    while(it4.hasNext()) {
	      Integer i = it4.next();
	      if(i < 10) {
	        it4.remove();
	      }
	    }
	    System.out.println(numbers);
	}

}
