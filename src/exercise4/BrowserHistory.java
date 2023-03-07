package exercise4;
import java.util.ArrayList;
import java.util.List;

public class BrowserHistory {
	List<String> history=new ArrayList<>();
	List<String> baseHistory=new ArrayList<>();
	String spacer="##" ;
	BrowserHistory(){
		history = new ArrayList<>();
		
	}
	
	void addHistory(String input) {
		int count=1;
		int arrayIndex=0;
		if(baseHistory.contains(input)) {
			for(String browser:baseHistory) {
				
				if(browser.equals(input)) {
					
					int index=input.length()+spacer.length();
					count=Integer.parseInt((history.get(arrayIndex)).substring(index))+1;
					
					history.set(arrayIndex,browser+spacer+count);
				}
				else {
				arrayIndex+=1;
			
				}
			}
			
		}
		else {
			history.add(input+spacer+count);
			baseHistory.add(input);
			
		}
		showHistory();
	}
	
	void showHistory() {
	
	
		for(String browser:history) {
			;
			System.out.println(browser);
		
		}
		
	
}
}

