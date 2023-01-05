import java.text.DecimalFormat;
import java.util.Scanner;

public class Problema_Medidas {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0000");
		
		float a,b,c,quadrado,triangulo,trapezio;
		
		System.out.println("Digite a medida A");
		a = ler.nextFloat();
		System.out.println("Digite a medida B");
		b = ler.nextFloat();
		System.out.println("Digite a medida C");
		c = ler.nextFloat();
		quadrado = (float)Math.pow(2 , a);
		triangulo = (a * b)/2;
		trapezio = ((a+b)*c)/2;
		
		System.out.println("AREA DO QUADRADO = " + df.format(quadrado));
		System.out.println("AREA DO TRIANGULO = " + df.format(triangulo));
		System.out.println("AREA DO TRAPEZIO = " + df.format(trapezio));	
	}
}