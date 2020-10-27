package Curso_Java_VK.exerciciosII;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o valor a ser potenciado:");
		int x = Integer.parseInt(sc.nextLine());
		System.out.println("Informe o valor da potencia:");
		int y = Integer.parseInt(sc.nextLine());
		
		for (int i = 1; i < y; i++) {
			x *= x;
		}
		
		System.out.println("O resultado é = " + x);
			
		sc.close();
		
	}
}
