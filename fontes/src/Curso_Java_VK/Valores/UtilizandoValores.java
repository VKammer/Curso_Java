package Curso_Java_VK.Valores;

public class UtilizandoValores {
	
	public static void main(String[] args) {
		
		//tipos 
		System.out.println(1 + 1);//soma
		System.out.println(2 - 1);//subtra��o
		System.out.println(2 * 1);// multiplica��o
		System.out.println(4 / 2);//divis�o
		System.out.println(4 % 2);//mod (resto da divis�o)
		
		int valorUm = 1;
		int valorDois = 2;
		int valorQuatro = 4;
		
		int soma1 = valorUm + valorUm;
		System.out.println("\nPrimeira Soma = " + soma1);
		
		int subtra��o1 = valorDois - valorUm;
		System.out.println("Primeira Subtra��o = " + subtra��o1);
		
		int multiplica��o1 = valorDois * valorUm;
		System.out.println("Primeira Multiplica��o = " + multiplica��o1);
		
		int divis�o1 = valorQuatro / valorDois;
		System.out.println("Primeira Divis�o = " + divis�o1);
		
		int mod1 = valorQuatro & valorDois;
		System.out.println("Primeiro Resto de divis�o = " + mod1);
		
		//long - Inteiros maiores
		//Long - Inteiros maiores com fun��es de auxilio
		//double - decimais
		//Double - decimais com fun��es de auxilio
		//float - decimais maiores
		//Float - decimais maiores com fun��es de auxilio
		
		//long id = 10000000000000000L;
		//Long id2 = 10000000000000000L;
		//double nota = 9.5;
		Double nota2 = 9.5;
		//float peso = 83.6f;
		//Float peso2 = 83.6f;
		
		System.out.println(nota2.toString());
		
	}

}
