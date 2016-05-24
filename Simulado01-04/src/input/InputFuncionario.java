package input;

import javax.swing.JOptionPane;

import validators.ValidaFuncionario;

public class InputFuncionario {

	private ValidaFuncionario validador;

	public InputFuncionario() {
		validador = new ValidaFuncionario();
	}

	public Integer lerIdFuncionario() {

		try {

			int idFuncionario = Integer.parseInt(JOptionPane.showInputDialog("Informe o ID do funcionario"));

			if (validador.validarIdFuncionario(idFuncionario)) {
				return idFuncionario;

			} else {
				throw new Exception("Id do Funcionario invalido");
			}

		} catch (Exception e) {
			System.out.println("Erro no Id do funcionario" + e.getMessage());
			return lerIdFuncionario();
		}

	}

	public String lerNomeFuncionario() {

		try {
			String nome = JOptionPane.showInputDialog("Digite o nome do Funcionario");

			if (validador.validarNome(nome)) {
				return nome;
			} else {
				throw new Exception("Nome do funcionario Invalido");
			}

		} catch (Exception e) {
			System.out.println("Erro no nome do Funcionario" + e.getMessage());
			return lerNomeFuncionario();
		}
	}

	public Double lerSalarioFuncionario() {


		try {
			
			Double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o Salario do Funcionario"));

			if (validador.validarSalario(salario)) {
				return salario;
			} else {
				throw new Exception("Salario do funcionario invalido");
			}
		} catch (Exception e) {
			System.out.println("Erro no salario" + e.getMessage());
			return lerSalarioFuncionario();
		}

	}

}
