package Curso_Java_VK.teste;

import java.util.Scanner;

public class UtilizandoBlocoTeste {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {//tente executar
			System.out.println("Escreva sua idade:");
			int idade = Integer.parseInt(sc.nextLine());
			//...
			System.out.println("Sem erro");
			System.out.println(idade);
		} catch (Exception e) {
			//se der qualquer erro executa esse bloco
			e.printStackTrace();//escreve detalhes do erro
		} finally {
			//independente se der erro ou n�o executa esse bloco
			sc.close();
		}		
	}

}