package Controllerex1;

public class threadsIDFounder extends Thread {
	private int idThread;

	public threadsIDFounder(int idThread) {
		this.idThread = idThread;
	}

	

	public void run() {
		threadID();
		
	}

	private void threadID() {
		System.out.println("ID: " + Thread.currentThread().getId());	}

}
