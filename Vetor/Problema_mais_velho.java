import java.text.DecimalFormat;
import java.util.Scanner;

public class Problema_mais_velho {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0");
		
		System.out.println("Quantos numeros voce vai digitar");
		int n = ler.nextInt();
		
		String nome[] = new String[n];
		int idade[] = new int[n],indice = 0;
		
		
		for(int contador = 0;contador <n; contador++) {
			System.out.println("Dados da : "+(contador+1)+"º pessoa");
			System.out.print("Nome: ");
			nome[contador] = ler.next();
			System.out.print("Idade: ");
			idade[contador] = ler.nextInt();
		}
		int maior_idade = idade[0];
		for(int contador = 0;contador <n; contador++) {
			if(idade[contador]>maior_idade) {
				maior_idade = idade[contador];
				String nome_mais_velho = nome[contador]; 
				indice = contador;
			}
		}
		System.out.println("Pessoa mais velha: "+nome[indice]);
	}
}