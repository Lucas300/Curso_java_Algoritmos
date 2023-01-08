import java.util.Scanner;

public class Problema_validacao_de_nota {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		float media,n1,n2;
		
		System.out.print("Digite a primeira nota: ");
		n1 = ler.nextFloat();
		
		while((n1<0)||(n1>10)) {
			System.out.print("Valor invalido! Tente novamente: ");
			n1 = ler.nextFloat();
		}
		System.out.print("Digite a segunda nota ");
		n2 = ler.nextFloat();
		while((n2<0)||(n2>10)) {
			System.out.print("Valor invalido! Tente novamente: ");
			n2 = ler.nextFloat();
		}
		media = (n1+n2)/2;
		System.out.println("MEDIA = "+media);
	}
}