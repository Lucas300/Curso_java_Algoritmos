import java.text.DecimalFormat;
import java.util.Scanner;

public class Problema_numeros_pares {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("Quantos numeros voce vai digitar");
		int n = ler.nextInt();
		//declarando o vetor
		int numero[] = new int[n],total_pares = 0;
		
		for (int contador = 0; contador <n; contador++) {
			System.out.print("Digite um numero: ");
			numero[contador] = ler.nextInt();	
		}
		System.out.println("Numeros Pares:");
		//checando os numeros pares
		for (int contador = 0; contador <n; contador++) {
			if(numero[contador]%2 == 0) {
				System.out.print(numero[contador]+" ");
				total_pares = total_pares +1;
			}	
		}
		System.err.println(" ");
		System.out.println("QUANTIDADE DE PARES = "+total_pares);
	}
}