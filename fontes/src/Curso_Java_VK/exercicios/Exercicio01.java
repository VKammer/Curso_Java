package Curso_Java_VK.exercicios;

import java.util.Scanner;

//contador de chamadas atendidas e tempo total
//apresentar tempo gasto nas ultimas X ligações.

public class Exercicio01 {
/*
	 public static void main(String[] args) {
	 
	 Scanner sc = new Scanner(System.in);
	
	 System.out.println("Insira o tempo da ultima chamada em minutos"); int
	 minutos = sc.nextInt();
	 
	 System.out.println("Insira o tempo da ultima chamada em minutos"); minutos =
	 minutos + sc.nextInt();
	 
	 System.out.println("Insira o tempo da ultima chamada em minutos"); minutos =
	 minutos + sc.nextInt();
	 
	 System.out.println("Tempo de atendimento: " + minutos);
	 
	 sc.close();
*/	 
//teste de logica.
/*
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Insira um numero: ");
		int valor = sc.nextInt();
		System.out.println("Agora resolva: ");
		System.out.println(
				"Quanto é o dobro do seu numero, somado a ao triplo dele mesmo e então dividido pela quinta parte do valor atual? ");
		int resultado = sc.nextInt();

		if (resultado == valor) {
			System.out.println("Você acertou!!");
		} else {
			System.out.println("Você errou");
		}

		sc.close();
*/
		
		/*
		Scanner sc = new Scanner(System.in);
		String usuario = "VKammer";
		String senha = "88884444";
		System.out.println("Login: ");
		String login = sc.nextLine();
		
		if  (login.equals(usuario)) {
			System.out.println("Bem vindo " + usuario + ": Insira sua senha" );
			String senhaLogin = sc.nextLine();
			if (senhaLogin.equals(senha)) {
				System.out.println("Carregando... ...\nAcesso Valido");
			} else {
				System.out.println("Senha incorreta...");
			}
				
			} else {
				System.out.println("Usuario desconhecido para o banco de dados.");
			}
		*/
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String usuario = "VKammer";
		String senha = "88884444";
		System.out.println("Login: ");
		String login = sc.nextLine();
		System.out.println("Insira sua senha");
		String senhaLogin = sc.nextLine();
		
		if (login.equals(usuario) && senhaLogin.equals(senha)) {
			System.out.println("Carregando... ...\nAcesso Valido");
		} else if (!login.equals(usuario)) {
			System.out.println("Usuario desconhecido para o banco de dados.");
		} else {
			System.out.println("Senha incorreta");
		}
		sc.close();
		
	}
	
}
