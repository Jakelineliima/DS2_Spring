package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class layouttopo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<title>Java Spring MVC </title>\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap/css/bootstrap.css\" />\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/estilos.css\" />\r\n");
      out.write("\t\t<script src=\"js/jquery-3.2.1.slim.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"css/bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<header>\r\n");
      out.write("\t\t\t<nav class=\"navbar navbar-expand-md navbar-dark fixed-top bg-dark\">\r\n");
      out.write("\t\t\t\t<a class=\"navbar-brand\" href=\"#\">Spring MVC</a>\r\n");
      out.write("\t\t\t\t<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarCollapse\" aria-controls=\"navbarCollapse\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("\t\t\t\t\t<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t<div class=\"collapse navbar-collapse\" id=\"navbarCollapse\">\r\n");
      out.write("\t\t\t\t\t<ul class=\"navbar-nav mr-auto\">\r\n");
      out.write("\t\t\t\t\t\t<li class=\"nav-item active\">\r\n");
      out.write("\t\t\t\t\t\t\t<a class=\"nav-link\" href=\"/index\">Home</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"nav-item\">\r\n");
      out.write("\t\t\t\t\t\t\t<a class=\"nav-link\" href=\"/empresa\">Empresa</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"nav-item\">\r\n");
      out.write("\t\t\t\t\t\t\t<a class=\"nav-link\" href=\"/contato\">Contato</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t \t\t\t\t    <li class=\"nav-item dropdown\">\r\n");
      out.write("\t\t\t\t\t        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("\t\t\t\t\t            Produto\r\n");
      out.write("\t\t\t\t\t        </a>\r\n");
      out.write("\t\t\t\t\t        <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("\t\t\t\t\t            <a class=\"dropdown-item\" href=\"/cadastrarproduto\">Cadastrar</a>\r\n");
      out.write("\t\t\t\t\t            <a class=\"dropdown-item\" href=\"/listarproduto\">Listar</a>\r\n");
      out.write("\t\t\t\t\t            <div class=\"dropdown-divider\"></div>\r\n");
      out.write("\t\t\t\t\t        </div>\r\n");
      out.write("\t\t\t\t\t    </li>\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t<form class=\"form-inline mt-2 mt-md-0\" action=\"/listarprodutopornome\" method=\"GET\">\r\n");
      out.write("\t\t\t\t\t\t<input class=\"form-control mr-sm-2\" type=\"text\" name=\"pesquisa\" placeholder=\"Pesquisar\" aria-label=\"Pesquisar\">\r\n");
      out.write("\t\t\t\t\t\t<button class=\"btn btn-outline-success my-2 my-sm-0\" type=\"submit\">Pesquisar</button>\r\n");
      out.write("\t\t\t\t\t</form>\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</nav>\r\n");
      out.write("\t\t\t<div class=\"logo\">\r\n");
      out.write("\t\t\t\t<img src=\"imagens/spring.png\" />\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</header>\r\n");
      out.write("\t\t<main>\r\n");
      out.write("\t\t\t<div class=\"container\">");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
