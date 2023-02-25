package oops;


class car {
	void start(){
		System.out.println("started");
	}  
}  
class maruti extends car{  
    void speed(){
    	System.out.println("50");
    }  
}  

class baleno extends maruti{
	void acceleration(){
		System.out.println("10");
		
	}
}

public class TestInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub  
			    baleno d=new baleno();  
			    d.start();  
			    d.speed();
			    d.acceleration();
			
			 

	}

}
