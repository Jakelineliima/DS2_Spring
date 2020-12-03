package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FornecedorController {
	@GetMapping("/fornecedor")
	public String fornecedor(Model model) {
		List<String> nomes = new ArrayList <>();
		nomes.add("José");
		nomes.add("Maria");
		nomes.add("João");
		nomes.add("Paula");
		model.addAttribute("nomes", nomes);
		return "fornecedor";
	}
}
