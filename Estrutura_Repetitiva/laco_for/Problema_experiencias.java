import java.text.DecimalFormat;
import java.util.Scanner;

public class Problema_experiencias {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
	
		float quantidade, total = 0,c =0 , r=0 , s = 0,n;
		String tipo;
		System.out.print("Quantos casos de teste serao digitados? ");
		n = ler.nextInt();
		
		for (int contador = 1;contador <= n;contador++) {
			System.out.print("Quantidade de cobaias: ");
			quantidade = ler.nextFloat();
			
			System.out.print("Tipo de cobaia: ");
			tipo = ler.next();
			
			total = total+quantidade;
			switch(tipo) {
				case "c":
					c = c + quantidade;
				break;
				case "r":
					r = r + quantidade;
				break;
				case "s":
					s = s + quantidade;
				break;
			}	
		}
		System.out.println("RELATORIO FINAL");
		System.out.println("TOTAL "+ total +" DE COBAIAS");
		System.out.println("Total de coelhos: " + c);
		System.out.println("Total de ratos " + r);
		System.out.println("Total de sapos " + s);
		System.out.println("percentual de coelhos "+df.format((c/total)*100));
		System.out.println("percentual de ratos " +df.format((r/total)*100));
		System.out.println("percentual de sapos "+df.format((s/total)*100));
	}
}