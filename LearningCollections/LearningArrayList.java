package LearningCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LearningArrayList {

	public static void main(String[] args) {
		ArrayList arr = new ArrayList<>();
		arr.add("Arijit");
		//arr.add(100);
		arr.add("Papon");
		arr.add("Shreya");
		arr.add("Ankit");
		arr.add(true);
		arr.add(null);
		arr.add(100);
		//System.out.println(arr);
		for(var ele: arr)
			System.out.println(ele);
		arr.clear();
		System.out.println("ArrayList size is : "+arr.size());
		System.out.println(arr.isEmpty());
		
		System.out.println("-------------------------------------");
		ArrayList<Integer> al = new ArrayList<>();
		al.add(4);
		al.add(3);
		al.add(2);
		al.add(1);
		//Collections.sort()
		Collections.sort(al);
		//Collections.reverse()
		Collections.reverse(al);
		for(int ele: al)
			System.out.println(ele);
		ArrayList<Integer> al1 = new ArrayList<>();
		al1.add(34);
		al1.add(3);
		al1.add(45);
		System.out.println(al1);
		Collections.reverse(al1);

		System.out.println(al1);
		System.out.println("___________________________________");
		int[] arr2 = new int[5];
		arr2[0]=13;
		arr2[1]=56;
		arr2[2]=7;
		Arrays.sort(arr2);
		for(int ele: arr2)
			System.out.println(ele);
		System.out.println(arr2.length);
		
		
		
		System.out.println("______________________________________");
		//ArrayList
		ArrayList<Integer> arrIn = new ArrayList<Integer>();
		arrIn.add(23);
		arrIn.add(34);
		arrIn.add(21);
		
		System.out.println(arrIn);
		
		//get() in ArrayList
		System.out.println(arrIn.get(2));
	}
}
