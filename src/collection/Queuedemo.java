package collection;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class Queuedemo {

	public static void main(String[] args) {
		PriorityQueue pq=new PriorityQueue();
		
		//LinkedList pq=new LinkedList();
		
		pq.add("a");
		pq.add("d");
		pq.offer("s");
		
		System.out.println(pq);
		
	System.out.println(pq.element());
	System.out.println(pq.peek());
		
		System.out.println(pq.remove());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		
		

	}

}
