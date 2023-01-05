import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Problema_Pagamento {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		String nome;
		Float valor_hora, hora_trabalhada;
		
		System.out.print("Nome: ");
		nome = ler.next();
		System.out.print("Valor por hora: ");
		valor_hora = ler.nextFloat();
		System.out.print("Horas trabalhadas: ");
		hora_trabalhada = ler.nextFloat();
		System.out.print("O pagamento para "+ nome + " deve ser " + df.format(valor_hora * hora_trabalhada));	
	}
}