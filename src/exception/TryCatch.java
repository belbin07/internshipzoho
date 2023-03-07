package exception;



public class TryCatch {

	public static void main(String[] args) {
		try {
			System.out.println(1/0);
		}
		catch(Exception exception) {
		//System.out.println(exception);
		}
	//	finally {
	//		System.out.println("end");
	//	}
		
	}

}
