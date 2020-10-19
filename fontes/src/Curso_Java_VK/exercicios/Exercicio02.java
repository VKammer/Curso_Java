package Curso_Java_VK.exercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Olá Candidato, insira seu nome:");
		String nome = sc.nextLine();
		
		System.out.println("Sr(a). " + nome + ", reside em Blumenau? S/N"); 
		String resposta1 = sc.nextLine();
		
		System.out.println("Sr(a). " + nome + ", tem conhecimento em JAVA? S/N"); 
		String resposta2 = sc.nextLine();
		
		System.out.println("Sr(a). " + nome + ", sabe trabalhar em equipe? S/N"); 
		String resposta3 = sc.nextLine();
		
		System.out.println("Sr(a). " + nome + ", foi indicado por alguem à empresa? S/N"); 
		String resposta4 = sc.nextLine();
		
		if ((resposta1.equalsIgnoreCase("S") && resposta2.equalsIgnoreCase("S") && resposta3.equalsIgnoreCase("S")) || resposta4.equalsIgnoreCase("S")) {
			System.out.println("Parabens " + nome + ", você foi contratado!!!");
		} else {
			System.out.println("Sentimos muito " + nome + ", não seguiremos com o processo seletivo.");
			
		}
		
		sc.close();
		
	}
	
}
