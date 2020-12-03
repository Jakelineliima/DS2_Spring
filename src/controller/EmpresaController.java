package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmpresaController {

	@GetMapping("/empresa")
	public String empresa(Model model) {
		List<String> nomes = new ArrayList<>();
		List<String> colaboradores = new ArrayList<>();
		
		nomes.add("Empresa ABC");
		nomes.add("Empresa DEF");
		nomes.add("Empresa GHI");
		nomes.add("Empresa XYZ");
		
		colaboradores.add("José Lopes");
		colaboradores.add("Benedita Silva");
		
		model.addAttribute("nomes", nomes);
		model.addAttribute("colaboradores", colaboradores);
		return "empresa";
	}
}
