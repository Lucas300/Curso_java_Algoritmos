import java.util.Scanner;

public class Problema_negativos {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n[] = new int[10];
		
		
		System.out.print("Quantos numeros você vai digitar?");
		int i = ler.nextInt(); 
		
		for (int contador = 0; contador < i; contador++) {
			System.out.print("Digite um numero: ");
			n[contador] = ler.nextInt();
		}
		System.out.println("Numeros Negativos:");
		
		for (int contador = 0; contador < i; contador++) {
			if(n[contador]<0) {
				System.out.println(n[contador]);
			}
		}

	}

}