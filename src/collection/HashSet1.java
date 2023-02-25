package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {
      public static void main(String[] args){
    	 /* 
    	  HashSet hs =new HashSet(100,(float)0.9);
    	  
    	  hs.add("welcome");
    	  hs.add(22);
    	  hs.add(null);
    	  hs.add('d');
    	  
    	  System.out.println(hs);
    	  
    	  hs.remove('d');
    	  System.out.println(hs);
    	  System.out.println(hs.contains(null));
    	  System.out.println(hs.isEmpty());
    	  
    	  //reading
    	  
    	  for(Object ob:hs) {
    		  System.out.println(ob);
    	  }
    	  
    	  Iterator it=hs.iterator();
    	  
    	  
    	  while(it.hasNext()) {
    		  System.out.println(it.next());
    		
    	  }*/
    	  
    	  
    	  //union intersection and difference
    	  
    	  HashSet<Integer> hs =new HashSet<Integer>();
    	  hs.add(1);
    	  hs.add(2);
    	  hs.add(3);
    	  hs.add(4);
    	  hs.add(5);
    	  
    	  HashSet<Integer> hs2 =new HashSet<Integer>();
    	  hs2.add(3);
    	  hs2.add(4);
    	  hs2.add(5);
    	  hs2.add(6);
    	  hs2.add(7);
    	  hs2.add(8);
    	  System.out.println(hs);
    	  System.out.println(hs2); 
    	  
    	  //union
    	//  hs.addAll(hs2);
    	 // System.out.println(hs);
    	  
    	  //intersection
    	 
    	//  hs.retainAll(hs2);
    	  
    	 // System.out.println(hs);
    	  
    	  //subset
    	  
    	  System.out.println(hs.containsAll(hs2));
    	  
      }
      
      
}
