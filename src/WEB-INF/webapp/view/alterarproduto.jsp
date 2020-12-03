<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<jsp:include page="layouttopo.jsp"></jsp:include>
	<div class="row">
		<h3>Alteração de Produto</h3>
	</div>
	<div class="row">	
		<form method="POST" action="/alterarproduto">
			<span>Código: ${produto.getCodigo()}</span>
			<input type="hidden" name="codigo" value="${produto.getCodigo()}" />
			<br />
			<label for="nome">Nome:</label>
			<input type="text" class="form-control" name="nome" value="${produto.getNome()}" />
			<br />
			<label for="quantidade">Quantidade:</label>
			<input type="text" class="form-control" name="quantidade" value="${produto.getQuantidade()}" />
			<br />
			<label for="valor">Valor:</label>
			<input type="text" class="form-control" name="valor" value="${produto.getValor()}" />
			<br />
			<button class="btn btn-success">Alterar</button>
		</form>
	</div>
<jsp:include page="layoutrodape.jsp"></jsp:include>