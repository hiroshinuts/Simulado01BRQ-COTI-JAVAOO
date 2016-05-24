package controls;

import entities.Aluno;
import types.SituacaoAluno;

public class ControleAluno {

	public Double obterMedia(Aluno a) {

		double somatorioNotas = 0.0;

		for (Double nota : a.getNotas()) {
			somatorioNotas += nota;
		}

		return somatorioNotas / a.getNotas().length;
	}

	public SituacaoAluno obterSituacao(Aluno a) {

		double media = obterMedia(a);

		if (media >= 7) {
			return SituacaoAluno.Aprovado;
		} else if (media >= 5) {
			return SituacaoAluno.Recuperacao;
		} else {
			return SituacaoAluno.Reprovado;

		}

	}
}
