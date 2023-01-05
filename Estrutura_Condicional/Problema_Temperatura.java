import java.text.DecimalFormat;
import java.util.Scanner;

public class Problema_Temperatura {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		float  c ,f;
		String temperatura;
		
		System.out.print("Você vai digitar em qual escala (C/F)? ");
		temperatura = ler.next();
	
		switch (temperatura) {
			case "c":
				System.out.println("Digite a temperatura em Celcius: ");
				c = ler.nextFloat();
				f = (c * 9/5) + 32;
				System.out.println("Temperatura equivalente em fahrenheit: "+df.format(f));
			break;
			case "f":
				System.out.println("Digite a temperatura em Fahrenheit: ");
				f = ler.nextFloat();
				c = (f - 32)* 5/9;
				System.out.println("Temperatura equivalente em fahrenheit: "+df.format(c));
			break;
			default:
				System.out.println("Digite um padrão correto");
			break;
		}
		
	}
}