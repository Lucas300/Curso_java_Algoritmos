import java.util.Scanner;

public class Problema_senha_fixa {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int  senha;
		
		System.out.println("Digite a senha ");
		senha = ler.nextInt();
		
		if(senha != 2002) {
			while(senha != 2002) {
				System.out.print("Senha invalida! tente novamente: ");
				senha = ler.nextInt();
			}
		}
		else {
			
		}
		System.out.println("Acesso permitido");
	}
}