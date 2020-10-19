package Curso_Java_VK.exercicios;

import java.util.Scanner;

//1 - Faça o menu: APTO A DIRIGIR.
//No primeiro menu:
//Pergunte o nome.
//Pergunte a idade
//Pergunte se a pessoa sabe dirigir
//Pergunte se a pessoa é parente do dono da autoescola
//Se a idade da pessoa for maior de 18 anos e a pessoa sabe dirigir OU se a pessoa é parente do dono da Autoescola:
//Escreva se a pessoa está apta ou não para dirigir
//2- Faça o menu: TURMAS DISPONIVEIS
//Pergunte a quantidade de pessoas prestes a estudar para tirar a carteira
//Se a quantidade de pessoas for menor ou igual a 2 escreva se há ou não vagas

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("***********BEM VINDO(A)***********");
		System.out.println("        Auto Escola Java");
		System.out.println("***************MENU***************");
		System.out.println("1 - APTO A DIRIGIR");
		System.out.println("2 - TURMAS DISPONIVEIS");
		int menu = Integer.parseInt(sc.nextLine());
		
		if (menu == 1) {
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
			
		} else if (menu == 2) {
			System.out.println("Quantos alunos estão prestes a cursar para tirar a carteira de motorista?");
			int alunos = Integer.parseInt(sc.nextLine());
			if (alunos <= 2) {
				System.out.println("Há vagas!!!");
			} else {
				System.out.println("Não há vagas...");
			}
		} else {
			System.out.println("Opção Incorreta");
		}
		
		sc.close();
		
		
	}
	
}
