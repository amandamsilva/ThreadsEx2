package view;

import controller.SomaMatriz;

public class Main {

	public static void main(String[] args) {

		int[][] matriz = new int[3][5];
		int[] vetor = new int[5];
		
		for (int thread = 0; thread < 3; thread++) {
			Thread threads = new SomaMatriz(thread);
			threads.start();
		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				matriz[i][j] = (int) (Math.random() * 10) + 1; 
			}
		}
		
		SomaMatriz s = new SomaMatriz(0);
		s.soma(matriz);
	}

}
