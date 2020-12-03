package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import model.INome;

@Controller
public class IndexController {
	
	@Autowired
	private INome listaNomes;

	@GetMapping("/index")
	public String index(Model model) {
		model.addAttribute("listaNomes", listaNomes);
		return "index";
	}
}
