import java.text.DecimalFormat;
import java.util.Scanner;

public class problema_Idades {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0");
		String nome1, nome2;
		double idade1, idade2;
		System.out.println("Dados da primeira pessoa");
		System.out.print("Nome: ");
		nome1 = ler.next();
		System.out.print("Idade: ");
		idade1 = ler.nextDouble();
		System.out.println("Dados da segunda pessoa");
		System.out.print("Nome:" );
		nome2 = ler.next();
		System.out.print("Idade:" );
		idade2 = ler.nextDouble();
		System.out.println("A idade de " +nome1 + " e " + nome2 + " é de "+ df.format((idade1+idade2)/2));
	}
}