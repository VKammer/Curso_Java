package Curso_Java_VK.exercicios;

import java.util.Scanner;
import java.util.Arrays;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva a quantidade de alunos a ser inserida");
		int quantidadeAlunos = Integer.parseInt(sc.nextLine());
		
		String[] vetorNomeAluno = new String[quantidadeAlunos];
		
		for(int i = 0; i < quantidadeAlunos; i++) {
			System.out.println("Escreva o nome do aluno " + (i+1));
			vetorNomeAluno[i] = sc.nextLine();
		}
		Arrays.sort(vetorNomeAluno);
		for(String aluno : vetorNomeAluno) {
			System.out.println("Lista de alunos");
			System.out.println(aluno);
		}
		
		sc.close();
	}
}
