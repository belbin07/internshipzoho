package exercise6;

 class InvalidURLException extends Exception{
	InvalidURLException(){
		System.out.println("Invalid url extension");
		System.out.println("");
	}
	

}
 
 class NoHistoryFoundException extends Exception{
	 NoHistoryFoundException(){
		 System.out.println("No history found");
		 System.out.println("");
	 }
 }
 
 class InvalidPositionException extends Exception{
	 InvalidPositionException(){
		 System.out.println("Provide only positive values");
		 System.out.println("");
	 }
 }
