import java.text.DecimalFormat;
import java.util.Scanner;

public class Problema_soma_linhas {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.print("Qual a quantidade de linha da matriz? ");
		int linha = ler.nextInt();
		System.out.print("Qual a quantidade de coluna da matriz?? ");
		int coluna = ler.nextInt();
		
		int[][] matriz = new int[10][10];
		int soma_linha[] = new int[10];
		
		for(int i = 0;i<linha;i++) {
			System.out.println("Digite os elementos da "+(i+1)+"º Linha: ");
			for(int j = 0;j<coluna;j++) {
				matriz[i][j] = ler.nextInt();
				soma_linha[i] = soma_linha[i]+matriz[i][j];
			}
		}
		System.out.println("VETOR GERADO:");
		for(int i = 0;i < linha;i++) {
			System.out.println(soma_linha[i]);
		}	
	}
}