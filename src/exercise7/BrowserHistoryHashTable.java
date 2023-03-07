package exercise7;

import java.util.ArrayList;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class BrowserHistoryHashTable {
	
	Hashtable<String, ArrayList<String> >history = new Hashtable<>();
	BrowserHistoryHashTable(){
		history=new Hashtable<String, ArrayList<String>>();
	}
	
	void visit(String url) {
		String[] splittingUrl=url.split("\\.");
		String extension=splittingUrl[1];
		
		if(history.containsKey(extension)) {
			ArrayList<String> list=history.get(extension);
			list.add(url);
			history.put(extension,list);
		}
		else {
			history.put(extension,new ArrayList<String>());
			ArrayList<String> list=history.get(extension);
			list.add(url);
			history.put(extension,list);
		}
	}
	
	void fetchHistory(String extension) {
		ArrayList<String> list=history.get(extension.substring(1));
		for(String url:list) {
			System.out.println(url);
		}
	}
	
	void deleteHistory(String extension) {
		history.remove(extension.substring(1));
	}
	void size(String extension) {
		ArrayList<String> list=history.get(extension.substring(1));
		System.out.println(list.size());
	}
	
	void search(String searchWord) {
		ArrayList<String> searchResult = new ArrayList<>();
		searchResult.clear();
		for(Map.Entry<String, ArrayList<String>> mapEntry : history.entrySet()) {
			ArrayList<String> urlList = mapEntry.getValue();
			
			for(String urlString : urlList) {
				if(urlString.contains(searchWord)) {
					searchResult.add(urlString);
				}
			}
		}
		System.out.println(searchResult.toString());
	}
}
