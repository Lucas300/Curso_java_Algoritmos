import java.util.Scanner;

public class Problema_pares_consecutivos {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int contador = 0, x = 0,soma=0;
		System.out.print("Digite um numero inteiro: ");
		x = ler.nextInt();
		
		if(x>0) {
			while(contador <5) {	
				soma = soma + x +(contador*2);
				contador++;
			
			}
		}
		else if((x%2!=0)&&(x>0)){
			while(contador <5) {	
				soma = soma + x +(contador*2);
				contador++;
				soma = soma + 1;
			}
			
			
		}
		else if(x%2 == 0){
			contador = 5;
		}
		System.out.println("SOMA = "+soma);
	}
}