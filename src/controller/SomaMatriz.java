package controller;

public class SomaMatriz extends Thread {
	
	private int thread;
	
	public SomaMatriz(int thread) {
		this.thread = thread;
	}

	int[] vetor = new int[5];
	int i = 0;
	int soma = 0;

	public void run(int[][] matriz) {
		soma(matriz);
	}

	public void soma(int[][] matriz) {
		for (int i = 0, x = 0; i < 3; i++, x++) {	

			for (int j = 0; j < 5; j++) {
				vetor[x] = matriz[i][j];
				soma+= vetor[x];
			}
			System.out.println(" Soma: " + soma + ", linha " + (i+1));
		}
	}
}
