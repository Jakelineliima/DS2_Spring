package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import model.Cliente;
import validator.ClienteValidator;

@Controller
public class ClienteController {
	
	@GetMapping("/cadastrarcliente")
	public String cadastrar() {
		return "cadastrarcliente";
	}
	
	@PostMapping("/cadastrarcliente")
	public String efetuarCadastro(@Validated @ModelAttribute("cliente") Cliente c, 
			Model m, BindingResult result) {
		ClienteValidator validator = new ClienteValidator();
		validator.validate(c, result);
		if (result.hasErrors()) {
			return "cadastrarcliente";
		} 
		m.addAttribute("mensagem", "Nome"+ c.getNome());
		return "mensagem";
	}
}
