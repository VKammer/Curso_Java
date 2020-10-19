package Curso_Java_VK.string;

public class UtilizandoString {
	
	public static void main(String[] args) {
		
		String nome = "Vinicius";
		//adicionar conteudo a primeira variavel
		nome = nome + ""; //Concatenar (inserir conteudo na propria variavel)
		
		String sobrenome = "";
		sobrenome = "Kammer";
		
		System.out.println(nome);
		System.out.println(sobrenome + " \n");
		
		System.out.println("My name is " + nome + " " + sobrenome);//concatenar no print
		System.out.println(nome.concat(" ").concat(sobrenome)); //concatenando explicitamente
		
		String nomeCompleto = "Vinicius Kammer"; //unica linha
		int idade = 22;
		String cidade = "Curitiba";
		
		System.out.println("Meu nome é " + nomeCompleto + " e tenho " + idade + " anos de idade. Vim de " + cidade + ".");
		System.out.println("Meu nome é ".concat(nomeCompleto));
		
		
	}

}
