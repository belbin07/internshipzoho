package exception;

public class NestedTry {

	public static void main(String[] args) {
		try {
			try {
				System.out.println(1/0);
			}
			catch(Exception exception){
				System.out.println(exception);
			}
			System.out.println(1/1);
		}
		catch(Exception exception) {
			System.out.println(exception);
		}

	}

}
