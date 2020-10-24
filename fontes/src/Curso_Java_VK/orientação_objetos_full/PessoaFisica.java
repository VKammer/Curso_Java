package Curso_Java_VK.orientação_objetos_full;

public class PessoaFisica extends Pessoa {
	
	private long cpf;

	public long getCpf() {
		return cpf;
		//+777
		
		//admin
		//editor
		//leitor
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	
	//sobrecarga
	/*
	public void setCpf(String cpf) {
		this.cpf = Long.parseLong(cpf.replace(".", "").replace("-", "").replace("/", "").trim());
	}
	*/
	
	//sobrescrita...
	/*
	@Override
	public void setNome(String nome) {
		//super.setNome("Testem assim");
		super.setNome(nome);
	}
	 */
}