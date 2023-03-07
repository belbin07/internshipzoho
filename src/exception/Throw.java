package exception;

public class Throw {
	 
		static void division(int divident,int divider){
			if(divider==0)
	            try{
	                throw new Exception();
	            }catch(Exception e){
	                System.out.println("Division with zero is not defined");
	            }
			else
			   System.out.println(divident/divider);
		}
		public static void main (String[] args) {
			division(20,0);
			division(10,1);
		
	}
}