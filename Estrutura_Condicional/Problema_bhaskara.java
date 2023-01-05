import java.text.DecimalFormat;
import java.util.Scanner;

public class Problema_bhaskara {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0000");
		float x1, x2, a , b = 0 , c , delta;

		System.out.print("Coeficiente A:");
		a = ler.nextFloat();
		System.out.print("Coeficiente B:");
		b = ler.nextFloat();
		System.out.print("Coeficiente C:");
		c = ler.nextFloat();
		
		delta = (float) Math.pow(2, b)-(4*a*c);
		x1 = -b;
		
		if((delta<0) || (a == 0)){
			System.out.println("Esta equação não possui raizes reais");
		}
		else {
			x1 = (float)(-b + Math.sqrt(delta)/(2 * a));
			x2 = (float)(-b - Math.sqrt(delta)/(2 * a));
			System.out.println("X1 = "+df.format(x1));
			System.out.println("X2 = "+df.format(x2));
		}
	}
}