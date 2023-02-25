package Exercise_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


 class Browser {

	private List<String> history = new ArrayList<String> ();

	public Browser() {
		history = new ArrayList<String>();
		}

    Browser(String[] url){
    	history = new ArrayList<String> ();
	for (String st : url){
		setHistory(st);
	}
	}

	void setHistory(String url) {

		 history.add(url);

		}

	void showHistory() {
		for(String url : history) {
			System.out.println(url);
		}
	}
}

class Main {

	public static void main(String[] args) {


		//Browser chrome = new Browser();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no of inputs:");
		int n= scan.nextInt();
		String [] arr= new String[n];

		for(int i=0;i<n;i++) {
			System.out.println("Enter url:");
			arr[i] = scan.nextLine();
			
		}
		Browser ch=new Browser(arr);

		System.out.println("\tShowing history");
		ch.showHistory();

		scan.close();



	}

}
