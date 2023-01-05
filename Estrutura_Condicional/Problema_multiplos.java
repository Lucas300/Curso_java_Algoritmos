import java.text.DecimalFormat;
import java.util.Scanner;

public class Problema_multiplos {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		float  n1 , n2;
		
		System.out.print("O proimeiro numero interiro: ");
		n1 = ler.nextFloat();
		System.out.print("O segundo numero inteiro: ");
		n2 = ler.nextFloat();
		
		if(n1 > n2) {
			if(n1%n2 == 0) {
				System.out.print("São multiplos");
			}
			else{
				System.out.print("Não são multiplos");
				}
			}
		else if(n2 > n1) {
			if(n2%n1 == 0) {
				System.out.print("São multiplos");
			}
			else{
				System.out.print("Não são multiplos");
				}
			}
		}
	}