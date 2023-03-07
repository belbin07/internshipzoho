package exercise9;

public class ex9Test {

	public static void main(String[] args) {
		BrowserHistory browserHistory=new BrowserHistory();
		browserHistory.addHistory("www.com");
		browserHistory.addHistory("tw.com");
		browserHistory.addHistory("fb.com");
		browserHistory.addHistory("wer.com");
		browserHistory.addHistory("app.com");
		BrowserHistory deleteThread=new BrowserHistory() {
			@Override
			public void run() {
				 
					browserHistory.deleteHistory(3);
				
				
			}
			
			
		};
		BrowserHistory displayThread=new BrowserHistory() {
			@Override
			public void run() {
				browserHistory.readHistory(3);
			}
		};
		
		
		displayThread.start();
		deleteThread.start();

	}

}
