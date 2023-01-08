import java.util.Scanner;

public class Problema_combustivel {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int codigo = 0 ,alcool = 0,gasolina = 0,diesel = 0;
		
		
		
		while(codigo != 4) {
			System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
			codigo = ler.nextInt();
			switch(codigo) {
				case 1:
					alcool++;
				break;
				case 2:
					gasolina++;
				break;
				case 3:
					diesel++;
				break;
			}
		}
		System.out.println("Alcool: "+ alcool);
		System.out.println("Gasolina "+ gasolina);
		System.out.println("Diesel "+ diesel);
	}
}