import java.util.Scanner;

public class Problema_tabuada{

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n;
		System.out.print("Deseja a tabuada para qual valor? ");
		n = ler.nextInt();
		
		for(int contador=1;contador <=10;contador++) {
			System.out.println(n +" X "+contador + " = " + (n*contador));
		}	
	}
}