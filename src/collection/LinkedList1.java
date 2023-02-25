package collection;

import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		LinkedList<String> lk=new LinkedList<>();
		
		lk.add("wert");
		lk.add("welcome");
		lk.add("sdft");
		lk.add("dfgh");
	//	lk.add(2);
		
		
		//specific methods
		
		
		lk.addFirst("sdfghyvv");
		lk.addLast("dewa");
		
		System.out.println(lk);
		System.out.println(lk.getFirst());
		lk.removeFirst();
		System.out.println(lk);

	}

}