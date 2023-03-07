package exercise6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws InvalidURLException, InvalidPositionException {
		Scanner scan = new Scanner(System.in);
		BrowserHistory browserHistory = new BrowserHistory();

		while (true) {
			System.out.println("-------------------------------------------");
			System.out.println("Enter any of the below action to perform \n1.Visit\n2.forward\n3.back\n4.get\n5.exit");
			String action = scan.nextLine();
			if ("visit".equalsIgnoreCase(action)) {
				System.out.println("Enter the url");
				String url = scan.nextLine();
				try {
					browserHistory.visit(url);

				} catch (InvalidURLException invalidURLException) {

				}
			}

			else if ("forward".equalsIgnoreCase(action)) {
				System.out.println("Enter the no of steps");
				String steps = scan.nextLine();
				try {
					System.out.println(BrowserHistory.forward(steps));

				} catch (NoHistoryFoundException noHistoryFoundException) {

				} catch (NumberFormatException numberFormatException) {
					System.out.println("Enter a number");
				}
			}

			else if ("back".equalsIgnoreCase(action)) {
				System.out.println("Enter the no of steps");
				String steps = scan.nextLine();
				try {
					System.out.println(BrowserHistory.back(steps));

				} catch (NoHistoryFoundException noHistoryFoundException) {

				} catch (NumberFormatException numberFormatException) {
					System.out.println("Enter a number");
				}
			} else if ("get".equalsIgnoreCase(action)) {
				System.out.println("Enter the position");
				String position = scan.nextLine();
				try {
					System.out.println(browserHistory.get(position));

				} catch (InvalidPositionException invalidPositionException) {

				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("Invalid position");
				} catch (NumberFormatException numberFormatException) {
					System.out.println("Enter a number");
				}

			}

			else if ("exit".equalsIgnoreCase(action)) {
				System.out.println("Ok bei");
				break;
			} else {
				System.out.println("Enter valid action");
			}
		}
	}
}