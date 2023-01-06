import java.text.DecimalFormat;
import java.util.Scanner;

public class Problema_Aumento {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		float  salario,aumento,salario_novo;
		int porcentagem;
		System.out.print("Digite o Salario da pessoa: ");
		salario = ler.nextFloat();
		
		if(salario <= 1000.00) {
			salario_novo = (float)(salario*(1.2));
			porcentagem = 20;
			aumento = (float)(salario*(0.2));
		}
		else if ((salario > 1000.00)&&(salario <= 3000.00)) {	
			salario_novo = (float)(salario*1.15);
			porcentagem = 15;
			aumento = (float)(salario*(0.15));
		}
		else if(( salario > 3000.00 )&&(salario <= 8000.00)) {
			salario_novo = (float)(salario*1.1);
			porcentagem = 10;
			aumento = (float)(salario*(0.1));
		}
		else {
			salario_novo = (float)(salario*1.050);
			porcentagem = 5;
			aumento = (float)(salario*(0.050));
		}
		System.out.println("Novo salario = R$: "+df.format(salario_novo));
		System.out.println("Aumento = R$: "+df.format(aumento));
		System.out.println("Porcentagem = "+ porcentagem + "%");
		}
	}