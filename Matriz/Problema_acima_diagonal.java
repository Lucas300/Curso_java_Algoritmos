import java.text.DecimalFormat;
import java.util.Scanner;

public class Problema_acima_diagonal {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.print("Qual a ordem da matriz? ");
		int ordem = ler.nextInt();
		int matriz[][] = new int[10][10];
		int soma = 0;
		
		for(int i = 0;i< ordem ;i++) {
			for(int j = 0; j< ordem; j++) {
				System.out.print("Elemento ["+i+","+j+"]: ");
				matriz[i][j] = ler.nextInt();
			}
		}
		for(int i = 0;i< ordem ;i++) {
			for(int j = (i+1); j< ordem; j++) {
				soma = soma+matriz[i][j];
			}
		}
		System.out.println("SOMA DOS ELEMENTOS ACIMA DA DIAGONAL PRINCIPAL = "+soma);		
	}
}