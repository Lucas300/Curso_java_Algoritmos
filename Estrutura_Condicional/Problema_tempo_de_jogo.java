import java.util.Scanner;

public class Problema_tempo_de_jogo {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int  hora_inicial,hora_final,duracao;
		
		System.out.print("O proimeiro numero interiro: ");
		hora_inicial = ler.nextInt();
		
		System.out.print("O proimeiro numero interiro: ");
		hora_final = ler.nextInt();
		
		if(hora_inicial > hora_final) {
			duracao = (24-(hora_inicial-hora_final));
			System.out.println("O jogo durou " + duracao + " Hora(s)");
		}
		else if(hora_inicial == hora_final)
		{
			System.out.println("O jogo durou 24 Horas");
		}
		else {
			duracao = hora_final - hora_inicial;
			System.out.println("O jogo durou "+ duracao +" Horas");
		} 	
	}
}