<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<jsp:include page="layouttopo.jsp"></jsp:include>
	<c:set var="usuario" value="Admin"></c:set>
	<div class="row">
		<h1>Empresa</h1>
	</div>
	<div class="row">
		<p>
			A empresa Desenvolvimento SA é uma instuição que
			tem por propósito desenvolver aplicações Web.
		</p>
	</div>
	<div class="row">
		<h2>Parceiros da Empresa</h2>
	</div>
	<div class="row">
		<c:forEach items="${nomes}" var="nome">
			${nome}<br />
		</c:forEach>
	</div>
	<div class="row">
		<h2>Colaboradores</h2>
	</div>
	<div class="row">
		<c:forEach items="${colaboradores}" var="colaborador">
			${colaborador}<br />
		</c:forEach>
	</div>	
<jsp:include page="layoutrodape.jsp"></jsp:include>