package principal;

import java.util.ArrayList;

import controls.ControleAutor;
import controls.ControleLivro;
import entities.Autor;
import entities.Livro;

public class Main {
	
	public static void main(String[] args) {
		
		Autor a = new Autor();
		
		a.setIdAutor(1);
		a.setNome("Hiro");
		a.setLivros(new ArrayList<Livro>());
		a.getLivros().add(new Livro(1, "Coca-Cola", "Bla bla bla resumo", "Amor por coca"));
		a.getLivros().add(new Livro(1, "Livro2", "Bla bla bla resumo", "Amor por Livro"));
		a.getLivros().add(new Livro(1, "Livro3", "Bla bla bla resumo", "Amor"));
		
		System.out.println(a);
		
		
		
		ControleAutor ca = new ControleAutor();
		ca.abrirArquivo();
		ca.exportarDados(a);
		ca.fecharArquivo();
		System.out.println("Dados Gravados");
		

		Livro l = new Livro();
		l.setIdLivro(1);
		l.setAutor(a);
		l.setGenero("Romance");
		l.setResumo("Bla Bla bla");
		l.setTitulo("TITULO");
		
		ControleLivro cl = new ControleLivro();
		cl.abrirArquivo();
		cl.exportarDados(l);
		cl.fecharArquivo();
		System.out.println("Dados do Livro Gravados Com Sucesso");
		
	}

}
