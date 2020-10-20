package Curso_Java_VK.exercicios;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		double horasExtras = 0;
		Scanner sc = new Scanner(System.in);
		myLoop: while (true) {
			System.out.println("***************MENU***************");
			System.out.println("1 - Cadastrar Horas extras");
			System.out.println("2 - Total de horas extras no mês");
			System.out.println("3 - Sair");
			int menu = Integer.parseInt(sc.nextLine());
			
			switch (menu) {
			case 1:
				System.out.println("Cadastrar Horas extras");
				System.out.println("Insira os minutos extras do dia");
				horasExtras = horasExtras + Integer.parseInt(sc.nextLine());
				continue;
				
			case 2:
				System.out.println("Total de horas extras no mês");
				double horasTotais = horasExtras / 60;
				System.out.println("Total de horas extras registradas = " + (horasTotais) + " Horas");
				break;
				
			case 3:
				break myLoop;
			
			default:
				System.out.println("Opção Invalida");
				continue;
			}
				
			System.out.println("1 - Sair");
			System.out.println("2 - Voltar");
			menu = Integer.parseInt(sc.nextLine());
			switch (menu) {
			case 1:
				break myLoop;
			case 2:
				continue;
			default:
				System.out.println("Opção Invalida");
				continue;
				
			
			}
		}
		sc.close();
	}
}
