import java.text.DecimalFormat;
import java.util.Scanner;

public class Problema_alturas {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = ler.nextInt();
		
		String nome[] = new String[n];
		int idade[] = new int[n],menores = 0;
		float altura[] = new float[n],soma_altura = 0;
		
		for(int contador = 0;contador <n; contador++) {
			System.out.println("Dados da "+(contador+1)+"º Pessoa:");
			System.out.print("nome: ");
			nome[contador]=ler.next();
			System.out.print("idade: ");
			idade[contador] = ler.nextInt();
			System.out.print("altura: ");
			altura[contador] = ler.nextFloat();
			
			//somando alturas para tirar a media
			soma_altura = soma_altura+altura[contador];
			
			//somando os menores de idade para tirar a porcentagem dos menores de idade
			if(idade[contador]<16) {
				menores = menores + 1;
			}
		}
		float porcentagem = (float)((menores/(float)n)*100.00);
		System.out.println("Altura media: "+df.format(soma_altura/n));
		System.out.println("Pessoas com menos de 16 anos: "+df.format(porcentagem)+"%");
		for(int contador = 0;contador <n;contador++) {
			if(idade[contador]<16) {
				System.out.println(nome[contador]);
			}	
		}
	}
}