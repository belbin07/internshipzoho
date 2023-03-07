package threads;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable {
	private String name;

	public Task(String name) {
		this.name = name;
	}

	public void run() {
		try {
			for (int i = 0; i <= 1; i++) {
				if (i == 0) {
					Date date = new Date();
					SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
					System.out.println("Initialization Time for" + " task name - " + name + " = " + ft.format(date));
				} 
				else {
					Date date = new Date();
					SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
					System.out.println("Executing Time for task name - " + name + " = " + ft.format(date));
	
				}
				Thread.sleep(1000);
			}
			System.out.println(name + " complete");
		}

		catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}
}

public class ThreadPool {
	static final int MAX_NO = 1;

	public static void main(String[] args) {
		
		Runnable r1 = new Task("task 1");
		Runnable r2 = new Task("task 2");
		Runnable r3 = new Task("task 3");

		ExecutorService pool = Executors.newFixedThreadPool(MAX_NO);

		pool.execute(r1);
		pool.execute(r2);
		pool.execute(r3);
		pool.shutdown();
	}
}
