package Curso_Java_VK.Valores;

public class UtilizandoValores {
	
	public static void main(String[] args) {
		
		//tipos 
		System.out.println(1 + 1);//soma
		System.out.println(2 - 1);//subtração
		System.out.println(2 * 1);// multiplicação
		System.out.println(4 / 2);//divisão
		System.out.println(4 % 2);//mod (resto da divisão)
		
		int valorUm = 1;
		int valorDois = 2;
		int valorQuatro = 4;
		
		int soma1 = valorUm + valorUm;
		System.out.println("\nPrimeira Soma = " + soma1);
		
		int subtração1 = valorDois - valorUm;
		System.out.println("Primeira Subtração = " + subtração1);
		
		int multiplicação1 = valorDois * valorUm;
		System.out.println("Primeira Multiplicação = " + multiplicação1);
		
		int divisão1 = valorQuatro / valorDois;
		System.out.println("Primeira Divisão = " + divisão1);
		
		int mod1 = valorQuatro & valorDois;
		System.out.println("Primeiro Resto de divisão = " + mod1);
		
		//long - Inteiros maiores
		//Long - Inteiros maiores com funções de auxilio
		//double - decimais
		//Double - decimais com funções de auxilio
		//float - decimais maiores
		//Float - decimais maiores com funções de auxilio
		
		//long id = 10000000000000000L;
		//Long id2 = 10000000000000000L;
		//double nota = 9.5;
		Double nota2 = 9.5;
		//float peso = 83.6f;
		//Float peso2 = 83.6f;
		
		System.out.println(nota2.toString());
		
	}

}
