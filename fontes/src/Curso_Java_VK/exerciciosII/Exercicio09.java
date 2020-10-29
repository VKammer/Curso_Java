package Curso_Java_VK.exerciciosII;

import java.util.Scanner;

public class Exercicio09 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean validação = false;
		
		do {
			System.out.println("Insira seu Nome:");
			String usuario = sc.nextLine();
				if (usuario.length() < 3) {
				System.out.println("Nome muito curto, digite novamente:");
				validação = false;
			} else {
				System.out.println("Nome armazenado com sucesso!");
				validação = true;
			}
			break;
		} while (!validação);
		
		validação = false;
		
		do {
			System.out.println("Insira sua idade:");
			int idade = Integer.parseInt(sc.nextLine());
			if (idade < 0 || idade > 150) {
				System.out.println("Idade inválida, digite novamente:");
				validação = false;
			} else {
				System.out.println("Idade armazenada com sucesso!");
				validação = true;
			}
			break;
		} while (!validação);
		
		validação = false;
		
		do {
			System.out.println("Informe seu salario:");
			int salario = Integer.parseInt(sc.nextLine());
			if (salario < 0) {
				System.out.println("Valor inválida, digite novamente:");
				validação = false;
			} else {
				System.out.println("Salario armazenado com sucesso!");
				validação = true;
			}
			break;
		} while (!validação);
		
		validação = false;
		
		sexo: do {
			System.out.println("Selecione o sexo:\n(F)eminino, (M)asculino ou (O)utro");
			String sexo = sc.next();
			switch (sexo.toUpperCase()) {
			case "F":
				System.out.println("Sexo armazenado com sucesso!");
				validação = true;
				break;
			case "M":
				System.out.println("Sexo armazenado com sucesso!");
				validação = true;
				break;
			case "O":
				System.out.println("Sexo armazenado com sucesso!");
				validação = true;
				break;
			default:
				System.out.println("Opção não armazenada, Selecione novamente");
				validação = false;
				continue sexo;
			
			}
		} while (!validação);
		
		validação = false;
		
		estadoCivil: do {
			System.out.println("Selecione o Estado Civil:\n(S)olteiro/a, (C)asado/a, (V)iuvo/a ou (D)ivorciado/a");
			String estadoCivil = sc.next();
			switch (estadoCivil.toUpperCase()) {
			case "S":
				System.out.println("Estado Civil armazenado com sucesso!");
				validação = true;
				break;
			case "C":
				System.out.println("Estado Civil armazenado com sucesso!");
				validação = true;
				break;
			case "V":
				System.out.println("Estado Civil armazenado com sucesso!");
				validação = true;
				break;
			case "D":
				System.out.println("Estado Civil armazenado com sucesso!");
				validação = true;
				break;
			default:
				System.out.println("Opção não armazenada, Selecione novamente");
				validação = false;
				continue estadoCivil;
				
			}
			
		} while (!validação);
		
		validação = false;
		sc.close();
	}
}

