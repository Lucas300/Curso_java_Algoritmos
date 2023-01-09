import java.util.Scanner;

public class Problema_sequencia_impares {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int x;
		System.out.print("Digite o valor de X ");
		x = ler.nextInt();
	
		
		for(int contador =1 ;contador < x ; contador++) {
			if(contador%2==1) {
				System.out.println(contador);
			}
		}
	}
}