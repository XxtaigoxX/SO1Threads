package View;

import Controllerex1.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		int matriz[][] = new int[3][5];
		int vetor[] = new int[1000];
		int n = 0;
		for (int i = 0; i < vetor.length; i++) {
			// vetor[i] = (int) (Math.random() * 100 + 1);
			if (i == 0) {
				vetor[i] = vetor[i] + 1;

			}
			if (i != 0) {
				vetor[i] = vetor[i - 1] + 1;
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				matriz[i][j] = (int) (Math.random() * 100 + 1);
			}
		} 
		System.out.println("Escolha uma opção:");
	            System.out.println("1 - Id das Threads");
	            System.out.println("2 - Soma das matrizes");
	            System.out.println("3 - Tempo para percorrer os vetores");
	            System.out.println("4 - Corrida de Sapuh");
	            System.out.println("5 - Sair");
		while (n != 5) {
			n = scanner.nextInt();

			switch (n) {
			case 1:
				for (int idThread = 0; idThread < 5; idThread++) {

					Thread threadsController = new threadsIDFounder(idThread);
					threadsController.start();
				}
				n = n + 1;
				break;
			case 2:
				for (int s = 0; s < 3; s++) {
					Thread ThreadCalc = new ThreadCalc(s, matriz[s]);
					ThreadCalc.start();
				}
				break;
			case 3:
				for (int l = 0; l < 2; l++) {
					Thread ThreadVetor = new ThreadVetor(l, vetor);
					ThreadVetor.start();
				}
				break;
			case 4:
				System.out.println("o valor maximo dos pulos é 5 e a distancia do percurso é de 100 metros");
				for (int sapo = 0; sapo < 5; sapo++) {
					Thread Usapuh = new ThreadsSapuh(sapo);
					Usapuh.start();
				}

			}
		}

	}
}