import java.text.DecimalFormat;
import java.util.Scanner;

public class Problema_diagonal_negativos {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.print("Qual a ordem da matriz? ");
		int ordem = ler.nextInt();
		
		int[][] matriz = new int[10][10];
		int negativo = 0;
		for(int i = 0;i<ordem;i++) {
			for(int j = 0;j<ordem;j++) {
				System.out.print("Elemento ["+i+","+j+"]:");
				matriz[i][j] = ler.nextInt();
				if(matriz[i][j]<0) {
					negativo = negativo + 1;
				}
			}
		}
		for(int i = 0;i<ordem;i++) {
			for(int j = 0;j<ordem;j++) {
				if(i == j) {
					System.out.print(matriz[i][j]+" ");
				}
			}
		}
		System.out.println(" ");
		System.out.println("QUANTIDADE DE NEGATIVOS = "+negativo);
	}
}