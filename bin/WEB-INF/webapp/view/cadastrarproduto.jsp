<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<jsp:include page="layouttopo.jsp"></jsp:include>
	<div class="row">
		<h3>Cadastro de Produto</h3>
	</div>
	<div class="row">	
		<form method="POST" action="/cadastrarproduto">
			<label for="nome">Nome:</label>
			<input type="text" class="form-control" name="nome" />
			<br />
			<label for="quantidade">Quantidade:</label>
			<input type="text" class="form-control" name="quantidade" />
			<br />
			<label for="valor">Valor:</label>
			<input type="text" class="form-control" name="valor" />
			<br />
			<button class="btn btn-success">Cadastrar</button>
		</form>
	</div>
<jsp:include page="layoutrodape.jsp"></jsp:include>