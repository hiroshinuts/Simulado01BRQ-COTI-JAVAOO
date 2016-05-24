package entities;

public class Pessoa {
	
	private String nome;
	private String cpf;
	
	public Pessoa() {
		// TODO Auto-generated constructor stub
	}

	public Pessoa(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + "]";
	}
	
	@Override
	public int hashCode() {
		return cpf.hashCode();
	}
	

}
