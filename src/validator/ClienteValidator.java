package validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import model.Cliente;

@Component
public class ClienteValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Cliente.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		Cliente cliente = (Cliente) target;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "nome", "", "Informe o nome!");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "telefone", "", "Informe o telefone!");
		
		if (cliente.getNome().length() < 2) {
			errors.rejectValue("nome", "", "O nome necessita ter 2 caracteres ou mais!");
		}
	}
}
