import java.util.Scanner;

public class Problema_Troco_Verificado {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		float  x,y;
		
		System.out.print("Valor de X: ");
		x = ler.nextFloat();
		
		System.out.print("Valor de Y: ");
		y = ler.nextFloat();
		
		if((x>0)&&(y>0)) {
			System.out.println("Q1");
		}
		else if((x<0)&&(y>0)){
			System.out.println("Q2");
		}
		else if((x<0)&&(y<0)) {
			System.out.println("Q3");
		}
		else if((x>0)&&(y<0)) {
			System.out.println("Q4");
		}
		else if((x>0)&&(y == 0)) {
			System.out.println("Eixo X");
		}
		else if((x == 0)&&(y > 0)) {
			System.out.println("Eixo Y");
		}
		else {
			System.out.println("Origem");
		}
	}
}