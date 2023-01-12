import java.util.Scanner;

public class Problema_soma_vetor{

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		float soma = 0, n[] = new float[10];
		
		
		System.out.print("Quantos numeros você vai digitar?");
		 Float i = ler.nextFloat(); 
		
		for (int contador = 0; contador < i; contador++) {
			System.out.print("Digite um numero: ");
			n[contador] = ler.nextFloat();
			soma = soma+n[contador];
		}
		
		System.out.print("VALORES:");
		for (int contador = 0; contador < i; contador++) {
			System.out.print("  "+n[contador]);
		}
		float media = soma/i;
		System.out.println(" ");
		System.out.println("Soma: "+soma);
		System.out.println("Media: "+media);
		
	}

}