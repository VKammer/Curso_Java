package Curso_Java_VK.operadores;

import java.util.Scanner;

public class TesteOperadoresLogicos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int valorSorteado = 5;
		String nomeVencedor = "k";
		
		System.out.println("Digite seu nome");
		String nome = sc.nextLine();
		
		System.out.println("Escolha um numero");
		int numeroEscolhido = Integer.parseInt(sc.nextLine());
		
		/*
		if (valorSorteado == numeroEscolhido && idade >= idadeMinima) {
			System.out.println("Parabens, ganhou o sorteio!!");
		} else {
			System.out.println("Não ganhou, tente novamente.");
		}
		*/
		
		if (valorSorteado == numeroEscolhido || nome.toLowerCase().contains(nomeVencedor)) {
			System.out.println("Parabens, ganhou o sorteio!!");
		} else {
			System.out.println("Não ganhou, tente novamente.");
		}
		sc.close();
	}
	
}
