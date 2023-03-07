package threads;

public class ThreadLambda {

	public static void main(String[] args) {
		Runnable runnable=()->{
			String threadName=Thread.currentThread().getName();
			System.out.println(threadName+"is running");
			
		};
		Thread thread3=new Thread(runnable,"runnable ");
		thread3.start();

	}

}
