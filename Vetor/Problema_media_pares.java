import java.text.DecimalFormat;
import java.util.Scanner;

public class Problema_media_pares {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0");
		
		System.out.println("Quantos numeros voce vai digitar");
		int n = ler.nextInt();
		
		float soma = 0,media =0,pares = 0;
		
		float a[] = new float[n];
		
		
		//i de indice
		for(int i = 0;i < n; i++) {
			System.out.print("Digite um numero:");
			a[i] = ler.nextFloat();
			if(a[i]%2==0) {
				soma = soma+a[i];
				pares = pares + 1;
			}
		}
		
		media = soma/pares;
		if(pares>0){
			System.out.println(media);
		}
		else {
			System.out.println("NENHUM NUMERO PAR");
		}
	}
}