import java.text.DecimalFormat;
import java.util.Scanner;

public class Problema_maior_posicao {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0");
		
		System.out.println("Quantos numeros voce vai digitar");
		int n = ler.nextInt();
		//declarando o vetor
		int numero[] = new int[n],maior_valor = 0,posicao = 0;
		
		for (int contador = 0; contador <n; contador++) {
			System.out.print("Digite um numero: ");
			numero[contador] = ler.nextInt();	
		}
		maior_valor = numero[0];
		for (int contador = 1; contador <n; contador++) {
			if(numero[contador]>maior_valor) {
				maior_valor = numero[contador];
				posicao = contador;
			}
		}
		System.out.println("Maior valor "+df.format(maior_valor));
		System.out.println("Posição do maior valor = "+posicao);
	}
}