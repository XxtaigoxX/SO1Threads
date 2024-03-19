package Controllerex1;

public class ThreadVetor extends Thread {
	private int[] vetor;
	private int id;

	public ThreadVetor(int id, int[] vetor) {
		this.id = id + 1;
		this.vetor = vetor;
	}

	public void run() {
		if (id == 1) {

			double startTime = System.nanoTime();
			for (int i = 0; i < vetor.length; i++) {

			}
			double endTime = System.nanoTime();
			double tempo3 = (endTime - startTime) / Math.pow(10, 9);
			System.out.println(tempo3);
		} else if (id == 2) {
			double startTime = System.nanoTime();
			for (int valor : vetor) {

			}
			double endTime = System.nanoTime();
			double tempo3 = (endTime - startTime) / Math.pow(10, 9);
			System.out.println(tempo3);

		}

	}
}
