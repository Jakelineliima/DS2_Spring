package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import dao.ProdutoDAO;
import model.Produto;

@Controller
public class ProdutoController {

	@GetMapping("/cadastrarproduto")
	public String cadastrarProduto() {
		return "cadastrarproduto";
	}
	
	@PostMapping("/cadastrarproduto")
	public String salvarProduto(HttpServletRequest req, Model m) {
		Produto p = new Produto();
		p.setNome(req.getParameter("nome"));
		p.setQuantidade(Double.parseDouble(req.getParameter("quantidade")));
		p.setValor(Double.parseDouble(req.getParameter("valor")));
		ProdutoDAO dao = new ProdutoDAO();
		String texto = dao.salvar(p);
		m.addAttribute("texto", texto);
		return "mensagem";
	}
	
	@GetMapping("/listarproduto")
	public String listarProdutos(Model m) {
		ProdutoDAO dao = new ProdutoDAO();
		m.addAttribute("produtos", dao.listarTodos());
		return "listarproduto";
	}
	
	@GetMapping("/listarprodutopornome")
	public String listarProdutosPorNome(HttpServletRequest req, Model m) {
		String nomePesquisa = req.getParameter("pesquisa");
		ProdutoDAO dao = new ProdutoDAO();
		m.addAttribute("produtos", dao.getProdutosPorNome(nomePesquisa));
		return "listarproduto";
	}
	
	@GetMapping("/alterarproduto")
	public String alterarProduto(HttpServletRequest req, Model m) {
		if (req.getParameter("codigo").equals("")) {
			m.addAttribute("texto", "Código inválido!");
			return "mensagem";
		}		
		int codigo = Integer.parseInt(req.getParameter("codigo"));
		ProdutoDAO dao = new ProdutoDAO();
		m.addAttribute("produto", dao.getProdutoPorCodigo(codigo));
		return "alterarproduto";
	}
	
	@PostMapping("/alterarproduto")
	public String atualizarProduto(HttpServletRequest req, Model m) {
		int codigo = Integer.parseInt(req.getParameter("codigo"));
		String nome = req.getParameter("nome");
		Double quantidade = Double.parseDouble(req.getParameter("quantidade"));
		Double valor = Double.parseDouble(req.getParameter("valor"));
		Produto p = new Produto();
		p.setCodigo(codigo);
		p.setNome(nome);
		p.setQuantidade(quantidade);
		p.setValor(valor);
		ProdutoDAO dao = new ProdutoDAO();
		m.addAttribute("texto", dao.salvar(p));
		return "mensagem";
	}
	
	@GetMapping("/excluirproduto")
	public String excluirProduto(HttpServletRequest req, Model m) {
		int codigo = Integer.parseInt(req.getParameter("codigo"));
		ProdutoDAO dao = new ProdutoDAO();
		m.addAttribute("texto", dao.excluir(codigo));
		return "mensagem";
	}
}
