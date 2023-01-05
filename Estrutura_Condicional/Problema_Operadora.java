import java.text.DecimalFormat;
import java.util.Scanner;

public class Problema_Operadora {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		int min;
		
		System.out.print("Digite a quantidade de minutos");
		min = ler.nextInt();
		if(min >= 100) {
			System.out.println("Valor a pagar R$:"+(50+((min%100)*2)));
		}
		else {
			System.out.println("Valor a pagar R$:50.00");
		}
		
	}
}