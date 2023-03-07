package exercise7;

import java.util.Collections;
import java.util.LinkedList;

public class BrowserHistoryLinkedList {
	LinkedList<String> history=new LinkedList<>();
	BrowserHistoryLinkedList(){
		history=new LinkedList<String>();
	}
	void visit(String url) {
		
		history.add(url);
    }
	
	void sort() {
		Collections.sort(history);
		for(String url:history) {
			System.out.println(url);
		}
	}
	
	void deleteHistory(int index) {
		history.remove(index);
	}
	
	void fetchHistory() {
		for(String url:history) {
			System.out.println(url);
		}
	}
	
	void search(String extension) {
		for(String url:history) {
			if(url.endsWith(extension)) {
				System.out.println(url);
			}
		}
	}
	
	int size() {
		return(history.size());
	}
	
	void updateHistory(int index,String url) {
		history.set(index, url);
	}	
	
}

