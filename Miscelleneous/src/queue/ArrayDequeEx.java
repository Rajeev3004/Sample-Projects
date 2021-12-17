package queue;

import java.util.ArrayDeque;

public class ArrayDequeEx 
{
	public static void main(String[] args) {
		ArrayDeque deq=new ArrayDeque();
		deq.push(10);
		deq.push(5);
		deq.offer(20);
		deq.push(15);
		System.out.println(deq);
		System.out.println(deq.pop());
	}

}
