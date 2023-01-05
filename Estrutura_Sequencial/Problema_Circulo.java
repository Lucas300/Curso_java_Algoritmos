import java.text.DecimalFormat;
import java.util.Scanner;

public class Problema_Circulo {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.000");
		
		System.out.print("Digite o valor do raio do circulo");
		float raio = ler.nextFloat();
		
		float area = (float) ((raio*raio) * Math.PI);
		System.out.println("Area: " + df.format(area));	
	}
}