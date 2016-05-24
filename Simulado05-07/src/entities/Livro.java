package entities;

public class Livro {

	private Integer idLivro;
	private String titulo;
	private String resumo;
	private String genero;
	private Autor autor;
	
	public Livro() {
		// TODO Auto-generated constructor stub
	}

	public Livro(Integer idLivro, String titulo, String resumo, String genero) {
		this.idLivro = idLivro;
		this.titulo = titulo;
		this.resumo = resumo;
		this.genero = genero;
	}

	public Livro(Integer idLivro, String titulo, String resumo, String genero, Autor autor) {
		this(idLivro, titulo, resumo, genero);
		this.autor = autor;
	}

	public Integer getIdLivro() {
		return idLivro;
	}

	public void setIdLivro(Integer idLivro) {
		this.idLivro = idLivro;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getResumo() {
		return resumo;
	}

	public void setResumo(String resumo) {
		this.resumo = resumo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Livro [idLivro=" + idLivro + ", titulo=" + titulo + ", resumo=" + resumo + ", genero=" + genero
				+ ", autor=" + autor + "]";
	}
	
	
	
	
}
