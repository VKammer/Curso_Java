package Curso_Java_VK.loop;

import java.util.Scanner;

public class UtilizandoLoop3 {

	public static void main(String[] args) {
		
		int idade = 0;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Escreva sua idade:");
			idade = Integer.parseInt(sc.nextLine());
		} while (idade < 18);
		
		sc.close();
	}
}
