package Curso_Java_VK.scanner;

import java.util.Scanner;

public class PegandoInformacoes {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva seu nome:");
		//String nome = sc.next(); // Puxa a primeira informação do Scan
		String nome = sc.nextLine(); // Puxa a linha inteira
		
		System.out.println("Oi " + nome);
		System.out.println("Tudo bem?");
		//System.out.println("Hallo " + nome + "\nWie gets?");
		
		/*
		Scanner pr = new Scanner(System.in);
		System.out.println("Escreva o Primeiro valor:");
		int primeiro = pr.nextInt();
		
		
		Scanner seg = new Scanner(System.in);
		System.out.println("Escreva o Segundo valor:");
		int segundo = seg.nextInt();
		
		System.out.println(primeiro - segundo);
		*/
		
		System.out.println("Escreva o ano de nascimento:");
		int nascimento = sc.nextInt();
		int anoAtual = 2020;
		
		//Scanner seg = new Scanner(System.in);
		//System.out.println("Escreva o ano atual:");
		//int segundo = seg.nextInt();
		
		System.out.println("Você tem " + (anoAtual - nascimento) + " anos de idade.");
		
		sc.close();
		
	}

}
