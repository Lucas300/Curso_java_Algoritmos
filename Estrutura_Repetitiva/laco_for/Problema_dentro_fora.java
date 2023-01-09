import java.util.Scanner;

public class Problema_dentro_fora {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n,numero_novo,dentro = 0,fora = 0;
		System.out.print("Quantos numeros você quer digitar? ");
		n = ler.nextInt();
	
		for(int contador=1;contador <= n;contador++) {
			System.out.print("digite um numero ");
			numero_novo = ler.nextInt();
			if((numero_novo>=10)&&(numero_novo<=20)) {
				dentro = dentro+1;
			}
			else {
				fora = fora+1;
			}
		}
		System.out.println(dentro + " Dentro");
		System.out.println(fora + " Fora");
	}
}