package exercise7;



import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class BrowserHistoryLinkedHashSet {
	Set<String> history=new LinkedHashSet<>();
	BrowserHistoryLinkedHashSet(){
		history=new LinkedHashSet<String>();
	}
	void visit(String url) {
		
		history.add(url);
    }
	
	void sort() {
		
		TreeSet<String> temperoryHistory = new TreeSet<String>(history);
		for(String url:temperoryHistory) {
			System.out.println(url);
		}
		
	}
	
	void deleteHistory(String url) {
		history.remove(url);
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
	
	void size() {
		System.out.println(history.size());
	}
	
	void updateHistory(String existingUrl,String newUrl) {
		history.remove(existingUrl);
		history.add(newUrl);
	}
}
