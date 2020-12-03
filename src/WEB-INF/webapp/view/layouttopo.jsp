<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Java Spring MVC </title>
		<link rel="stylesheet" type="text/css" href="css/bootstrap/css/bootstrap.css" />
		<link rel="stylesheet" type="text/css" href="css/estilos.css" />
		<script src="js/jquery-3.2.1.slim.min.js"></script>
		<script src="css/bootstrap/js/bootstrap.min.js"></script>
	</head>
	<body>
		<header>
			<nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
				<a class="navbar-brand" href="#">Spring MVC</a>
				<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarCollapse" aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse" id="navbarCollapse">
					<ul class="navbar-nav mr-auto">
						<li class="nav-item active">
							<a class="nav-link" href="/index">Home</a>
						</li>
						<li class="nav-item">
							<a class="nav-link" href="/empresa">Empresa</a>
						</li>
						<li class="nav-item">
							<a class="nav-link" href="/contato">Contato</a>
						</li>
	 				    <li class="nav-item dropdown">
					        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
					            Produto
					        </a>
					        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
					            <a class="dropdown-item" href="/cadastrarproduto">Cadastrar</a>
					            <a class="dropdown-item" href="/listarproduto">Listar</a>
					            <div class="dropdown-divider"></div>
					        </div>
					    </li>						
					</ul>
					<form class="form-inline mt-2 mt-md-0" action="/listarprodutopornome" method="GET">
						<input class="form-control mr-sm-2" type="text" name="pesquisa" placeholder="Pesquisar" aria-label="Pesquisar">
						<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Pesquisar</button>
					</form>					
				</div>
			</nav>
			<div class="logo">
				<img src="imagens/spring.png" />
			</div>
		</header>
		<main>
			<div class="container">