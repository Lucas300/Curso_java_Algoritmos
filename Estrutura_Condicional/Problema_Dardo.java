import java.text.DecimalFormat;
import java.util.Scanner;

public class Problema_Dardo {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		float n1,n2,n3;
		
		System.out.println("Primeiro valor");
		n1 = ler.nextFloat();
		System.out.println("Segundo valor");
		n2 = ler.nextFloat();
		System.out.println("Terceiro valor");
		n3 = ler.nextFloat();
		
		if((n1 > n2) && (n1 > n3 )) {
			System.out.println("Maoir = " + df.format(n1));
		}
		else if((n2 > n3) &&( n2 > n1 )) {
			System.out.println("Maior = " + df.format(n2));
		}
		else {
			System.out.println("Maior = " + df.format(n3));
		}
	}
}