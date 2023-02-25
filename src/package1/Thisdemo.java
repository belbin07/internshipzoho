package package1;

public class Thisdemo {
		

	int a;
	Thisdemo(int a){
		
		this.a=a;
		
		
	}
	
	void show() {
		System.out.println(a);
	
}
	
	public static void main(String[] args) {
			// TODO Auto-generated method stub
			
		Thisdemo td=new Thisdemo(5);
		//System.out.println(td);
		
		td.show();

	}

}


