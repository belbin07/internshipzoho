package exception;

import java.util.Scanner;

public class Sample{
	static void display(String s, int no) {
		int x = Integer.parseInt(s);
		int y = no/x;
		System.out.println(y);
	}
	public static void main(String[] args) {
		int[] a = new int[10];
		System.out.println("Enter input");
		Scanner scan=new Scanner(System.in);
		String s =scan.nextLine();
		try {
			
			display(s, 100);
			
		}catch(NumberFormatException e) {
			System.out.println("Please enter a valid string");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	
}

}
