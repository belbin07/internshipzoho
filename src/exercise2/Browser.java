package exercise2;


	public class Browser{
		public Browser(){
			
		}
		
		
		 void whoAmI() {
			
			System.out.println("I am a browser");
		}
		
		public  int totalTabs;
		
		public void setValue(int tabNo) {
			this.totalTabs=tabNo;
		}
		
		public int getValue() {
			return totalTabs;
		}
		
		
	}



