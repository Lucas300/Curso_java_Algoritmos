import java.util.Scanner;

public class Problema_par_impar {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n,numero_novo;
		System.out.print("Quantos numeros você quer digitar? ");
		n = ler.nextInt();
		
		
			
			System.out.print("Digite um numero: ");
			numero_novo = ler.nextInt();
			for (int contador = 1;contador <=n ;contador ++)
				if((numero_novo%2==1)&&(numero_novo <= -1)) {
					System.out.println("IMPAR NEGATIVO");
				}
				else if((numero_novo%2==1)&&(numero_novo > 0)) {
					System.out.println("IMPAR POSITIVO");
				}
				else if ((numero_novo%2==0)&&(numero_novo> 0)) {
					System.out.println("PAR POSITIVO");
				}
				else if((numero_novo%2==0)&&(numero_novo < 0)) {
					System.out.println("PAR NEGATIVO");
				}
				else if(numero_novo == 0){
					System.out.println("NULO");
			}
		}
	}