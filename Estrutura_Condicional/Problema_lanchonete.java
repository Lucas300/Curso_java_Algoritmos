import java.text.DecimalFormat;
import java.util.Scanner;

public class Problema_lanchonete {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		int codigo,quantidade;
		
		System.out.println("codigo do produto comprado: ");
		codigo = ler.nextInt();
		System.out.println("Quantidade: ");
		quantidade = ler.nextInt();
		switch (codigo) {
			case 1:
				System.out.println("Valor a pagar: R$ "+df.format(5.00 * quantidade));
				break;
			case 2:
				System.out.println("Valor a pagar: R$ "+df.format(3.50 * quantidade));
				break;
			case 3:
				System.out.println("Valor a pagar: R$ "+df.format(4.80 * quantidade));
				break;
			case 4:
				System.out.println("Valor a pagar: R$ "+df.format(8.90 * quantidade));
				break;
			case 5:
				System.out.println("Valor a pagar: R$ "+df.format(7.32 * quantidade));
				break;
			default:
				System.out.println("Codigo invalido");
				break;
		}		
	}
}