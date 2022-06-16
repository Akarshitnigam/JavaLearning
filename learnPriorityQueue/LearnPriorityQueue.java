package learnPriorityQueue;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Comparator;
public class LearnPriorityQueue {

	public static void main(String[] args) {
		Queue<Integer> pq = new PriorityQueue<>();
		
		//It implements min heap
		//offer()
		pq.offer(40);
		pq.offer(12);
		pq.offer(11);
		pq.offer(45);
		System.out.println(pq);
		//poll()
		pq.poll();
		System.out.println(pq);
		
		//peek()
		System.out.println(pq.peek());
		
		//If we want that peek() returns the maximum element then we can use
		Queue<Integer> pq2 = new PriorityQueue<>(Comparator.reverseOrder());
		//Comparator.reverseOrder() will convert minHeap to maxHeap()
		
		
		pq2.offer(23);
		pq2.offer(1);
		pq2.offer(36);
		System.out.println(pq2);
		
		//peek()
		System.out.println(pq2.peek());
		
		System.out.println(pq2);
		
		
		
		
		
		
	}
}
