package Curso_Java_VK.exerciciosII;

import java.util.Scanner;

public class Exercicio02 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] vetor = new int[10];
		int resultado = 0;
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("Escreva o " + (i + 1) + "º valor");
			vetor[i] = sc.nextInt();
			if (i < (vetor.length))
			resultado = resultado + vetor[i];
			System.out.println("O resultado da soma é: " + resultado);
			
		}
		
		System.out.println("O resultado da soma é: " + resultado);
		
		sc.close();
	}

}
