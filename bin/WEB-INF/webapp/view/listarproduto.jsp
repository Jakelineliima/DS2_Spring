<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<jsp:include page="layouttopo.jsp"></jsp:include>
	<div class="row">
		<h3>Listagem de Produto</h3>
	</div>
	<div class="row">
		<table class="table table-striped">
		  <thead>
		    <tr>
		      <th scope="col">Código</th>
		      <th scope="col">Nome</th>
		      <th scope="col">Quantidade</th>
		      <th scope="col">Valor</th>
		      <th scope="col">Alterar</th>
		      <th scope="col">Excluir</th>
		    </tr>
		  </thead>
		  <tbody>
			<c:forEach var="p" items="${produtos}">
			  <tr>
			    <td>${p.getCodigo()}</td>
				<td>${p.getNome()}</td>
				<td>${p.getQuantidade()}</td>
				<td>${p.getValor()}</td>
				<td><a href="/alterarproduto?codigo=${p.getCodigo()}">Alterar</a></td>
				<td><a href="/excluirproduto?codigo=${p.getCodigo()}">Excluir</a></td>
			  </tr>
			</c:forEach>
		  </tbody>
		</table>
	</div>
<jsp:include page="layoutrodape.jsp"></jsp:include>