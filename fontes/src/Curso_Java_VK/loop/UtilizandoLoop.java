package Curso_Java_VK.loop;

import java.util.Scanner;

public class UtilizandoLoop {
	
	/* Loop: fa�a "do" enquanto a condi��o for "while"
			do {
				System.out.println("Insira o tempo da ultima chamada em minutos:");
				minutos = minutos + sc.nextInt();
				contador ++;
			} while (contador < 10);
	*/
	
	
	public static void main(String[] args) {
		int contador = 1;
		Scanner sc = new Scanner(System.in);
		
		String usuario = "Kammer";
		String senha = "12345678";
		int minutos = 0;
		String login = " ";
		String senhaLogin = " ";
		
		do {
			System.out.println("Login: ");
			login = sc.nextLine();
			System.out.println("Insira sua senha");
			senhaLogin = sc.nextLine();
			if (login.equals(usuario) && senhaLogin.equals(senha)) {
				System.out.println("Carregando... ...\nAcesso Valido");
				System.out.println("Ol�, " + usuario + ", quantas chamadas foram atendidos hoje?");
				int chamadas = sc.nextInt();
				do {
					System.out.println("Insira o tempo da chamada " + contador + " em minutos:");
					minutos = minutos + sc.nextInt();
					contador ++;
				} while (contador <= chamadas);
				System.out.println("Tempo total nas liga��es do dia = " + minutos + " minutos");
			} else if (!login.equals(usuario)) {
				System.out.println("Usuario desconhecido para o banco de dados. Tente novamente.");
			} else {
				System.out.println("Senha incorreta. Tente novamente.");
			}
		} while (!(login.equals(usuario) && senhaLogin.equals(senha)));
		
				
		sc.close();
		//teste
		
	}

}
