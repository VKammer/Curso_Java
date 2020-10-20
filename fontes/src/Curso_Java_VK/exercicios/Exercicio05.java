package Curso_Java_VK.exercicios;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String usuario = "Kammer";
		String senha = "12345678";
		String login = " ";
		String senhaLogin = " ";
// !true = false
		boolean entrou = false;
		myLogin: while (!entrou || (login.equals(usuario) && senhaLogin.equals(senha))) {
			entrou = true;
			System.out.println("Login: ");
			login = sc.nextLine();
			System.out.println("Insira sua senha");
			senhaLogin = sc.nextLine();
			if (login.equals(usuario) && senhaLogin.equals(senha)) {
				System.out.println("Carregando... ...\nAcesso Valido");
				int contador = 0;
				int tempoTotal = 0;
				do {
					System.out.println("Olá " + usuario + ", escolha a opção desejada:");
					System.out.println("1 - Registrar nova chamada");
					System.out.println("2 - Tempo total gasto em chamadas");
					System.out.println("3 - Logout");
					System.out.println("4 - Sair");
					int menu = Integer.parseInt(sc.nextLine());
					switch (menu) {
					case 1:
						contador++;
						System.out.println("Insira o tempo da ultima chamada em minutos:");
						tempoTotal = tempoTotal + Integer.parseInt(sc.nextLine());
						break;
					case 2:
						System.out.println("Foram atendidas " + contador + " chamadas");
						System.out.println("O tempo total gasto foi " + tempoTotal + " minutos");
						continue;
					case 3:
						continue myLogin;
					case 4:
						break myLogin;
					default:
						break;
					}
				} while (true);
				
			} else if (!login.equals(usuario)) {
				System.out.println("Usuario desconhecido para o banco de dados. Tente novamente.");
				continue;
				
			} else {
				System.out.println("Senha incorreta. Tente novamente.");
				continue;
			}
		}
		sc.close();
	}
}
