package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
	 //   ArrayList<String> al = new ArrayList<String>();
		
		//add elements to arraylist
		
		al.add("dfghjkl");
		al.add(345);
		al.add('s');
		System.out.println(al);
		
		System.out.println(al.size());
		
		al.remove(2);
		//al.remove('s');
        System.out.println(al);
        al.add(2,45);
        System.out.println(al);
        
        System.out.println(al.get(2)); 
        
        //replace
        al.set(2,89);
        System.out.println(al);
        
        //search
        
        System.out.println(al.contains(89));
        
        System.out.println(al.isEmpty());
        
        
        
        //reading data
        
        // for loop
        
     /*   for(int i=0;i<al.size();i++) {
        	System.out.println(al.get(i));
        }
        */
        
        //for each loop
        
        for(Object e:al) {
        	System.out.println(e);
        }
        
        
       // Iterator
        
        Iterator it=al.iterator();
        while(it.hasNext()) {
        	System.out.println(it.next());
        
        }
        
        

	}

}
