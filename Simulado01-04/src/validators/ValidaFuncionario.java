package validators;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidaFuncionario {

	public boolean validarIdFuncionario(Integer idFuncionario) {
		return idFuncionario > 0;
	}

	public boolean validarNome(String nome) {

		Pattern p = Pattern.compile("^[A-Za-zÀ-Üà-ü0-9\\s]{3,30}$");
		Matcher m = p.matcher(nome);

		return m.matches();
	}

	public boolean validarSalario(Double salario) {
		return salario > 0;

	}
	
}
