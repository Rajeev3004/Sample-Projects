package queue;

import java.util.PriorityQueue;

public class PriorityQueueEx 
{
	public static void main(String[] args) {
		PriorityQueue pq=new PriorityQueue();
		pq.add(10);
		pq.add(18);
		pq.add(5);
		pq.add(20);	
		pq.add("hello");
		pq.add(15);
		pq.offer(17);
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq.peek());
		
	}

}
