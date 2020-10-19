package Curso_Java_VK.condicoes;

import java.util.Scanner;

public class UtilizandoSelecao {
/*	
	public static void main(String[] args) {
		
		if (true || true) {
			System.out.println("Entou 1");
		
		}
		
		if (true && true) {
			System.out.println("Entrou 2");
		}
		
		if (1 == 1) {
			System.out.println("Entrou 3");
		} else if (2 == 2) {
			System.out.println("Entrou 4");
		} else {
			System.out.println("Entou 5");
		}
		
	}

}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escolha uma opção: ");
		System.out.println("1 - Cadastro de pessoas");
		System.out.println("2 - Cadastro de produto");
		int opcao = Integer.parseInt(sc.nextLine());
		
		if (opcao == 1) {
			System.out.println("Entou no cadastro de pessoas");
		} else if (opcao == 2) {
			System.out.println("Entou no cadastro de produto");
		} else {
			System.out.println("Nenhuma opção valida");
		}
		
		sc.close();
	}
 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Lanches JAVA");
		
		System.out.println("Você ganha desconto da Proway? S/N");
		String descontoProway = sc.nextLine();
		
		System.out.println("Vai querer o Prato do Dia? S/N");
		String pratoDoDia = sc.nextLine();
		
		if (pratoDoDia.equalsIgnoreCase("S")) {
			System.out.println("Desconto do Prato do Dia");
		} else if (descontoProway.equalsIgnoreCase("S")){
			System.out.println("Desconto da Proway");
		} else if (!descontoProway.equalsIgnoreCase("S")){
			System.out.println("Não possui desconto da Proway");
		} else {
			System.out.println("Sem desconto");
		}
		
		sc.close();
		
	}
	
	
}

