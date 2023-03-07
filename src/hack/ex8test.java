package hack;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class ex8test {

	public static void main(String[] args) throws IOException {
		Browser browser = new Browser();
		Hacker hacker = new Hacker();
		BrowserHistory browserHistory = new BrowserHistory();
		browser.addHistory("www.com");
		browser.addHistory("fgh.in");
		hacker.writeHistory(browser.history);
		List<String> history = hacker.readHistory();
		browserHistory.updateHistory(history, "sdf.com");
		browserHistory.display();
	}

}
