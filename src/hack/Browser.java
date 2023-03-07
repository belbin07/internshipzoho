package hack;

import java.util.ArrayList;
import java.util.List;

public class Browser {
	 List<String> history=new ArrayList<>();
	
	Browser(){
		history=new ArrayList<>();
	}
	
	void addHistory(String url) {
		history.add(url);
	}
	
	
	
	void display() {
		System.out.println(history);
	}
	
			//System.out.println(history);
	
}
