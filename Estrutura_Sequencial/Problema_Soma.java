import java.text.DecimalFormat;
import java.util.Scanner;

public class Problema_Soma{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0");
		double x1, x2;
		
		System.out.print("DIgite o valor de X: ");
		x1 = ler.nextDouble();
		System.out.print("Digite o valor de Y: " );
		x2 = ler.nextDouble();
		System.out.println("Soma: "+ df.format(x1+x2));
	}
}