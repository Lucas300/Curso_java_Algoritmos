import java.text.DecimalFormat;
import java.util.Scanner;
public class Problema_Retangulo {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#,##0.0000");
		
		double base,altura;
		float area,perimetro,diagonal;
		
		System.out.println("Digite a base do retangulo");
		base = ler.nextDouble();
		System.out.println("Digite a Altura do retangulo");
		altura = ler.nextDouble();
		
		area = (float)(base* altura);
		perimetro = (float)((base + altura)*2);
		diagonal = (float)(Math.sqrt(((base*base)+(altura*altura))));//Math.pow(2 , base) + Math.pow(2 , altura
		//usamos o math.sqrt para obter a raiz quadrada do numero e o Math.pow(2 , base) para se obter a exponenciação		

		System.out.println("Area: "+ df.format(area));
		System.out.println("Perimetro "+df.format(perimetro));
		System.out.println("Diagonal "+df.format(diagonal));	
	}
}