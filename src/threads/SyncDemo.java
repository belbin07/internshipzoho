package threads;

public class SyncDemo {

	public static void main(String[] args) {
		Sender send = new Sender();
		ThreadedSend threadSend1 = new ThreadedSend(" Hi ", send);
		ThreadedSend threadSend2 = new ThreadedSend(" Bye ", send);

		
		threadSend1.start();
		threadSend2.start();


	}

}
