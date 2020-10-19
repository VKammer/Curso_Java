package Curso_Java_VK.condicoes;

import java.util.Scanner;

public class ComparandoInformacoes {
	
	public static void main(String[] args) {
		/*
		Scanner sc = new Scanner(System.in);
		String nomeCadastrado = "Vinicius";
		
		System.out.println("Escreva seu nome:");
		String nome = sc.nextLine();
		
		System.out.println("O nome existe? ...comparando com Equals");
		
		if (nomeCadastrado.equals(nome)) {
			System.out.println("Sim");
		} else {
			System.out.println("Não");
		}
		
		System.out.println("O nome existe? ...comparando com EqualsIgnoreCase");
		
		if (nomeCadastrado.equalsIgnoreCase(nome)) {
			System.out.println("Sim");
		} else {
			System.out.println("O nome não se encontra no banco de dados");
		}
		*/
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Escreva seu nome:");
		String nomeConvidado = sc.nextLine();
		System.out.println("Digite sua idade:");
		int idade = sc.nextInt();
		
		if (idade >= 18) {
			System.out.println("Seja bem vindo " + nomeConvidado + "!!!\nAproveite a festa...");
		} else {
			System.out.println("Desculpa " + nomeConvidado + "...\nVocê não pode entrar!");
		}
		
		sc.close();
	}

}