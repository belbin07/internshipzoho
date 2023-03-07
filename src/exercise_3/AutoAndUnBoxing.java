package exercise_3;

import java.util.Scanner;

class Browser{
	
	int totalTabs;
	Integer totalTab;
	
	public void totalTabs(int totalTabs) {
		this.totalTabs=totalTabs;
		
	}
	
	public Integer autoBox() {
		this.totalTab=totalTabs;
		return totalTab;
	}
	
	public int unBox(){
		this.totalTabs=totalTab;
		return totalTabs;
		
		
	}
}

public class AutoAndUnBoxing {

	public static void main(String[] args) {
		Browser browser=new Browser();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the no of tabs opened");
		int totalTabs=scan.nextInt();
		browser.totalTabs(totalTabs);
		System.out.println(browser.autoBox());
	
		System.out.println(browser.unBox());

	}

}
