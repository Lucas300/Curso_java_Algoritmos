import java.text.BreakIterator;
import java.text.DecimalFormat;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Problema_Terreno{

	public static void main(String[] args) {
		
		float largura,comprimento,metro_quadrado,area,preco;
		DecimalFormat df = new DecimalFormat("#,##0.00");
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite a largura do terreno");
		largura = ler.nextFloat();
		System.out.println("Digite o comprimento do terreno");
		comprimento = ler.nextFloat();
		System.out.println("Digite o valor do metro quadrado");
		metro_quadrado = ler.nextFloat();
		
		area = (largura * comprimento);
		preco = area * metro_quadrado;
		
		System.out.println("Area do terreno "+ df.format(area));
		System.out.println("preco do terreno "+df.format(preco));
		
	}

}