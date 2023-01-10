import java.util.Scanner;

public class Problema_media_ponderada {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n,numero_novo;
		float media;
		System.out.print("Quantos numeros vai digitar? ");
		n = ler.nextInt();
		
		for(int contador =0 ; contador < n;) {
			System.out.println("Digite 3 numeros");
			Float n1 = ler.nextFloat();
			Float n2 = ler.nextFloat();
			Float n3 = ler.nextFloat();
			media = (n1+n2+n3)/3;
			System.out.println("Media = "+ media);
		}
		}
	}