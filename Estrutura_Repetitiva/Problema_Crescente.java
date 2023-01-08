import java.util.Scanner;

public class Problema_Crescente {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int  x,y;
		
		System.out.println("Digite dois numeros ");
		x = ler.nextInt();
		y = ler.nextInt();
		
		while(x != y) {
			if(x>y) {
				System.out.println("DECRESCENTE");
			}
			else {
				System.out.println("CRESCENTE");
			}
			System.out.println("Digite outros dois numeros: ");
			x = ler.nextInt();
			y = ler.nextInt();
		}	
	}
}