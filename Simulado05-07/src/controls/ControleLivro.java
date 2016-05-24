package controls;

import java.io.File;
import java.io.FileWriter;

import contracts.IControle;
import entities.Autor;
import entities.Livro;

public class ControleLivro implements IControle<Livro> {

	private FileWriter arq;

	@Override
	public void abrirArquivo() {

		try {
			arq = new FileWriter(new File("c:\\temp\\livros.txt"), true);
		} catch (Exception e) {
			System.out.println("Erro: " + e.getStackTrace());
		}

	}

	@Override
	public void fecharArquivo() {

		try {
			arq.close();
		} catch (Exception e) {
			System.out.println("Erro: " + e.getStackTrace());
		}

	}



	@Override
	public void exportarDados(Livro l) {

		try {
			arq.write("\nDados do Livro");
			arq.write("\nId do Livro...........:" + l.getIdLivro());
			arq.write("\nTitulo do Livro.......: " + l.getTitulo());
			arq.write("\nResumo do Livro.......:" + l.getResumo());
			arq.write("\nGenero Do Livro.......:" + l.getGenero());
			arq.write("\nAutor " + l.getAutor());
			arq.write("\n");
		} catch (Exception e) {
			System.out.println("Erro" + e.getMessage());
		}
		
	}

}
