package Controllerex1;

public class ThreadsSapuh extends Thread {
	private int sapoid;
	static int posicao = 0;

	public ThreadsSapuh(int sapoid) {
		this.sapoid = sapoid;
	}

	public void run() {
		sapo();

	}

	private void sapo() {
		int distancia = 0;
		int tempo = 4000;
		try {
			sleep(tempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		while (distancia < 20) {
			int percorrer = 0;
			percorrer = (int) (Math.random() * 5 + 1);
			distancia = distancia + percorrer;
			System.out.println(
					"Sapo" + sapoid + " percorreu " + percorrer + " metros e esta em " + distancia + " metros");
			try {
				sleep(tempo - 2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (ThreadsSapuh.class) {
			}

		}
		synchronized (ThreadsSapuh.class) {
			posicao = posicao + 1;
		}
		System.out.println(sapoid + " ganhou a corrida em " + posicao + " lugar");
	}
}
