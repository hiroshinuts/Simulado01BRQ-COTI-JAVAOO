package principal;

import controls.ControleAluno;
import entities.Aluno;

public class Main {

	public static void main(String[] args) {

		Aluno a = new Aluno();
		a.setIdAluno(1);
		a.setNome("Rafael");
		Double notas[] = {8.6, 10.0, 7.5, 9.0};
		a.setNotas(notas);

		
		ControleAluno ca = new ControleAluno();
		System.out.println(ca.obterMedia(a));
		System.out.println(ca.obterSituacao(a));
		
		
	}

}
