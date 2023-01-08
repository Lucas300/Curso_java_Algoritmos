import java.util.Scanner;

public class Problema_media_idades {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int  idade,contador = 0,nova_idade = 0;
		float media = 0;
		
		System.out.println("Digite as idades ");
		idade = ler.nextInt();
		
		if(idade < 0) {
			System.out.println("Impossivel calcular ");
		}
		else {
			while(nova_idade >= 0) {
				idade = idade + nova_idade;
				contador++;
				nova_idade = ler.nextInt();
			}	
			media = (float)(idade/contador);
			System.out.println("Media = "+ media);
		}	
	}
}