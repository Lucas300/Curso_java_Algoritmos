import java.text.DecimalFormat;
import java.util.Scanner;

public class Problema_Glicose{

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
	
		float glicose;
		
		System.out.print("Digite a media da glicose: ");
		glicose = ler.nextFloat();
		
		if(glicose <= 100){
			System.out.println("Classificação: Normal");
		}
		else if((glicose>100) && (glicose <= 140)){
			System.out.println("Classificação: elevada");
		}
		else {
			System.out.println("Classificação: Diabetes");
		}
	}
}