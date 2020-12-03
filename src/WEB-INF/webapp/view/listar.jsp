<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<jsp:include page="layouttopo.jsp"></jsp:include>
	<div class="row">
		<h3>Listagem de Produto</h3>
	</div>
	<table>
	
			<c:forEach items="${produtos}" var="nome">
			${nome}<br />
		</c:forEach>
	
	
			<c:forEach var="p" items="${produtos}">
				<li>${p.nome()}</li>
			</c:forEach>
	
	</table>	
<jsp:include page="layoutrodape.jsp"></jsp:include>