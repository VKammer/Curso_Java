//Contem o nome do pacote... caso estiver dentro de um pacote
package Curso_Java_VK.string;
// Import library NATIVA until.Scanner
import java.util.Scanner;
//import java.util.*; // * importa todas classes dentro do pacote anterior

public class ComparandoString {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String nomeCadastrado = "Vinicius";
		
		System.out.println("Escreva seu nome:");
		String nome = sc.nextLine();
		
		System.out.println("O nome existe?\n" + (nomeCadastrado.equals(nome)));
		//abaixo equals ignora "case" (maiusculo e minusculo).
		System.out.println("O nome existe?\n" + (nomeCadastrado.equalsIgnoreCase(nome)));
		
		sc.close();
	}

}