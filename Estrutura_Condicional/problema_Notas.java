import java.text.DecimalFormat;
import java.util.Scanner;

public class problema_Notas {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0");
		float nota1, nota2;
		
		System.out.print("Digite a primeira nota: ");
		nota1 = ler.nextFloat();
		System.out.print("Digite a segunda nota: ");
		nota2 = ler.nextFloat();
		
		if((nota1+nota2)<60.00) {
			System.out.println("Nota final = "+df.format(nota1+nota2));
			System.out.println("REPROVADO");
		}
		else {
			System.out.println("Nota final = "+df.format(nota1+nota2));
			System.out.println("Aprovado");
		}
	}
}