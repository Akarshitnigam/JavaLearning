package learnSet;

import java.util.Set;
import java.util.LinkedHashSet;
public class LearnLinkedHashSet {
	public static void main(String[] args) {
		Set<Integer> set = new LinkedHashSet<>();
		
		//add()
		set.add(32);
		set.add(2);
		set.add(54);
		set.add(21);
		set.add(45);
		System.out.println(set);
		
		//remove()
		set.remove(54);
		System.out.println(set);
		
		//LinkedHashSet methods are same as HashSet methods
		//contains()
		System.out.println(set.contains(54));
		
		Set<Integer> set1 = new LinkedHashSet<>();
		
		System.out.println(set.equals(set1));
		set1.add(32);
		set1.add(2);
		//set.add(54);
		set1.add(21);
		set1.add(45);
		System.out.println(set1);
		System.out.println(set);
		//equals
		System.out.println(set.equals(set1));
		
		
	}
	
}
