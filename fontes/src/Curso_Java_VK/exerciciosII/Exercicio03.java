package Curso_Java_VK.exerciciosII;

import java.util.Scanner;
import java.util.Arrays;

public class Exercicio03 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira a quantidade de numeros a serem comparados:");
		int N = sc.nextInt();
		int[] vetor = new int[N];
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("Escreva o " + (i + 1) + "º valor");
			vetor[i] = sc.nextInt();
		}
		Arrays.sort(vetor);
		System.out.println("O maior valor inserido foi:" + vetor[(N - 1)]);
		
		sc.close();
	}

}
