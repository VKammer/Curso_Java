package Curso_Java_VK.condicoes;

import java.util.Scanner;

public class SwitchCase {
	/*
	 * public static void main(String[] args) {
	 * 
	 * Scanner sc = new Scanner(System.in);
	 * System.out.println("***************MENU***************");
	 * System.out.println("1 - Produto"); System.out.println("2 - Pessoa"); int menu
	 * =sc.nextInt();
	 * 
	 * switch (menu) { case 1: System.out.println("Cadastro de produto"); break;
	 * case 2: System.out.println("Cadastro de pessoas"); break; default:
	 * System.out.println("Nenhuma opção valida"); break; }
	 * 
	 * sc.close();
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("***********BEM VINDO(A)***********");
		System.out.println("        Auto Escola Java");
		System.out.println("***************MENU***************");
		System.out.println("1 - APTO A DIRIGIR");
		System.out.println("2 - TURMAS DISPONIVEIS");
		int menu = Integer.parseInt(sc.nextLine());

		switch (menu) {
		case 1:
			System.out.println("Olá, Insira abaixo seu nome:");
			String nome = String.valueOf(sc.nextLine());
			System.out.println("Insira sua idade:");
			int idade = Integer.parseInt(sc.nextLine());
			System.out.println("Já sabe dirigir? S/N");
			String dirige = String.valueOf(sc.nextLine());
			System.out.println("Conheceu a Auto Escola por possuir parentesco com o dono? S/N");
			String parente = String.valueOf(sc.nextLine());

			if (((idade >= 18) && dirige.equalsIgnoreCase("S")) || parente.equalsIgnoreCase("S")) {
				System.out.println("Parabens " + nome + ", você está apto para dirigir");
			} else {
				System.out.println("Desculpe " + nome + ", você não está apto para dirigir");
			}
		
			break;
			
		case 2:
			System.out.println("Quantos alunos estão prestes a cursar para tirar a carteira de motorista?");
			int alunos = Integer.parseInt(sc.nextLine());
			if (alunos <= 2) {
				System.out.println("Há vagas!!!");
			} else {
				System.out.println("Não há vagas...");
			}
			
			break;
		
		case 3:
			System.out.println("Saindo... \nObrigado por ultilizar nosso sistema");
			break;

		default:
			System.out.println("Opção Incorreta");
			
			break;
		}
		

		sc.close();

	}

}
