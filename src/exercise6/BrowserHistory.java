package exercise6;

import java.util.ArrayList;
import java.util.List;



public class BrowserHistory {
	
	
	 static List<String> history=new ArrayList<>();
	 static int currentIndex=-1;
	BrowserHistory(){
		history =new ArrayList<>();
		 
	}
	
	void visit(String url) throws InvalidURLException{
		
        if(url.endsWith(".com")||url.endsWith(".org")||url.endsWith(".in"))
            history.add(url);
        else
        	throw new InvalidURLException();
    }
	
	
	
	static String forward(String stepsInput) throws NoHistoryFoundException {
		int steps =Integer.parseInt(stepsInput);
		if(currentIndex==-1) {
			currentIndex=history.size()-1;
		}
		
		if(currentIndex+steps>history.size()-1) {
			throw new NoHistoryFoundException();
		}
		else {
			currentIndex+=steps;
			return(history.get(currentIndex));
		}
		
		
	}
	static String back(String stepsInput) throws NoHistoryFoundException {
		int steps =Integer.parseInt(stepsInput);
		if(currentIndex==-1) {
			currentIndex=history.size()-1;
		}
		if(steps>currentIndex) {
			
			throw new NoHistoryFoundException();
		}
		else {
			currentIndex-=steps;
			return(history.get(currentIndex));
		}
	}
	
	String get(String positionInput) throws InvalidPositionException {
		int position=Integer.parseInt(positionInput);
		if(position>history.size()-1) {
			
			throw new ArrayIndexOutOfBoundsException();
		}
		else if(position<0) {
			throw new InvalidPositionException();
		}
		else {
		return(history.get(position));
		}
	}
		
		
		
	
}
