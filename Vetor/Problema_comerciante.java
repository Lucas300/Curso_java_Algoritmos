import java.text.DecimalFormat;
import java.util.Scanner;

public class Problema_comerciante {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = ler.nextInt();
		float compra[] = new float[n], valor_total_compra = 0,valor_total_venda = 0;
		float venda[] = new float[n];
		float lucro[] = new float[n];
		int lucro_abaixo = 0,lucro_acima = 0,lucro_entre = 0;
		
		for(int contador = 0;contador <n; contador++) {
			System.out.println("Produto "+(contador+1));
			System.out.print("Nome: ");
			String nome = ler.next();
			System.out.print("Preco de compra: ");
			compra[contador] =  ler.nextFloat();
			System.out.print("Preco de venda: ");
			venda[contador] =  ler.nextFloat();
	
			lucro[contador] = (float)((venda[contador] / compra[contador])-1)*100;
			
			if(lucro[contador]<10.00) {
				lucro_abaixo = lucro_abaixo+1;
			}
			else if((lucro[contador]>=10.00)&&(lucro[contador]<=20.00)) {
				lucro_entre = lucro_entre+1;
			}
			else if(lucro[contador]>20.00) {
				lucro_acima = lucro_acima +1;
			}
			valor_total_compra = valor_total_compra +compra[contador];
			valor_total_venda = valor_total_venda +venda[contador];
		}
		float lucro_total = valor_total_venda - valor_total_compra;
		
		System.out.println("Lucro abaixo de 10% "+lucro_abaixo);
		System.out.println("Lucro entre de 10% e 20%: "+lucro_entre);
		System.out.println("Lucro acima de 20% "+lucro_acima);
		System.out.println("Valor total de compra: "+valor_total_compra);
		System.out.println("Valor total de venda: "+valor_total_venda);
		System.out.println("Lucro total "+lucro_total);
	}
}