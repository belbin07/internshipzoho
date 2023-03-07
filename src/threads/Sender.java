package threads;

class Sender {

	public void send(String msg) {

		
		try {
			Thread.sleep(1000);
			System.out.println("Sending\t" + msg);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Thread  interrupted.");
			Thread.currentThread().interrupt();
		}
		System.out.println("\n" + msg + "Sent\n");

	}

}

class ThreadedSend extends Thread {
	private String msg;
	Sender sender;

	ThreadedSend(String m, Sender obj) {
		msg = m;
		sender = obj;
	}

	@Override
	public void run() {
		synchronized (sender) {
			sender.send(msg);
		}
	}
}
