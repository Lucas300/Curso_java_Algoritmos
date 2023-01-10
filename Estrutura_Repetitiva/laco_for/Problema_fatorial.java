import java.util.Scanner;

public class Problema_fatorial {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
	
		int n;
		System.out.print("Digite o Valor de N ");
		n = ler.nextInt();
		
		int fatorial = 1;
		
		for(int contador = 1; contador <= n; contador++) {
			fatorial = fatorial*contador;
		}
		System.out.println("Fatorial = "+fatorial);
	}
}