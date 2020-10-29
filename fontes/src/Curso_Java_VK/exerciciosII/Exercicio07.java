package Curso_Java_VK.exerciciosII;

import java.util.Scanner;

public class Exercicio07 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String usuario = "Kammer";
		String senha = "12345678";
		String login = " ";
		String senhaLogin = " ";
// !true = false
		boolean entrou = false;
		while (!entrou || (login.equalsIgnoreCase(usuario) && senhaLogin.equals(senha))) {
			entrou = true;
			System.out.println("Login: ");
			login = sc.nextLine();
			System.out.println("Insira sua senha");
			senhaLogin = sc.nextLine();
			if (login.equalsIgnoreCase(usuario) && senhaLogin.equals(senha)) {
				System.out.println("Carregando... ...\nAcesso Valido");
				entrou = true;
				break;
			} else if (!login.equalsIgnoreCase(usuario)) {
				System.out.println("Usuario desconhecido para o banco de dados. Tente novamente.");
				entrou = false;
				continue;
				
			} else {
				System.out.println("Senha incorreta. Tente novamente.");
				entrou = false;
				continue;
			}
		}
		sc.close();
	}
	
}
