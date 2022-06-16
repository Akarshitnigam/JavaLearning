package learnSet;
import java.util.Set;
import java.util.TreeSet;
public class LearnTreeSet {
	public static void main(String[] args) {
		//TreeSet store values in sorted form
		Set<Integer> set = new TreeSet<>();
		// add()
		set.add(32);
		set.add(2);
		set.add(54);
		set.add(21);
		set.add(65);
		set.add(2);
		System.out.println(set);
		
		//TreeSet operations are O(log n)
		//HashSet is  highly optimized with O(1);
		
		Set<String> st = new TreeSet<>();
		st.add("India");
		st.add("USA");
		st.add("Japan");
		st.add("UK");
		st.add("USA");
		System.out.println(st);
		
		
		
		
		
	}
}
