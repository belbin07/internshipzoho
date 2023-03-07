package hack;

import java.util.ArrayList;
import java.util.List;

public class BrowserHistory {
	 List<String> updatedHistory=new ArrayList<>();
		
		BrowserHistory(){
			updatedHistory=new ArrayList<>();
		}
		
		void updateHistory(List<String> history,String urlInput) {
			if(history!=null) {
				for(String url:history) {
					updatedHistory.add(url);
				}
			}
			updatedHistory.add(urlInput);
		}
		void display() {
			System.out.println(updatedHistory);
		}

}
