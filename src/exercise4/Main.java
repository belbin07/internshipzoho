package exercise4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserHistory bh=new BrowserHistory();
		Scanner scan=new Scanner(System.in);
		while(true) {
		System.out.println("Enter the browser");
		String input=scan.nextLine();
		bh.addHistory(input);
		
		System.out.println("____________________");
		}
	}

}
