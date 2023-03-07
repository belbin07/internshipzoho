package exercise5;

public class Main {

	public static void main(String[] args) {
		Browser browser=new Browser();
		Browser.Bookmarks bookmarks=browser.new Bookmarks();
		bookmarks.display();
		Browser.History history=new Browser.History();
		history.display();
		Browser shortcuts=new Browser(){
			@Override
			void display() {
				System.out.println("Shortcuts:");
			}
		};
		shortcuts.display();
		

	}

}
