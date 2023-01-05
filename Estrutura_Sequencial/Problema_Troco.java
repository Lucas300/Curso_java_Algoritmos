import java.text.DecimalFormat;
import java.util.Scanner;

public class Problema_Troco {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		float preco, dinheiro, troco;
		int quantidade;;
		
		System.out.println("Preço unitario do produto");
		preco = ler.nextFloat();
		
		System.out.println("Quantidade");
		quantidade = ler.nextInt();
		
		System.out.println("Dinheiro recebido");
		dinheiro = ler.nextFloat();
		
		troco = dinheiro-(preco*(float)quantidade);
		System.out.println("Troco = " + df.format(troco));
	}
}