import java.util.Scanner;

public class Problema_pares_concecutivos {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int contador = 0,x = 0,soma=0;
		System.out.println("Digite um numero inteiro: ");
		x = ler.nextInt();
		
		if(x != 0) {
			while(contador <5) {	
				soma = soma + x +(contador*2);
				contador++;
				if((x%2==1)&&(x>0)) {
					soma = soma + 1;
				}
			}
			System.out.println("SOMA = "+soma);
		}	
	}
}