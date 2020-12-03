<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<jsp:include page="layouttopo.jsp"></jsp:include>
	<div class="row">
	<form:form action="/cadastrarcliente" modelAttribute="cliente">			
		<label for="nome">Nome:</label>
		<input type="text" name="nome" class="form-control mb-3" />
		<form:errors path="nome" cssClass="alerta"/>
		<label for="telefone">Telefone:</label>
		<input type="text" name="telefone" class="form-control mb-3" />
		<form:errors path="telefone" cssClass="alerta"/>	
		<button class="btn btn-outline-success my-2 my-sm-0">Cadastrar</button>
		</form:form>
	</div>
<jsp:include page="layoutrodape.jsp"></jsp:include>