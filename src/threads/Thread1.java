package threads;

public class Thread1 extends Thread {
	@Override
	public void run() {
		System.out.println("myThread is running");
	}
	
	

	public static void main(String[] args) {
		Thread1 thread1=new Thread1();
		Thread thread2=new Thread(new MyRunnable());
		thread1.start();
		thread2.start();

	}

}
