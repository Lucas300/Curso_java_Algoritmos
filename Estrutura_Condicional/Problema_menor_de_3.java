import java.text.DecimalFormat;
import java.util.Scanner;

public class Problema_menor_de_3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0");
		int n1,n2,n3;
		
		System.out.println("Primeiro valor");
		n1 = ler.nextInt();
		System.out.println("Segundo valor");
		n2 = ler.nextInt();
		System.out.println("Terceiro valor");
		n3 = ler.nextInt();
		
		if((n1 < n2) && (n1 < n3 )) {
			System.out.println("menor = " + n1);
		}
		else if((n2 < n3) &&( n2<n1 )) {
			System.out.println("menor = " + n2);
		}
		else {
			System.out.println("menor = " + n3);
		}
	}
}