package learnDeque;
import java.util.ArrayDeque;
public class LearnArrayDeque {

	public static void main(String[] args) {
		ArrayDeque<Integer> adq = new ArrayDeque<>();
		
		//offer()
		adq.offer(23);
		//offerFirst()
		adq.offerFirst(12);
		//offerLast()
		adq.offerLast(45);
		
		System.out.println(adq);
		
		//peek()
		System.out.println(adq.peek());
		
		//peekFirst()
		System.out.println(adq.peekFirst());
		
		//peekLast()
		System.out.println(adq.peekLast());
		
		System.out.println(adq);
		//poll()
		System.out.println(adq.poll());
		System.out.println(adq); 
		
		//pollFirst()
		System.out.println(adq.pollFirst());
		System.out.println(adq);
		
		
		//offer()
		adq.offer(46);
		adq.offerLast(47);
		
		System.out.println(adq);
		//pollLast()
		System.out.println(adq.pollLast());
		System.out.println(adq);
		
		//size()
		System.out.println(adq.size());
		
		
		
		
	}
	
	
}
