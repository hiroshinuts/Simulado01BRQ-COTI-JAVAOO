package contracts;

import entities.Autor;
import entities.Livro;

public interface IControle<T> {
	
	void abrirArquivo();

	void exportarDados(T obj);
	
	void fecharArquivo();



	
	

}
