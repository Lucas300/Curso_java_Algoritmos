import java.text.DecimalFormat;
import java.util.Scanner;

public class Problema_Troco {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
	
		float preco,quantidade,dinheiro,troco;
		System.out.print("Preço unitario do produto: ");
		preco = ler.nextFloat();
		
		System.out.print("Quantidade comprada: ");
		quantidade = ler.nextFloat();
		
		System.out.print("Dinheiro recebido: ");
		dinheiro = ler.nextFloat();
		
		troco = dinheiro - (preco*quantidade);
		if(troco > 0) {
			System.out.print("Troco: "+df.format(troco));
		}
		else {
			System.out.println("Dinheiro insuficiente. Faltam "+df.format(-troco)+" Reais");
		}	
	}
}