package Curso_Java_VK.exerciciosII;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean senhaValida = false;
		
		do {
			System.out.println("Insira um nome de usuario:");
			String usuario = sc.nextLine();
			System.out.println("Insira uma senha (a senha deve diferir do nome de usuario:");
			String senha = sc.nextLine();
			if (usuario.equals(senha)) {
				System.out.println("Senha inválida, digite novamente:");
				senhaValida = false;
			} else {
				System.out.println("Login criado com sucesso!");
				senhaValida = true;
			}
			break;
		} while (!senhaValida);
		
		sc.close();
	}
}
