package Curso_Java_VK.exercicios;

import java.util.Scanner;

//1 - Fa�a o menu: APTO A DIRIGIR.
//No primeiro menu:
//Pergunte o nome.
//Pergunte a idade
//Pergunte se a pessoa sabe dirigir
//Pergunte se a pessoa � parente do dono da autoescola
//Se a idade da pessoa for maior de 18 anos e a pessoa sabe dirigir OU se a pessoa � parente do dono da Autoescola:
//Escreva se a pessoa est� apta ou n�o para dirigir
//2- Fa�a o menu: TURMAS DISPONIVEIS
//Pergunte a quantidade de pessoas prestes a estudar para tirar a carteira
//Se a quantidade de pessoas for menor ou igual a 2 escreva se h� ou n�o vagas

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
			System.out.println("Ol�, Insira abaixo seu nome:");
			String nome = String.valueOf(sc.nextLine());
			System.out.println("Insira sua idade:");
			int idade = Integer.parseInt(sc.nextLine());
			System.out.println("J� sabe dirigir? S/N");
			String dirige = String.valueOf(sc.nextLine());
			System.out.println("Conheceu a Auto Escola por possuir parentesco com o dono? S/N");
			String parente = String.valueOf(sc.nextLine());
			
			if (((idade >= 18) && dirige.equalsIgnoreCase("S")) || parente.equalsIgnoreCase("S")) {
				System.out.println("Parabens " + nome + ", voc� est� apto para dirigir");
			} else {
				System.out.println("Desculpe " + nome + ", voc� n�o est� apto para dirigir");
			}
			
		} else if (menu == 2) {
			System.out.println("Quantos alunos est�o prestes a cursar para tirar a carteira de motorista?");
			int alunos = Integer.parseInt(sc.nextLine());
			if (alunos <= 2) {
				System.out.println("H� vagas!!!");
			} else {
				System.out.println("N�o h� vagas...");
			}
		} else {
			System.out.println("Op��o Incorreta");
		}
		
		sc.close();
		
		
	}
	
}
