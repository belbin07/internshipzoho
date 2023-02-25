package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Arraylist2 {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		
		ArrayList<Integer> ali=new ArrayList<Integer>();
		
		ali.addAll(al);
		System.out.println(ali);
		
		//shuffle
		
		Collections.shuffle(ali);
		System.out.println(ali);
		
		//sort
		
		Collections.sort(ali);
		System.out.println(ali);
		
		//reverse
		Collections.reverse(ali);
		System.out.println(ali);
		
		
		//convert array  to arraylist
		
		String arr[]= {"asd","df","dfty7"};
		ArrayList als=new ArrayList(Arrays.asList(arr));
		System.out.println(als);
		
		
	}
}
