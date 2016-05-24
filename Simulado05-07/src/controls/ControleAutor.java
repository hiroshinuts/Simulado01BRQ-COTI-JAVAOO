package controls;

import java.io.File;
import java.io.FileWriter;

import contracts.IControle;
import entities.Autor;
import entities.Livro;

public class ControleAutor implements IControle<Autor> {

	private FileWriter arq;

	@Override
	public void abrirArquivo() {

		try {
			arq = new FileWriter(new File("c:\\temp\\autores.txt"), true);
		} catch (Exception e) {
			System.out.println("Erro: " + e.getStackTrace());
		}

	}



	@Override
	public void exportarDados(Autor a) {

		try {

			arq.write("\nDados do Autor");
			arq.write("\nId do Autor..........:" + a.getIdAutor());
			arq.write("\nNome do Autor........: " + a.getNome());
			arq.write("\nLivros...............:" + a.getLivros());
			arq.write("\n");
		} catch (Exception e) {
			System.out.println("Erro" + e.getMessage());
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
}
