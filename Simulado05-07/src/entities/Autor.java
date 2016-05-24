package entities;

import java.util.Collection;

public class Autor {

	private Integer idAutor;
	private String nome;
	private Collection<Livro> livros;
	
	public Autor() {
		// TODO Auto-generated constructor stub
	}

	public Autor(Integer idAutor, String nome, Collection<Livro> livros) {
		this.idAutor = idAutor;
		this.nome = nome;
		this.livros = livros;
	}

	public Integer getIdAutor() {
		return idAutor;
	}

	public void setIdAutor(Integer idAutor) {
		this.idAutor = idAutor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Collection<Livro> getLivros() {
		return livros;
	}

	public void setLivros(Collection<Livro> livros) {
		this.livros = livros;
	}

	@Override
	public String toString() {
		return "Autor [idAutor=" + idAutor + ", nome=" + nome + ", livros=" + livros + "]";
	}
	
	
	
	
}
