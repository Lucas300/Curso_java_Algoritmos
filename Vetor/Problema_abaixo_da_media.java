import java.text.DecimalFormat;
import java.util.Scanner;

public class Problema_abaixo_da_media {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0");
		
		System.out.println("Quantos numeros voce vai digitar");
		int n = ler.nextInt();
		float soma = 0,media =0;
		float a[] = new float[n];
		
		System.out.print("Digite um numero:");
		//i de indice
		for(int i = 0;i < n; i++) {
			a[i] = ler.nextFloat();
			soma = soma + a[i]; 
		}
		media = soma/n;
		System.out.println("Media do vetor = "+media);
		System.out.println("ELEMENTOS ABAiXO DA MEDIA: ");
		for(int i = 0;i < n; i++){
			if(a[i]<media) {
				System.out.println(a[i]);
			}
		}
	}
}