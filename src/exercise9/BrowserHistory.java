package exercise9;

import java.util.ArrayList;
import java.util.List;

 public class BrowserHistory extends Thread {
	List<String> history=new ArrayList<>();
	
	BrowserHistory(){
		history=new ArrayList<>();
	}
	
	void addHistory(String url) {
		history.add(url);
	}
	
	synchronized void  deleteHistory(int index)
	{
		history.remove(index);
	}
	
	synchronized void readHistory(int index){
		System.out.println(history.get(index));
	}

}
