import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Problema_Consumo {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.000");
		
		Float distancia, gasto, consumo;
		
		System.out.print("Distancia percorrida: ");
		distancia = ler.nextFloat();
		System.out.println("Combustivel gasto: ");
		gasto = ler.nextFloat();
		System.out.println("Consumo Medio = "+df.format(distancia/gasto));	
	}
}