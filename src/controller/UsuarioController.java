package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import dao.UsuarioDAO;
import model.Usuario;

@Controller
public class UsuarioController {
	
    @GetMapping("login")
    public String loginForm() {
        return "login";
    }
    
    @PostMapping("login")
    public String efetuaLogin(HttpServletRequest req, 
    		HttpSession session) {
    	String login = req.getParameter("login");
    	String senha = req.getParameter("senha");
    	UsuarioDAO dao = new UsuarioDAO();
    	Usuario u = dao.efetuarLogin(login, senha); 
    	if (u != null) {
    		session.setAttribute("usuarioLogado", u.getLogin());
    		return "index";
    	} else {
    		return "redirect:login";
    	}
    }
    
    @GetMapping("logout")
    public String logout(HttpSession session) {
    	session.invalidate();
    	return "redirect:login";
    }    

}
