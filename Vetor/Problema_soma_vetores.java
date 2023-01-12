import java.text.DecimalFormat;
import java.util.Scanner;

public class Problema_soma_vetores {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0");
		
		System.out.println("Quantos numeros voce vai digitar");
		int n = ler.nextInt();
		
		int a[] = new int[n], b[] = new int[n];
		int c[] = new int[n]; 
		
		System.out.print("Digite os valores do vetor A:");
		//i de indice
		for(int i = 0;i < n; i++) {
			a[i] = ler.nextInt();
		}
		System.out.print("Digite os valores do vetor B:");
		for(int i = 0;i < n; i++) {
			b[i] = ler.nextInt();
			c[i] = (a[i]+b[i]); 
		}
		System.out.println("Vetor resultante");
		for(int i = 0;i < n; i++) {
			System.out.println(c[i]);
		}
	}
}