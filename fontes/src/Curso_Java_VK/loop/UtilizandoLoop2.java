package Curso_Java_VK.loop;

import java.util.Scanner;

public class UtilizandoLoop2 {
	/*
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Você é maior de idade");
		int idade = Integer.parseInt(sc.nextLine());
		while (idade < 18)
			System.out.println("Você é maior de idade");
			idade = Integer.parseInt(sc.nextLine());
		
		sc.close();
	}
*/
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		myLoop: while (true) {
			System.out.println("1 - Cadastro de Produto");
			System.out.println("2 - Cadastro de Pessoa");
			System.out.println("3 - Sair");
			int menu = Integer.parseInt(sc.nextLine());
			
			switch (menu) {
			case 1:
				System.out.println("Cadastro de Produto");
				break;
				
			case 2:
				System.out.println("Cadastro de Pessoa");
				break;
				
			case 3:
				break myLoop;
			
			default:
				System.out.println("Opção Invalida");
				continue;
			}
				
			System.out.println("1 - Sair");
			System.out.println("2 - Voltar");
			menu = Integer.parseInt(sc.nextLine());
			switch (menu) {
			case 1:
				break myLoop;
			case 2:
				continue;
			default:
				System.out.println("Opção Invalida");
				continue;
				
			
			}
		}
		sc.close();
	}
}
