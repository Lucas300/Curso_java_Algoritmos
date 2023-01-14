import java.text.DecimalFormat;
import java.util.Scanner;

public class Problema_soma_matrizes {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.print("Quantas linhas vai ter cada matriz? ");
		int linha = ler.nextInt();
		System.out.print("Quantas colunas vai ter cada matriz? ");
		int coluna = ler.nextInt();
		
		int[][] matrizA = new int[10][10];
		int[][] matrizB = new int[10][10];
		int[][] matriz_soma = new int[10][10];
		System.out.println("Digite os valores da matriz A:");
		for(int i = 0;i<linha;i++) {
			for(int j = 0;j<coluna;j++) {
				System.out.print("Elemento ["+i+","+j+"]: ");
				matrizA[i][j] = ler.nextInt();
			}
		}
		System.out.println("Digite os valores da matriz B:");
		for(int i = 0;i<linha;i++) {
			for(int j = 0;j<coluna;j++) {
				System.out.print("Elemento ["+i+","+j+"]: ");
				matrizB[i][j] = ler.nextInt();
			}
		}
		System.out.println("Matriz soma:");
		for(int i = 0;i<linha;i++) {
			for(int j = 0;j<coluna;j++) {
				matriz_soma[i][j] = matrizA[i][j] + matrizB[i][j];
				System.out.print(matriz_soma[i][j]+" ");
			}
			System.out.println(" ");
		}
	}
}