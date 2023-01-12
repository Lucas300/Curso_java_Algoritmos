import java.text.DecimalFormat;
import java.util.Scanner;

public class Problema_aprovados {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0");
		
		System.out.println("Quantos numeros voce vai digitar");
		int n = ler.nextInt();
		
		String nome[] = new String[n];
		float media[] = new float[n],n1,n2;
		int indice = 0;
		
		for(int contador = 0;contador <n ; contador++) {
			System.out.println("Digite nome,primeira e segunda nota do "+(contador+1)+"º aluno:");
			nome[contador] = ler.next();
			n1 = ler.nextFloat();
			n2 = ler.nextFloat();
			media[contador] = (n1+n2)/2;
		}
		System.out.println("Alunos aprovados");
		for(int contador = 0;contador <n ; contador++) {
			if(media[contador]>=6) {
				System.out.println(nome[contador]);
			}
		}
	}
}