package Curso_Java_VK.exerciciosII;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean notaValida = false;
		
		
		do {
			System.out.println("Insira uma nota de 0 a 10:");
			double nota = sc.nextDouble();
			if (nota >= 0 && nota <= 10) {
				notaValida = true;
			} else {
				notaValida = false;
				System.out.println("Nota inválida, digite novamente:");
			}
			break;
		} while (!notaValida);
		
		sc.close();
	}
}
