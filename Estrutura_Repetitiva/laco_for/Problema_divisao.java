import java.util.Scanner;

public class Problema_divisao{

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
	System.out.print("Quantos numeros voce quer digitar? ");
	int n = ler.nextInt();

	for(int contador = 0;contador < n; contador++) {
		System.out.print("Entre com o numerador: ");
		float n1 = ler.nextFloat();
		System.out.print("Entre com o denominador: ");
		float n2 = ler.nextFloat();
		if((n1>=n2)||(n1 == 0))  {
			float divisão = n1/n2;
			System.out.println("Divisão = "+divisão);
		}
		else {
			System.out.println("Divisão Impossivel ");
		}
	}
	}
}