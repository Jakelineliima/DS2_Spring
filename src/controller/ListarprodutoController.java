package controller;

import org.springframework.web.bind.annotation.GetMapping;

public class ListarprodutoController {
	
	@GetMapping("/listarproduto")
	public String cadastrarProduto() {
		return "listarproduto";
	}
}
