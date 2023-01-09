import java.util.Scanner;

public class Problema_soma_impares {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n1 = 0,n2 = 0,soma = 0;
		System.out.print("Digite dois numeros ");
		n1 = ler.nextInt();
		n2 = ler.nextInt();
		
		if(n1<n2) {
			for(int contador =n1 ;contador < n2 ; contador++) {
				if(contador%2==1) {
					soma = soma + contador;
				}
			}
		}
		else {
			for(int contador =n2 ;contador < n1 ; contador++) {
				if(contador%2==1) {
					soma = soma + contador;
				}
			}
		}
		System.out.println(soma);		
	}
}