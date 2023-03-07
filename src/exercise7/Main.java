package exercise7;

public class Main {

	public static void main(String[] args) {
		BrowserHistoryArrayList browserHistoryArrayList=new BrowserHistoryArrayList();
		BrowserHistoryLinkedList browserHistoryLinkedList=new BrowserHistoryLinkedList();
		BrowserHistoryHashSet browserHistoryHashSet=new BrowserHistoryHashSet();
		BrowserHistoryLinkedHashSet browserHistoryLinkedHashSet=new BrowserHistoryLinkedHashSet();
		BrowserHistoryHashMap browserHistoryHashMap=new BrowserHistoryHashMap();
		BrowserHistoryHashTable browserHistoryHashTable=new BrowserHistoryHashTable();
		//ArrayList
		browserHistoryArrayList.visit("tw.com");
		browserHistoryArrayList.visit("fb.in");
		browserHistoryArrayList.visit("12345");
		browserHistoryArrayList.visit("google.com");
		browserHistoryArrayList.sort();
		browserHistoryArrayList.deleteHistory(0);
		browserHistoryArrayList.fetchHistory();
		browserHistoryArrayList.size();
		browserHistoryArrayList.search(".com");
		browserHistoryArrayList.updateHistory(1,"fb.org" );
		browserHistoryArrayList.fetchHistory();
		System.out.println("........................................................................");
		//LinkedList
		browserHistoryLinkedList.visit("tw.com");
		browserHistoryLinkedList.visit("fb.in");
		browserHistoryLinkedList.visit("google.com");	
		browserHistoryLinkedList.sort();
		browserHistoryLinkedList.deleteHistory(0);
		browserHistoryLinkedList.fetchHistory();
		browserHistoryLinkedList.size();
		browserHistoryLinkedList.search(".com");
		browserHistoryLinkedList.updateHistory(1,"fb.org" );
		browserHistoryLinkedList.fetchHistory();
		
		System.out.println("........................................................................");
		//HashSet
		browserHistoryHashSet.visit("tw.com");
		browserHistoryHashSet.visit("fb.in");
		browserHistoryHashSet.visit("google.com");	
		browserHistoryHashSet.sort();
		browserHistoryHashSet.deleteHistory("fb.in");
		browserHistoryHashSet.fetchHistory();
		browserHistoryHashSet.size();
		browserHistoryHashSet.search(".com");
		browserHistoryHashSet.updateHistory("tw.com","fb.org" );
		browserHistoryHashSet.fetchHistory();
		System.out.println("........................................................................");
		//LinkedHashSet
		browserHistoryLinkedHashSet.visit("tw.com");
		browserHistoryLinkedHashSet.visit("fb.in");
		browserHistoryLinkedHashSet.visit("google.com");	
		browserHistoryLinkedHashSet.sort();
		browserHistoryLinkedHashSet.deleteHistory("fb.in");
		browserHistoryLinkedHashSet.fetchHistory();
		browserHistoryLinkedHashSet.size();
		browserHistoryLinkedHashSet.search(".com");
		browserHistoryLinkedHashSet.updateHistory("tw.com","fb.org" );
		browserHistoryLinkedHashSet.fetchHistory();
		System.out.println("........................................................................");

		browserHistoryHashMap.visit("tw.com");
		browserHistoryHashMap.visit("fb.in");
		browserHistoryHashMap.visit("google.org");
		browserHistoryHashMap.visit("google.com");
		browserHistoryHashMap.visit("google.in");
		browserHistoryHashMap.fetchHistory(".in");
		browserHistoryHashMap.deleteHistory(".in");
		browserHistoryHashMap.search("goog");
		browserHistoryHashMap.size(".com");  
		System.out.println("........................................................................");
		//HashTable
		browserHistoryHashTable.visit("tw.com");
		browserHistoryHashTable.visit("fb.in");
		browserHistoryHashTable.visit("google.org");
		browserHistoryHashTable.visit("google.com");
		browserHistoryHashTable.visit("google.in");
		browserHistoryHashTable.fetchHistory(".in");
		browserHistoryHashTable.deleteHistory(".in");
		browserHistoryHashTable.search("oo");
		browserHistoryHashTable.size(".com");
		
		 
	}

}
