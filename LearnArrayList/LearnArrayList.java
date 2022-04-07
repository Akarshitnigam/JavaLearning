package LearnArrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
public class LearnArrayList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		//add()
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);
		
		//add()
		list.add(1,50);
		System.out.println(list);
		
		List<Integer> newList = new ArrayList<>();
		newList.add(130);
		newList.add(1387);
		
		//addAll()
		list.addAll(newList);
		System.out.println(list);
		
		//get()
		System.out.println(list.get(5));
		
		//set()
		list.set(2,40);
		System.out.println(list);
		
		//remove()
		list.remove(0);
		System.out.println(list);
		
		//remove()
		list.remove(Integer.valueOf(1387));
		System.out.println(list);
		
		//contains()
		System.out.println(list.contains(130));
		
		//clear()
		list.clear();
		System.out.println(list);
	
	
	    List<Integer> list1 = new ArrayList<>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		
		for(int i=0;i<list1.size();i++)
			System.out.println("element is :"+list1.get(i));
		
		//Iterator
		Iterator<Integer> it = list1.iterator();
		while(it.hasNext()) {
			System.out.println("iterator" +it.next());
		}
		
		
	
	}
}
