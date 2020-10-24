package Curso_Java_VK.orientação_objetos;

import java.util.Scanner;

public class Exercicio01 {
		private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		String retornoNome = ("Olá ");
		String retornoIdade = ("Você tem ");

			while (true) {
				try {
					String nome = perguntaNome();
					nome = Exercicio01.perguntaNome();
					retornoNome = retornoNome + nome + ", prazer em conhece-lo.";


					int idade = perguntaIdade();
					idade = Exercicio01.perguntaIdade();
					retornoIdade = retornoIdade + idade + " anos.";
					break;
				} catch (Exception e) {
					
				}
				System.out.println(retornoNome);
				System.out.println(retornoIdade);
				sc.close();
		}
		
	}
	private static String perguntaNome() {
		String nome = "";
		System.out.println("Escreva a seu nome:");
		nome = sc.nextLine();
		return nome;
	}
	private static int perguntaIdade() {
		int idade = 0;
		System.out.println("Escreva a sua idade:");
		idade = Integer.parseInt(sc.nextLine());
		return idade;
	}
}
