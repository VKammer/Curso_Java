package Curso_Java_VK.parse;

public class ParceValores {
//Bug com Scanner para Java 1.8 ou inferior: converter o nextLine	
	public static void main(String[] args) {
		
		System.out.println(Double.parseDouble("10.1") == 10.1); //String para Double
		//System.out.println(Double.parseDouble("oi") == 10.1); //Erro: tentativa de texto para Double 
		System.out.println(Integer.parseInt("1") == 1);
		//System.out.println(Integer.parseInt("1.1") == 1.1); // Erro: tentativa de Double para Inteiro
		System.out.println(String.valueOf(10)); //conversão para String, tudo é válido
		
	}
}
