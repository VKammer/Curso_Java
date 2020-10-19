package Curso_Java_VK.exercicios;

import java.util.Scanner;

// Menu de cafeteira, opções:
// P - reto
// B - ranco
// C - hocolate

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String P = "Café Preto";
		String B = "Café Branco (com Leite)";
		String C = "Chocolate Quente";
		String entrega = "Seu pedido está pronto, pode pegar o seu ";
		System.out.println("***********BEM VINDO(A)***********");
		System.out.println("          Cafeteira JAVA");
		System.out.println("***************MENU***************");
		System.out.println("Escolha a sua Bebida:");
		System.out.println("P - " + P);
		System.out.println("B - " + B);
		System.out.println("C - " + C);
		String menu = sc.nextLine();
		
		switch (menu.toUpperCase()) {
		case "P":
			System.out.println("Preparando, aguarde... \n...\n...\n...");
			System.out.println(entrega + P);
			break;
		case "B":
			System.out.println("Preparando, aguarde... \n...\n...\n...");
			System.out.println(entrega + B);
			break;
		case "C":
			System.out.println("Preparando, aguarde... \n...\n...\n...");
			System.out.println(entrega + C);
			break;
		default:
			System.out.println("Pedido invalido");
			break;
		
		}
		
		sc.close();
	}
	
}
