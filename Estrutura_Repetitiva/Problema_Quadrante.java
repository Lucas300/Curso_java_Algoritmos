import java.util.Scanner;

public class Problema_Quadrante {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int  x,y;
		
		System.out.println("Digite os valores das coordenadas X e Y: ");
		x = ler.nextInt();
		y = ler.nextInt();
		
		while((x!=0)&&(y!=0)){
			if((x>0)&&(y>0)) {
				System.out.println("Quadrante Q1");
			}
			else if((x<0)&&(y>0)){
				System.out.println("Quadrante Q2");
			}
			else if((x<0)&&(y<0)) {
				System.out.println("Quadrante Q3");
			}
			else if((x>0)&&(y<0)) {
				System.out.println("Quadrante Q4");
			}
			System.out.println("Digite os valores das coordenadas X e Y: ");
			x = ler.nextInt();
			y = ler.nextInt();
		}
	
	}
}