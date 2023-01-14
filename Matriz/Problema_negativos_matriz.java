import java.text.DecimalFormat;
import java.util.Scanner;

public class Problema_negativos_matriz {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.print("Qual a quantidade de linha da matriz? ");
		int linha = ler.nextInt();
		System.out.print("Qual a quantidade de coluna da matriz?? ");
		int coluna = ler.nextInt();
		
		int[][] matriz = new int[10][10];
		
		
		for(int i = 0;i<linha;i++) {
			for(int j = 0;j<coluna;j++) {
				System.out.print("Elemento ["+i+","+j+"]: ");
				matriz[i][j] = ler.nextInt();
			}
		}
		System.out.println("Valores Negativos: ");
		for(int i = 0;i < linha;i++) {
			for(int j = 0;j<coluna;j++) {
				if(matriz[i][j]<0) {
					System.out.println(matriz[i][j]);
				}
			}
		}	
	}
}