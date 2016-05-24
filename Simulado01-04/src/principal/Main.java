package principal;

import javax.swing.JOptionPane;

import org.omg.CORBA.IdentifierHelper;

import entities.Funcionario;
import input.InputFuncionario;

public class Main {

	public static void main(String[] args) {

		Funcionario f = new Funcionario();
		InputFuncionario inp = new InputFuncionario();
		
		f.setIdFuncionario(inp.lerIdFuncionario());
		f.setNome(inp.lerNomeFuncionario());
		f.setSalario(inp.lerSalarioFuncionario());


		JOptionPane.showMessageDialog(null, f) ;
		
	}

}
