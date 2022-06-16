package LearnQueue;
import java.util.LinkedList;
import java.util.Queue;
public class LearnQueue {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		
		//offer()
		queue.offer(12);
		queue.offer(24);
		queue.offer(36);
		System.out.println(queue);
		
		//poll()
		queue.poll();
		
		System.out.println(queue);
		
		//peek()
		System.out.println(queue.peek());
	
	}
	
}
